package practice.practice2;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueLesson {
    public static void main(String[] args) {
        String n = "ccrww";
        System.out.println(firstUnique(n));
    }

    public static Character firstUnique(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character n : str.toCharArray()) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return null;
    }
    //Time Complexity = O(n)
    //Space Complexity = O(n)
}
