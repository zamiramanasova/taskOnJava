package practiceFour;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueLesson {
    public static void main(String[] args) {

        String word = "swiss";
        System.out.println(firstUnique(word));
    }

    public static Character firstUnique(String word) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character n : word.toCharArray()) {
               map.put(n, map.getOrDefault(n,0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return null;
    }
    // T O(n)
    // S O(n)
}
