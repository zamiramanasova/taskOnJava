package Task141122;

import java.util.Scanner;

/**
 * 11. Напишите Java-программу для печати области и периметра круга.
 *
 * 12.
 * Напишите программу на Java, которая принимает три числа
 * в качестве входных данных для вычисления и печати среднего числа.
 *
 * 13. Напишите Java-программу для печати площади и
 * периметра прямоугольника.
 */
public class LessonThree {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number1 = scanner.nextInt();
//        int number2 = scanner.nextInt();
//        int number3 = scanner.nextInt();
//        int sum = number1 + number2 + number3;
//        System.out.println(sum/3);

//        System.out.println("Введите радиус: ");
//        Scanner scanner = new Scanner(System.in);
//        int radius = scanner.nextInt();
//        double area = Math.PI * (radius * radius);
//        System.out.println("Area is: " + area);
//        double circumference = Math.PI * 2 * radius;
//        System.out.println("Circumference is: " + circumference);

        System.out.println("Введите площадь: ");
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        System.out.println("Введите площадь: ");
        double height = scanner.nextDouble();
        double area = width * height;
        System.out.println("Area is: " + area);
        double perimeter = 2 * (width + height);
        System.out.println("Perimeter is: " + perimeter);
    }
}
