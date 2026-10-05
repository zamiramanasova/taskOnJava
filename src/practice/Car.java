package practice;

import java.util.Collections;
import java.util.List;

class Car {
    private String name;
    private int age;
    private List<String> parts;

    public Car(String name, int age, List<String> parts) {
        this.name = name;
        this.age = age;
        this.parts = parts;
    }

    public List<String> getParts() { return parts; }

    public void setParts(String parts) {
        this.parts = Collections.singletonList(parts);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", parts=" + parts +
                '}';
    }
}
