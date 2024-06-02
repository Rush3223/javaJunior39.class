package lesson12Home;

/**
 * Куриная фабрика
 *
 * Написать Фабрику(Factory) по производству кур(Hen)
 * 1. Создать класс Hen
 * 1.1. Сделать его абстрактным
 * 1.2. Добавить в класс абстрактный метод  int getCountOfEggsPerMonth()
 * 1.3. Добавить в класс метод String getDescription(), который возвращает строку "Я курица."
 * 2. Создать класс RussianHen, который наследуется от Hen
 * 3. Создать класс UkrainianHen, который наследуется от Hen
 * 4. Создать класс MoldovanHen, который наследуется от Hen
 * 5. Создать класс BelarusianHen, который наследуется от Hen
 * 6. В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
 * Методы должны возвращать количество яиц в месяц от данного типа куриц.
 * 7. В каждом из четырех последних классов написать свою реализацию метода getDescription.
 * Методы должны возвращать строку вида:
 * <getDescription() родительского класса>  + <" Моя страна - SSSSS. Я несу N яиц в месяц.">
 * где SSSSS - название страны
 * где N - количество яиц в месяц
 * 8. В классе HenFactory реализовать меетод getHen, который возвращает соответствующую стране породу кур
 * 9. Все созданные вами классы должны быть в отдельных файлах
 */
public class Main {
    public static void main(String[] args) {
        Hen belarusHen = Factory.getHen("Беларусь");
        Hen ukrainaHen = Factory.getHen("Украина");
        Hen russianHen = Factory.getHen("Россия");
        Hen moldovanHen = Factory.getHen("Молдавия");

        System.out.println(belarusHen);
        System.out.println(ukrainaHen);
        System.out.println(russianHen);
        System.out.println(moldovanHen);
        System.out.println("-----------------------------------------------");
        System.out.println(belarusHen != null ? belarusHen.getDescription(): "Яиц из Беларуси не поступало");
        System.out.println(ukrainaHen != null ? ukrainaHen.getDescription() : "Яиц из Украины не поступало");
        System.out.println(russianHen != null ? russianHen.getDescription(): "Яиц из России не поступало");
        System.out.println(moldovanHen != null ? moldovanHen.getDescription(): "Яиц из Молдавии не поступало");


    }
}
