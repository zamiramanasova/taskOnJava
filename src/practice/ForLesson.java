package practice;

import java.util.ArrayList;
import java.util.List;

public class ForLesson {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("audi"));
        list.add(new Car("bmv"));
        list.add(new Car("tayota"));
        list.add(new Car("mazda"));
        list.add(new Car("kia"));
        System.out.println(list.get(1));
        System.out.println(list.set(1, new Car("VOLGA")));
        System.out.println(list.get(1));
        System.out.println(list.remove(4));
        System.out.println(list.size());
        System.out.println(list.contains(new Car("VOLGA")));
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(new Car("mazda"))); // возвратит -1 так как equals не переопределен
        for (Car array : list) {
            System.out.println(array);
        }
    }
}

class Car {
    String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

}
