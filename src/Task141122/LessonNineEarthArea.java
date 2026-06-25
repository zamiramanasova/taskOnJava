package Task141122;

import java.util.Scanner;

import static java.lang.Math.sin;

/**
 * 36. Напишите программу на Java, чтобы вычислить
 * расстояние между двумя точками на поверхности земли.
 */
public class LessonNineEarthArea {
    public static void main(String[] args) {
        System.out.println("Введите широту latitude  координаты 1: ");
        Scanner scanner = new Scanner(System.in);
        double lat1 = scanner.nextDouble();
        System.out.println("Введите долготу longitude координаты 1: ");
        double lon1 = scanner.nextDouble();
        System.out.println("Введите широту latitude координаты 2: ");
        double lat2 = scanner.nextDouble();
        System.out.println("Введите долготу longitude координаты 2: ");
        double lon2 = scanner.nextDouble();
        System.out.print("The area of the hexagon is: " + distance_Between_LatLong(lat1, lon1, lat2, lon2)+"\n");

    }

    private static double distance_Between_LatLong(double lat1,double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);//нужна сначала конвертация в радиансы
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        double earthRadius = 6371.01; //Kilometers
        //Math.acos() возвращает арккосинус указанного в радианах double значения.
        return earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));
    }
}
