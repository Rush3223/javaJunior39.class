package lesson6;

import java.util.Scanner;

public class ScannerUtil {
    public static void searchByCountry(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("В какую страну хотите поехать?");
        String country = scanner.next();
        System.out.println("--------Результат----------");
        ToursUtils.printToursByCountry(tours, country);
        System.out.println("---------------------------");
    }

    // поиск тура по бюджету. Пользователь задает одно число
    // и мы печатаем туры +-20000 от этого бюджета

    public static void searchByMoney(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На какой бюджет рассчитываете?");
        int budget = scanner.nextInt();
        System.out.println("--------Результат----------");
        ToursUtils.printToursByBudget(tours, budget);
        System.out.println("---------------------------");
    }
}
