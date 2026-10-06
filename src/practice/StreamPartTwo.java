package practice;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPartTwo {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();

        list.add(new Car("audi", 20, List.of("мотор", "колёса")));
        list.add(new Car("bmv", 15, List.of("фары", "руль")));
        list.add(new Car("tayota", 25, List.of("мотор", "фары")));
        list.add(new Car("mazda", 35, List.of("колёса", "руль", "фары")));
        list.add(new Car("audi", 20, List.of("мотор", "колёса")));
        list.add(new Car("djip", 20, List.of("мотор", "колёса")));
        list.add(new Car("honda", 50, List.of("мотор", "колёса")));

        List<Car> cars = list.stream()
                .filter(n -> n.getName().equals("audi"))
                .toList();

        System.out.println(cars);

        List<String> flatMap = list.stream()
                .flatMap(c -> c.getParts().stream())
                .toList();

        System.out.println(flatMap);

        Set<Car> sortedList = list.stream()
                .sorted(Comparator.comparing(Car::getName))
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(sortedList);

        long countCar = list.stream()
                .filter(e -> e.getAge() > 20)
                .count();

        System.out.println(countCar);

        Optional<Car> c = list.stream()
                .min(Comparator.comparingInt(Car::getAge));

        Optional<Car> c1 = list.stream()
                .max(Comparator.comparing(Car::getAge));
        System.out.println("====");
        System.out.println(c);
        System.out.println(c1);

        Map<Integer, List<Car>> carss = list.stream()
                .collect(Collectors.groupingBy(Car::getAge));
        System.out.println(carss);

        List<Car> unique = list.stream()
                .distinct()
                .sorted(Comparator.comparing(Car::getName))
                .toList();
        System.out.println("====");
        System.out.println(unique);

        boolean has = list.stream()
                .noneMatch(h -> h.getName().equals("aaa"));
        System.out.println(has);

        boolean has2= list.stream()
                .anyMatch(h -> h.getAge() == 200);
        System.out.println(has2);

        int sum = list.stream()
                .mapToInt(Car::getAge)
                .sum();
        System.out.println(sum);

        double average = list.stream()
                .mapToInt(Car::getAge)
                .average().orElse(0);
        System.out.println(average);

        List<Car> name = cars.stream()
                .sorted(Comparator.comparing(Car::getAge).reversed())
                .limit(3)
                .toList();
    }
}
