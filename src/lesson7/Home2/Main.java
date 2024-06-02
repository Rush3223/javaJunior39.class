package lesson7.Home2;

/**Создать класс Person, который содержит:
1) переменные fullName, age;
2) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит" и "Такой-то  Person двигается".
3) Добавьте два конструктора  - Person() и Person(fullName, age).
4) Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
5) Вызовите методы move() и talk().
 *
 */

public class Main {
    public static void main(String[] args) {
        Person ivan = new Person();
        ivan.setAge(28);
        ivan.setFullName("Иван");

        Person vlad = new Person("Влад", 25);

        vlad.printMove();
        ivan.printTalk();
    }
}
