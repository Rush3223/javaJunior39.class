package lesson1;

public class Homework1 {

    public static void main(String[] args) {
        int myMoney = 1000;
        int pricePizza = 230;
        int priceGum = 26;
        double priceCandy = 2.5;

        int colichestvoPizza = myMoney / pricePizza;
        myMoney = myMoney - pricePizza * colichestvoPizza;
        int colichestvoGum = myMoney / priceGum;
        myMoney = myMoney - colichestvoGum * priceGum;
        double colichestvoCandy = myMoney / priceCandy;


        System.out.println("На эти деньги мы можем купить:");
        System.out.println("-" + " " + colichestvoPizza + " " + "пиццы");
        System.out.println("-" + " " + colichestvoGum + " " + "жвачки");
        if (colichestvoCandy < 1) {
            System.out.println("- 0 жвачки");
        } else {
            System.out.println("-" + " " + colichestvoCandy + " " + "жвачки");
        }


    }
}
