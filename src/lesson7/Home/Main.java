package lesson7.Home;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Phone samsung = new Phone(799912343, "samsung Galaxy S", 150);
        Phone apple = new Phone(764513686, "apple iPhone Pro", 160);
        Phone xiaomi = new Phone(798654631, "xiaomi 14 Ultra", 140);


        System.out.println("Номер телефона - " + samsung.getNumber() + " " + "Модель - " +
                samsung.getModel() + " " + "Вес - " + samsung.getWeight() + "г");
        System.out.println("Номер телефона - " + apple.getNumber() + " " + "Модель - " +
                apple.getModel() + " " + "Вес - " + apple.getWeight() + "г");
        System.out.println("Номер телефона - " + xiaomi.getNumber() + " " + "Модель - " +
                xiaomi.getModel() + " " + "Вес - " + xiaomi.getWeight() + "г");

        samsung.receiveCall("Вася");


    }
}

