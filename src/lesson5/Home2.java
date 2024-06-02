package lesson5;

import java.util.Scanner;

public class Home2 {
    public static void main(String[] args) {
        /** Программа будет просить пользователя ввести с консоли фигуру
         * (треугольник, квадрат, овал, круг, трапеция)
         * Потом мы пользователя просим ввести нужные данные о фигуре
         * (сторона, высота и т.д.) И на основании введенных данных
         * печатаем на консоль площадь и периметр.
         */

        System.out.println("Введите фигуру:");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Квадрат");
        System.out.println("3 - Овал");
        System.out.println("4 - Круг");
        System.out.println("5 - Трапеция");

        Scanner scanner = new Scanner(System.in);
        String inputFigure = scanner.next();

        if (inputFigure.equalsIgnoreCase("1") || inputFigure.equalsIgnoreCase("Треугольник")) {

            System.out.println("Введите сторону а");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b");
            int b = scanner.nextInt();

            System.out.println("Введите сторону c");
            int c = scanner.nextInt();

            MathUtils.squartTriangle(a, b, c);
            int result = MathUtils.perimetrTriangle(a, b, c);
            System.out.println("Периметр равен" + " " + result);
        }


    }
}
