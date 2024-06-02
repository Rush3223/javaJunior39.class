package lesson12Home;

public class BelarusianHen extends Hen{

    public BelarusianHen() {
    }

    public BelarusianHen(int eggPerMonth, String country) {
        super(eggPerMonth, country);
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return getEggPerMonth();
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ". Моя страна - " + getCountry() + ". Я несу " + getEggPerMonth() + " яиц в месяц.";
    }
}
