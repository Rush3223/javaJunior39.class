package as;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SaperField {
    private int[][] fieldWithMins; // оставляем данное поле пустым, т.к. не знаем сколько ячеек будет
    private int countMins = 0;

    public SaperField(String level) {
        if (level.equals("1") || level.equalsIgnoreCase("Новичок")) {
            fieldWithMins = new int[9 + 2][9 + 2];
            countMins = 10;
        }
        if (level.equals("2") || level.equalsIgnoreCase("Любитель")) {
            fieldWithMins = new int[16 + 2][16 + 2];
            countMins = 40;
        }
        if (level.equals("3") || level.equalsIgnoreCase("Профессионал")) {
            fieldWithMins = new int[16 + 2][32 + 2];
            countMins = 99;
        }
        if (level.equals("4") || level.equalsIgnoreCase("Особый")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество колонок");
            int row = scanner.nextInt();
            System.out.println("Введите количество столбцов");
            int col = scanner.nextInt();
            System.out.println("Введите количество мин");
            int countMins = scanner.nextInt();

            int square = (row) * (col);
            if (countMins > square) {
                System.out.println("Количество мин не должно превышать " + square);
                System.out.println("Попробуйте ещё раз");

                countMins = scanner.nextInt();


            }
            this.countMins = countMins;
            fieldWithMins = new int[row + 2][col + 2];


        }
    }

    public void addRandomMins() {
        for (int i = 0; i < countMins; i++) {
            int row = ThreadLocalRandom.current().nextInt(1, fieldWithMins.length - 1);
            int col = ThreadLocalRandom.current().nextInt(1, fieldWithMins[0].length - 1);
            if (fieldWithMins[row][col] != -1) {
                fieldWithMins[row][col] = -1;
            } else {
                i--;
            }

        }
    }

    public void countAndAddNums() {
        for (int i = 0; i < fieldWithMins.length; i++) {
            for (int j = 0; j < fieldWithMins[0].length; j++) {
                if (fieldWithMins[i][j] == -1) {
                    if (fieldWithMins[i - 1][j - 1] != -1) {
                        fieldWithMins[i - 1][j - 1] = fieldWithMins[i - 1][j] + 1;
                    }
                    if (fieldWithMins[i - 1][j + 1] != -1) {
                        fieldWithMins[i - 1][j + 1] = fieldWithMins[i - 1][j + 1] + 1;

                    }
                    if (fieldWithMins[i + 1][j + 1] != -1) {
                        fieldWithMins[i + 1][j + 1] = fieldWithMins[i + 1][j + 1] + 1;

                    }
                    if (fieldWithMins[i][j - 1] != -1) {
                        fieldWithMins[i][j - 1] = fieldWithMins[i][j - 1] + 1;

                    }
                    if (fieldWithMins[i + 1][j - 1] != -1) {
                        fieldWithMins[i + 1][j - 1] = fieldWithMins[i + 1][j - 1] + 1;

                    }
                    if (fieldWithMins[i + 1][j] != -1) {
                        fieldWithMins[i + 1][j] = fieldWithMins[i + 1][j] + 1;

                    }
                    if (fieldWithMins[i][j + 1] != -1) {
                        fieldWithMins[i][j + 1] = fieldWithMins[i][j + 1] + 1;

                    }
                    if (fieldWithMins[i - 1][j] != -1) {
                        fieldWithMins[i - 1][j] = fieldWithMins[i - 1][j] + 1;
                    }


                }
            }


        }
    }
}
