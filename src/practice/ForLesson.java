package practice;

import java.util.ArrayList;
import java.util.List;

public class ForLesson {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("audi", 20));
        list.add(new Car("bmv", 15));
        list.add(new Car("tayota", 25));
        list.add(new Car("mazda", 35));
        list.add(new Car("kia", 40));

        list.stream()
                .map(Car::getName)
                .toList();
        System.out.println(list);
        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.set(1, new Car("VOLGA", 30)));
        System.out.println(list.get(1));
        System.out.println(list.remove(4));
        System.out.println(list.size());
        System.out.println(list.contains(new Car("VOLGA", 30)));
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(new Car("mazda", 30))); // возвратит -1 так как equals не переопределен===
        for (Car array : list) {
            System.out.println(array);
        }
    }
}
