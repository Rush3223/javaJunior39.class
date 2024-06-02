package lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите уровень");
        System.out.println("1 - Новичок");
        System.out.println("2 - Любитель");
        System.out.println("3 - Профессионал");
        System.out.println("4 - Особый");

        // Формула создания ссылочного типа
        Scanner scanner = new Scanner(System.in);
        String level = scanner.nextLine();

        SaperField saperField = new SaperField(level);
        saperField.addRandomMins();
        saperField.countAndAddNums();
        saperField.printField();

        while (saperField.doStep()){ // или будет следующий шаг
            saperField.printField(); // печатаем поле и справшиваем шаг
        }



    }
}
