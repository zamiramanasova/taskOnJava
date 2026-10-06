package practice;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateLesson {

    public static void main(String[] args) {
        String[] s = {"java", "java", "wor", "wor", "rap"};
        System.out.println(dupDelete(s));
    }

    public static Map<String, Integer> dupDelete(String[] words) {

        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        return map;
    }
}
