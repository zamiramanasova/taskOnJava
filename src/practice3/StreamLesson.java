package practice3;

import java.util.List;

public class StreamLesson {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> nums = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                        .toList();

        System.out.println(nums);
    }
}
