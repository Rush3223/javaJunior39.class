package lesson12Home;

public class Factory {

    public static Hen getHen(String country) {
        if (country.equalsIgnoreCase("Россия")) {
            return new RussianHen(100, "Россия");
        }
        if (country.equalsIgnoreCase("Украина")) {
            return new UkrainianHen(94, "Украина");
        }
        if (country.equalsIgnoreCase("Молдавия")) {
            return new MoldovanHen(214, "Молдавия");
        }
        if (country.equalsIgnoreCase("Беларусь")) {
            return new BelarusianHen(517, "Беларусь");
        }
        return null;

    }

}
