package lesson16;

public class Main1 {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.addProduct("Яблоко", 200);
        holodilnik.addProduct("Груша", 800);
        holodilnik.addProduct("Яблоко", 400);
        holodilnik.addProduct("Слива", 1000);

        holodilnik.printAllProducts();
        System.out.println("-------------------------------------");
        holodilnik.printAllProducts2();
    }
}
