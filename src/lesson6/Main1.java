package lesson6;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        String[][] tours = new String[100][8];
        ToursUtils.addTour("Италия", "Рим", "Самолет",
                "6", "140000", "5", "Завтрак", tours);
        ToursUtils.addTour("Италия", "Флоренция", "Самолет",
                "5", "180000", "4", "Все включено", tours);
        ToursUtils.addTour("Франция", "Париж", "Самолет",
                "6", "140000", "4", "Все включено", tours);
        ToursUtils.addTour("Ливан", "Бейрут", "Автобус",
                "6", "50000", "4", "Завтрак + Ужин", tours);
        ToursUtils.addTour("Франция", "Париж", "Самолет",
                "6", "120000", "3", "Завтрак", tours);
        ToursUtils.addTour("Германия", "Мюнхен", "Автобус",
                "6", "210000", "4", "Завтрак + Ужин", tours);
        ToursUtils.addTour("Германия", "Берлин", "Самолет",
                "6", "180000", "5", "Все включено", tours);
        ScannerUtil.searchByCountry(tours);
        ScannerUtil.searchByMoney(tours);
    }
}
