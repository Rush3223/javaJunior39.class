package lesson16;

public class Main1 {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.addProduct("Яблоко", 200);
        holodilnik.addProduct("Груша", 800);
        holodilnik.addProduct("Яблоко", 400);
        holodilnik.addProduct("Слива", 500);
        holodilnik.addProduct("Персик", 700);
        holodilnik.addProduct("Лук", 200);
        holodilnik.addProduct("Катрошка", 3000);
        holodilnik.addProduct("Молоко", 1000);

        holodilnik.printAllProducts();
        System.out.println("-------------------------------------");
        holodilnik.takeTheProduct("молоко", 500);
        System.out.println("Остаток продуктов:");
        holodilnik.printAllProducts();


    }
}
