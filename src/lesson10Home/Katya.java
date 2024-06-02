package lesson10Home;

public class Katya extends Aspirant {
    public Katya() {
    }

    public Katya(String firstName, String lastName, int group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark, scientificWork);
    }

    @Override
    public void getScholarship() {
        if (getAverageMark() > 4) {
            System.out.println("Стипендия Кати 2500");
        } else {
            System.out.println("Стипендия Кати 2200");

        }
    }
}
