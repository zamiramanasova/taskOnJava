package Task141122;

import java.util.Scanner;

/**
 * 38. Напишите программу на Java для подсчета букв, пробелов,
 * чисел и других символов входной строки.
 */
public class Lesson38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        counters(text);
    }
    public static void counters(String text) {
        int letter = 0, probel = 0, number = 0, different = 0; //инициализация
        char[] count = text.toCharArray(); //текст становится чаром
        for(int i = 0; i < count.length; i++) { //чар будет итерироваться
            if(count[i] >= 'a' && count[i] <= 'z' || count[i] >= 'A' && count[i] <= 'Z') { //если есть символ в промежутке алфавитных букв
                letter++; //то буква сумируется (инт)
            } else if (count[i] >= '0' && count[i] <= '9') { //иначе если есть символ в промежутке от 0 до 9
                number++; //то суммируется цифра
            } else if (count[i] == ' ') { //иначе если есть пробел
                probel++;//суммируется пробел
            } else {
                different++;//иначе остальные знаки суммируются
            }
        }
        int sum = letter + probel + number + different;
        System.out.println("Letters: " + letter);
        System.out.println("Probels: " + probel);
        System.out.println("Numbers: " + number);
        System.out.println("Different: " + different);//вывод
    }
}
