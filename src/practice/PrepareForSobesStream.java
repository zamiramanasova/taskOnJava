package practice;

import java.util.*;
import java.util.stream.Collectors;

public class PrepareForSobesStream {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();

        list.add(new Car("audi", 20, List.of("мотор", "колёса")));
        list.add(new Car("bmv", 15, List.of("фары", "руль")));
        list.add(new Car("tayota", 25, List.of("мотор", "фары")));
        list.add(new Car("mazda", 35, List.of("колёса", "руль", "фары")));
        list.add(new Car("audi", 20, List.of("мотор", "колёса")));

        List<String> cars = list.stream()
                .filter(a -> a.getAge() > 30)
                .flatMap(a -> a.getParts().stream())
                .toList();

        System.out.println(cars);


        List<Car> example = list.stream()
                .sorted(Comparator.comparingInt(Car::getAge))
                .toList();

        System.out.println(example);

        List<String> a = list.stream()
                .map(Car::getName)
                .distinct()
                .toList();

        System.out.println(a);

        boolean has = list.stream()
                .anyMatch(e -> e.getAge() > 38);
        System.out.println(has);

        boolean has2 = list.stream()
                .allMatch(e -> e.getAge() > 38);
        System.out.println(has2);

        boolean has3 = list.stream()
                .noneMatch(e -> e.getAge() > 38);
        System.out.println(has3);

        Optional<Car> result = list.stream()
                .filter(e -> e.getAge() > 20)
                .findFirst();

        System.out.println(result);

        Optional<Car> r = list.stream()
                .filter(d -> d.getAge() < 30)
                .findAny();
        System.out.println(r);

        Optional<Car> qwerty = list.stream()
                .min(Comparator.comparing(Car::getAge));
        System.out.println(qwerty);

        long counting = list.stream()
                .filter(e -> e.getAge() >= 20)
                .count();
        System.out.println(counting);

        Map<Integer, List<Car>> group = list.stream()
                .collect(Collectors.groupingBy(Car::getAge));
        System.out.println(group);

        Map<String, List<Car>> group2 = list.stream()
                .collect(Collectors.groupingBy(Car::getName));
        System.out.println(group2);

        Set<Car> ex = list.stream()
                .collect(Collectors.toSet());

        System.out.println(ex);

        System.out.println("============");
        list.stream()
                .map(Car::getName)
                .forEach(System.out::println);

        List<String> ex2 = list.stream()
                .filter(e -> e.getAge() > 20)
                .filter(e -> "mazda".equals(e.getName()))
                .map(Car::getName)
                .distinct()
                .sorted()
                .toList();
        System.out.println(ex2);
    }
}
