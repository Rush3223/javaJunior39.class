package lesson1;

public class Home2 {
    public static void main(String[] args) {
        int ageA = 60;

        if (ageA < 18) {
            System.out.println("Ребенок");
        } else if (ageA >= 18 && ageA < 60) {
            System.out.println("Пожилой");
        } else {

            System.out.println("дед");
        }
    }
}
