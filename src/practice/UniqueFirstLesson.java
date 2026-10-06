package practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueFirstLesson {
    public static void main(String[] args) {

    }

    public static int uniqieFirst(int[] numbers) {
        Map<Integer, Integer> count = new LinkedHashMap<>();

        for (int num : numbers) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            //Если число уже есть в мапе — увеличиваем счётчик на 1.
            //Если нет — getOrDefault(number, 0) вернёт 0, и мы записываем 1.
        }

        for (Map.Entry<Integer,Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        //entrySet() даёт все пары в порядке добавления (благодаря LinkedHashMap).
        //Проверяем value == 1 — если число встретилось один раз.
        //Возвращаем его key — само число.
        return -1;
    }
}
