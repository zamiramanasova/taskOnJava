package practice;

import java.util.ArrayList;
import java.util.List;

public class ForLesson {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("audi", 20, List.of("мотор", "колёса")));
        list.add(new Car("bmv", 15, List.of("фары", "руль")));
        list.add(new Car("tayota", 25, List.of("мотор", "фары")));
        list.add(new Car("mazda", 35, List.of("колёса", "руль", "фары")));
        list.add(new Car("kia", 40, List.of("мотор", "фары")));

        list.stream()
                .map(Car::getName)
                .toList();
        System.out.println(list);
        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.set(1, new Car("VOLGA", 30, List.of("мотор", "колёса"))));
        System.out.println(list.get(1));
        System.out.println(list.remove(4));
        System.out.println(list.size());
        System.out.println(list.contains(new Car("VOLGA", 30, List.of("мотор", "колёса"))));
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(new Car("mazda", 30, List.of("мотор", "колёса")))); // возвратит -1 так как equals не переопределен===
        for (Car array : list) {
            System.out.println(array);
        }
    }
}
