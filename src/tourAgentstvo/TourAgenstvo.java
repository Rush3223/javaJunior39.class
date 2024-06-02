package tourAgentstvo;

public class TourAgenstvo {
    public static void addTour(String country, String days, String transport, String price, String[][] tours) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0] == null) {
                tours[i][0] = (i + 1) + "";
                tours[i][1] = country;
                tours[i][2] = days;
                tours[i][3] = transport;
                tours[i][4] = price;
                break;
            }
        }
    }

    public void printToursByCountry(String[][] tours, String country) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0] != null && tours[i][1].equalsIgnoreCase(country)) {
                System.out.printf("Тур №%s в %s (%s), на %s дней за %s руб. \n", tours[i][0], tours[i][1], tours[i][3], tours[i][2], tours[i][4]);
            }
        }
    }

    public void printChipestTour(String[][] tours, int ChipestTour) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0] != null) {
                String priceStr = tours[i][4];
                int priceCurrentTour = Integer.parseInt(priceStr);



            }
        }
    }

}


