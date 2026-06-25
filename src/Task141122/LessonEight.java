package Task141122;

import java.util.Scanner;

/**
 * 35. Напишите программу на Java для вычисления площади многоугольника.
 */
public class LessonEight {
    public static void main(String[] args) {
        System.out.println("Введите колличество сторон: ");
        Scanner scanner = new Scanner(System.in);
        double side = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.print("The area of the hexagon is: " + hexagonArea(side, height)+"\n");

    }

    public static double hexagonArea(double side, double height) {
        return (side*(height*height))/(4*Math.tan(Math.PI/side));
    }
}
