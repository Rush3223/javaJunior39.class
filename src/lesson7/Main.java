package lesson7;

public class Main {
    public static void main(String[] args) {
                            // вызов конструктора (особый метод, который вызывается после слова new)
        Student vasya = new Student(27, "Вася", "Грозный", "984651331");
        Student petya = new Student();

        vasya.setAge(29);
        petya.setAge(23);

        System.out.println(vasya.getAge());
        System.out.println(petya.getAge());

    }
}
