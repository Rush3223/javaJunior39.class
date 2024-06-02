package lesson10Home;

public class Dasha extends Student {
    public Dasha() {
    }

    public Dasha(String firstName, String lastName, int group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public void getScholarship() {
        if (getAverageMark() > 4) {
            System.out.println("Стипендия Даши 2000");
        } else {
            System.out.println("Стипендия Даши 1900");
        }
    }
}