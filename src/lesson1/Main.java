package lesson1;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        // ** ХЗ на сколько нужно сильно птимизировать но есть такой принцып DRY - DO NOT REPEAT YOURSELF
        // ** Вот этот кусок кода по хорошему нужно вынести в отдельный метод т.к. он повторяется из раза в раз


        /*
                int row = ThreadLocalRandom.current().nextInt(0, 16);
                int col = ThreadLocalRandom.current().nextInt(0, 16);

                if (field[row][col] != 0) {
                    i--;
                } else {
                    field[row][col] = 1;
                }
         */

        System.out.println("Выберите уровень");
        System.out.println("Новичок");
        System.out.println("Любитель");
        System.out.println("Профессионал");
        System.out.println("Особый");

        // Формула создания ссылочного типа
        Scanner scanner = new Scanner(System.in);
        String level = scanner.next();

        if (level.equalsIgnoreCase("Новичок")) {
            int[][] field = new int[9][9];
            for (int i = 0; i < 10; i++) {
                // нужно поставить рандомно 1 мину
                int row = ThreadLocalRandom.current().nextInt(0, 9);
                int col = ThreadLocalRandom.current().nextInt(0, 9);

                if (field[row][col] != 0) {
                    i--;
                } else {
                    field[row][col] = 1;
                }
            }


            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    System.out.print(field[i][j] + " ");   // * Этот символ можно вынести как переменную т.к. он тоже используется много раз
                }
                System.out.println();
            }
        }

        if (level.equalsIgnoreCase("Профессионал")) {

            int height = 30;
            int width = 16;

            int[][] field = new int[height][width];
            for (int i = 0; i < 99; i++) {

                int row = ThreadLocalRandom.current().nextInt(0, height);
                int col = ThreadLocalRandom.current().nextInt(0, width);

                if (field[row][col] != 0) {
                    i--;
                } else {
                    field[row][col] = 1;
                }


            }
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();

            }
        }
        if (level.equalsIgnoreCase("Любитель")) {
            int[][] field = new int[16][16];
            for (int i = 0; i < 40; i++) {

                int row = ThreadLocalRandom.current().nextInt(0, 16);
                int col = ThreadLocalRandom.current().nextInt(0, 16);

                if (field[row][col] != 0) {
                    i--;
                } else {
                    field[row][col] = 1;
                }
            }
            for (int[] ints : field) {            // ** Можно заменить на так:  for (int[] ints : field) {
                for (int j = 0; j < field.length; j++) {
                    System.out.print(ints[j] + " ");
                }
                System.out.println();
            }
        }
        if (level.equalsIgnoreCase("Особый")) {
            System.out.println("Укажите длину");
            int sizeHeight = scanner.nextInt();

            System.out.println("Укажите ширину");
            int sizeWidth = scanner.nextInt();

            int square = sizeHeight * sizeWidth;

            System.out.println("Укажите количество мин");
            int sizeMines = scanner.nextInt();

            if (sizeMines > square) {
                System.out.println("Количество мин не должно превышать" + " " + square);
                System.out.println("Попробуйте ещё раз");

                int sizeMines2 = scanner.nextInt();
                sizeMines = sizeMines2;
            }

            int[][] field = new int[sizeHeight][sizeWidth];
            for (int i = 0; i < sizeMines; i++) {

                int row = ThreadLocalRandom.current().nextInt(0, sizeHeight);
                int col = ThreadLocalRandom.current().nextInt(0, sizeWidth);

                if (field[row][col] != 0) {
                    i--;
                } else {
                    field[row][col] = 1;
                }
            }
            for (int i = 0; i < sizeHeight; i++) {
                for (int j = 0; j < sizeWidth; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
        }

    }

}





