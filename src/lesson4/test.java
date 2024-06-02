package lesson4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class test {
    public static void main(String[] args) {
        System.out.println("Выберите уровень");
        System.out.println("Новичок");
        System.out.println("Любитель");
        System.out.println("Профессионал");
        System.out.println("Особый");

        // Формула создания ссылочного типа
        Scanner scanner = new Scanner(System.in);
        String level = scanner.next();


        if (level.equalsIgnoreCase("Профессионал")) {

            int a = 30;
            int b = 16;

            int[][] field = new int[a][b];
            for (int i = 0; i < 99; i++) {
                // нужно поставить рандомно 1 мину
                int row = ThreadLocalRandom.current().nextInt(0, 30);
                int col = ThreadLocalRandom.current().nextInt(0, 16);

                if (field[row][col] != 0) {
                    i--;
                } else {
                    field[row][col] = 1;
                }


            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();

            }
        }
    }
}
