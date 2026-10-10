package practice.practice0910;

import java.util.*;
import java.util.stream.Collectors;

public class StreamLesson {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> nums = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();

        System.out.println(nums);
        System.out.println("===========");

        List<Integer> numbers2 = List.of(5, 2, 8, 2, 1, 5, 9, 3, 8);
        List<Integer> ns = numbers2.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println(ns);

        List<String> names = List.of(
                "Anna", "Bob", "Alexander", "Tom", "Andrew", "Kate"
        );

        List<String> newS = names.stream()
                .filter(s -> s.startsWith("A"))
                .filter(s -> s.length() > 4)
                .sorted(Comparator.comparing(String::length))
                .toList();

        System.out.println(newS);

        Optional<String> newS1 = names.stream()
                        .max(Comparator.comparing(String::length));
        System.out.println(newS1);

        List<Integer> numbers3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int newS3 = numbers3.stream()
                .filter(n -> n % 2 == 0)
                .reduce(Integer::sum)
                .orElse(0);
        System.out.println(newS3);

        List<Integer> sumOfNums = List.of(1, 2, 3, 4, 5);
        Optional<Integer> numbs = sumOfNums.stream()
                .reduce((a ,b) -> a * b );

        System.out.println(numbs);

        List<List<Integer>> numberFlatMap = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6)
        );

        List<Integer> listFlatMap = numberFlatMap.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(listFlatMap);

        List<String> namesCount = List.of(
                "Anna", "Bob", "Anna", "Tom", "Bob", "Anna"
        );

        Map<String, Long> listOfNames = namesCount.stream()
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()));

        System.out.println(listOfNames);

        List<String> fruits = List.of(
                "apple", "banana", "apple", "orange",
                "banana", "apple", "orange", "orange"
        );
        Map<String, Long> mapFruits = fruits.stream()
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()));

        System.out.println(mapFruits);

    }
}
