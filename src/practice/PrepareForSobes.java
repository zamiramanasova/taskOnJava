package practice;

import java.util.ArrayList;
import java.util.List;

public class PrepareForSobes {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();

        list.add(new Car("audi", 20));
        list.add(new Car("bmv", 15));
        list.add(new Car("tayota", 25));
        list.add(new Car("mazda", 35));
        list.add(new Car("kia", 40));

        List<Car> cars = list.stream()
                .filter(a -> a.getAge() > 30)
                .toList();

        System.out.println(cars);



    }
}
