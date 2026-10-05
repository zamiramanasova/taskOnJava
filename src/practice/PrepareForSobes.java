package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PrepareForSobes {
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



    }
}
