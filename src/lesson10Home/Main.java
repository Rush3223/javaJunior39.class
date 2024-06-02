package lesson10Home;

public class Main {
    public static void main(String[] args) {

        Artem artem = new Artem("Артём", "Фамилия", 1, 5);
        Dasha dasha = new Dasha("Даша", "Фамилия", 2, 4);
        Ivan ivan = new Ivan("Иван", "Фамилия", 3, 3,
                "Создание ИИ для написания кода без багов");
        Katya katya = new Katya("Катя", "Фамилия", 4, 5,
                "Создание ИИ для проверки ИИ для написания кода");

        Student[] student = new Student[4];

        student[0] = artem;
        student[1] = dasha;
        student[2] = ivan;
        student[3] = katya;

        for (Student s : student) {
            s.getScholarship();
        }
    }
}
