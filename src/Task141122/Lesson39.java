package Task141122;


/**
 * 39. Напишите программу на Java для создания и отображения
 * уникального трехзначного числа, используя 1, 2, 3, 4.
 * Также подсчитайте, сколько существует трехзначных чисел.
 */
public class Lesson39 {
    public static void main(String[] args) {
        int amount = 0;
        for (int i = 1; i <= 4 ; i++) {//цикл считает от 1, входные данные 4 (столько раз итерироваться)
            for (int j = 1; j <=4 ; j++) {
                for (int k = 1; k <=4 ; k++) {
                    if (k != i && k != j && i != j) {
                        amount++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println("Total number of the three is " + amount);
    }
}
