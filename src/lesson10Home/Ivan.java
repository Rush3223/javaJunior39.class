package lesson10Home;

public class Ivan extends Aspirant {
    public Ivan() {
    }

    public Ivan(String firstName, String lastName, int group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark, scientificWork);
    }

    @Override
    public void getScholarship() {
        if (getAverageMark() > 4) {
            System.out.println("Стипендия Ивана 2500");
        } else {
            System.out.println("Стипендия Ивана 2200");
        }
    }
}