package safasfgwag;

import tourAgentstvo.Tour;

public class TourAgenstvoV2 {
    private Tour[] tours = new Tour[5];


    public TourAgenstvoV2() {
        Tour tour1 = new Tour("Германия", "7", "Самолет", 100000);
        Tour tour2 = new Tour("Франция", "5", "Автобус", 50000);
        Tour tour3 = new Tour("Италия", "14", "Катер", 150000);
        Tour tour4 = new Tour("Россия", "365", "Велосипед", 1);

        tours[0] = tour1;
        tours[1] = tour2;
        tours[2] = tour3;
        tours[3] = tour4;
    }

    public void printChipestTour() {
        Tour chipestTour = null;
        for (Tour t : tours) {
            if (t != null) {
                if (chipestTour == null) {
                    chipestTour = t;
                }
                if (chipestTour.getPrice() > t.getPrice()) {
                    chipestTour = t;
                }
            }

        }

        System.out.println("Проверка метода TourAgentstvo на вывод самой дешевой страны");
        System.out.println(chipestTour.getCountry() + " на " + chipestTour.getDays() + " дней транспорт - " + chipestTour.getTransport() + " цена тура " + chipestTour.getPrice() + " руб.");
        ;
    }

    public void printAllTour() {
        for (Tour t : tours) {
            if (t != null) {
                System.out.println(t);
            }

        }


    }

}