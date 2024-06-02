package lesson10Home;

public class Artem extends Student{
    public Artem() {
    }

    public Artem(String firstName, String lastName, int group, double averageMark) {
      super(firstName, lastName, group, averageMark);
    }

    @Override
    public void getScholarship() {
if(getAverageMark() > 4){
    System.out.println("Стипендия Артёма 2000");
}else {
    System.out.println("Стипендия Артёма 1900");
}
    }
}
