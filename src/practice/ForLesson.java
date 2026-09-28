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
    }

}

class Car {
    String name;

    public Car(String name) {
        this.name = name;
    }
}
