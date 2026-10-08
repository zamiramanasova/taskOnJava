package practice.practice0910;

import java.util.List;

public class StreamLesson {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> nums = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();

        System.out.println(nums);

        List<Integer> numbers2 = List.of(5, 2, 8, 2, 1, 5, 9, 3, 8);
        List<Integer> ns = numbers2.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println(ns);
    }


}
