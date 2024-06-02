package safasfgwag;

import tourAgentstvo.Tour;
import tourAgentstvo.TourAgenstvo;

public class Main {
    public static void main(String[] args) {
        TourAgenstvoV2 agenstvo = new TourAgenstvoV2();
        agenstvo.printChipestTour();
        System.out.println("----------------------------------");

        agenstvo.printAllTour();

        System.out.println("----------------------------------");
        Tour tour1 = new Tour("Нигерия", "12", "плот", 0);
        System.out.println(tour1.toString());


    }
}
