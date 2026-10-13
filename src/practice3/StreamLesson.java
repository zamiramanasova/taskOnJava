package practice3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLesson {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> nums = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                        .toList();

        System.out.println(nums);

        List<Integer> numbers2 = List.of(5, 2, 8, 2, 1, 5, 9, 3, 8);

        List<Integer> nums2 = numbers2.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println(nums2);

        List<String> names = List.of(
                "Anna", "Bob", "Alexander", "Tom", "Andrew", "Kate"
        );

        List<String> nums3 = names.stream()
                .filter(n -> n.startsWith("A"))
                .filter(n -> n.length() > 4)
                .sorted(Comparator.comparing(String::length))
                .toList();

        System.out.println(nums3);

        List<String> names4 = List.of(
                "Anna", "Bob", "Alexander", "Tom", "Andrew", "Kate", "Alex"
        );

        Optional<String> nums4 = names4.stream()
                .max(Comparator.comparing(String::length));

        System.out.println(nums4);

        List<Integer> numbers5 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Optional<Integer> nums5 = numbers5.stream()
                .filter(n -> n % 2 == 0)
                .reduce((a, b) -> a + b);

        System.out.println(nums5);

        List<Integer> numbers6 = List.of(1, 2, 3, 4, 5);

        Optional<Integer> nums6 = numbers6.stream()
                .reduce((a, b) -> a * b);

        System.out.println(nums6);

        List<List<Integer>> numbers7 = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6)
        );

        List<Integer> nums7 = numbers7.stream()
                .flatMap(Collection::stream)
                .toList();

        System.out.println(nums7);

        List<String> names8 = List.of(
                "Anna", "Bob", "Anna", "Tom", "Bob", "Anna"
        );

        Map<String, Long> nums8 = names8.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(nums8);


    }
}
