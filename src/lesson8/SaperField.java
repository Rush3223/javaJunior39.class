package lesson8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SaperField {
    private int[][] fieldWithMins; // оставляем данное поле пустым, т.к. не знаем сколько ячеек будет
    private int countMins = 0;
    private boolean[][] fieldToOpen;
    private int countClosedCellsToWin = 0;

    public SaperField(String level) {
        if (level.equals("1") || level.equalsIgnoreCase("Новичок")) {
            fieldWithMins = new int[9 + 2][9 + 2];
            fieldToOpen = new boolean[9 + 2][9 + 2];
            countMins = 10;
            countClosedCellsToWin = countMins + (9 * 4 + 4);
        }
        if (level.equals("2") || level.equalsIgnoreCase("Любитель")) {
            fieldWithMins = new int[16 + 2][16 + 2];
            fieldToOpen = new boolean[16 + 2][16 + 2];
            countMins = 40;
            countClosedCellsToWin = countMins + (16 * 4 + 4);
        }
        if (level.equals("3") || level.equalsIgnoreCase("Профессионал")) {
            fieldWithMins = new int[16 + 2][32 + 2];
            fieldToOpen = new boolean[16 + 2][32 + 2];
            countMins = 99;
            countClosedCellsToWin = countMins + ((16 + 32) * 4 + 4);
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
            fieldWithMins = new int[row + 2][col + 2];
            fieldToOpen = new boolean[row + 2][col + 2];
            this.countMins = countMins;
            countClosedCellsToWin = countMins + ((row + col) * 2 + 4);


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
                        fieldWithMins[i - 1][j - 1] = fieldWithMins[i - 1][j - 1] + 1;
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

    public void printField() {
        System.out.println("--------- Ваше поле: -----------");
        for (int i = 1; i < fieldWithMins.length - 1; i++) {
            for (int j = 1; j < fieldWithMins.length - 1; j++) {
                if (fieldToOpen[i][j] == true) {
                    System.out.print(fieldWithMins[i][j] + " ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public void printFieldEndGame() {
        System.out.println("--------- Ваше поле: -----------");
        for (int i = 1; i < fieldWithMins.length - 1; i++) {
            for (int j = 1; j < fieldWithMins.length - 1; j++) {
                if (fieldToOpen[i][j] == true || fieldWithMins[i][j] == -1) {
                    System.out.print(fieldWithMins[i][j] + " ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public boolean doStep() {

        if (countClosedCellsToWin == this.countClosedCells()) {
            System.out.println("-----------Вы выйграли!!!-------------");
            this.printFieldEndGame();
            return false;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите строку:");
        int row = scanner.nextInt();

        System.out.println("Выберите колонку:");
        int col = scanner.nextInt();
        if (row < 1 || row > fieldWithMins.length - 1 || col < 1 || col > fieldWithMins[0].length - 1) {
            // если индексы не корректны
            System.out.println("Повторите ввод:");
            this.doStep(); // рекурсивный вызов метода
        }
        if (fieldToOpen[row][col] == true) {
            System.out.println("Вы уже выбрали эту ячейку, повторите ввод");
            this.doStep();
        }
        if (fieldWithMins[row][col] == -1) { //экспресс проверка на окончание игры
            System.out.println("Вып проиграли");
            this.printFieldEndGame();
            return false; // конец игры, новые шаги не нужны
        } else { //если в ячейке не мина и нужно продолжить игру
            fieldToOpen[row][col] = true;
            for (int i = 1; i < 5; i++) { // нужно как то ограничить опрос, чтобы он не заходил за рамки поля
                for (int j = 1; j < 5; j++) {

                    if (fieldWithMins[row - i][col - j] != -1) {
                        fieldToOpen[row - i][col - j] = true;
                    }
                    if (fieldWithMins[row - i][col + j] != -1) {
                        fieldToOpen[row - i][col + j] = true;
                    }
                    if (fieldWithMins[row + i][col + j] != -1) {
                        fieldToOpen[row + i][col + j] = true;
                    }
                    if (fieldWithMins[row][col - j] != -1) {
                        fieldToOpen[row][col - j] = true;
                    }
                    if (fieldWithMins[row + i][col - j] != -1) {
                        fieldToOpen[row + i][col - j] = true;
                    }
                    if (fieldWithMins[row + i][col] != -1) {
                        fieldToOpen[row + i][col] = true;
                    }
                    if (fieldWithMins[row][col + j] != -1) {
                        fieldToOpen[row][col + j] = true;
                    }
                    if (fieldWithMins[row - i][col] != -1) {
                        fieldToOpen[row - i][col] = true;
                    }
                }



            }

        }return true; // нужен следующий шаг
    }

    private int countClosedCells() {
        int count = 0;
        for (int i = 0; i < fieldToOpen.length; i++) {
            for (int j = 0; j < fieldWithMins.length; j++) {
                if (fieldToOpen[i][j] == false) {
                    count++;
                }
            }
        }
        return count;
    }

}



