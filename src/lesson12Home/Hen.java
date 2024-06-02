package lesson12Home;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Hen {
    private int eggPerMonth;
    private String country;

    public Hen() {
    }

    public Hen(int eggPerMonth, String country) {
        this.eggPerMonth = eggPerMonth;
        this.country = country;
    }

    public int getEggPerMonth() {
        return eggPerMonth;
    }

    public void setEggPerMonth(int eggPerMonth) {
        this.eggPerMonth = eggPerMonth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hen hen = (Hen) o;
        return eggPerMonth == hen.eggPerMonth && Objects.equals(country, hen.country);
    }

    @Override
    public int hashCode() {
        int result = eggPerMonth;
        result = 31 * result + Objects.hashCode(country);
        return result;
    }

    @Override
    public String toString() {
        return "Страна: " + country + ", курицы приносят " + eggPerMonth + " яиц в месяц.";

    }

    public abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        String iAmAHen = "Я курица";
        return iAmAHen;
    }
}
