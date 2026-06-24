package Task141122;

import java.util.Scanner;

/**
 * 31. Напишите программу на Java, чтобы проверить, установлена ли Java на вашем компьютере.
 */
public class LessonAboutVersionJava {
    public static void main(String[] args) {
//        System.out.println("\nJava Version: " + System.getProperty("java.version"));
//        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
//        System.out.println("Java Home: " + System.getProperty("java.home"));
//        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
//        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
//        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");

        /**
         * 32. Напишите программу на Java для сравнения двух чисел.
         */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < b)
            System.out.println(a + " " + " < " +  b);
        if (a > b)
            System.out.println(a + " " + " > " +  b);
        if (a == b)
            System.out.println(a + " " + " == " +  b);
        if (a != b)
            System.out.println(a + " " + " != " +  b);
        if (a <= b)
            System.out.println(a + " " + " <= " +  b);
        if (a >= b)
            System.out.println(a + " " + " >= " +  b);
    }
}
