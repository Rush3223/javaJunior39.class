package lesson4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Home2 {
     public static void main(String[] args) {
        System.out.println("Выберите уровень");
        System.out.println("1 - Новичок");
        System.out.println("2 - Любитель");
        System.out.println("3 - Профессионал");
        System.out.println("4 - Особый");

        // Формула создания ссылочного типа
        Scanner scanner = new Scanner(System.in);
        String level = scanner.nextLine();

        if (level.equalsIgnoreCase("Новичок") || level.equals("1")) {
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
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();

            }

        }
        if (level.equalsIgnoreCase("Профессионал") || level.equals("3")) {

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
        if (level.equalsIgnoreCase("Любитель") || level.equals("2")) {
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
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
        }
        if (level.equalsIgnoreCase("Особый") || level.equals("4")) {

            System.out.println("Укажите длину");
            Scanner height = new Scanner(System.in);
            int sizeHeight = scanner.nextInt();

            System.out.println("Укажите ширину");
            Scanner width = new Scanner(System.in);
            int sizeWidth = scanner.nextInt();

            int square = sizeHeight * sizeWidth;

            System.out.println("Укажите количество мин");
            Scanner mines = new Scanner(System.in);
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
                    field[row][col] = -1;
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