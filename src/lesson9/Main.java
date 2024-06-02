package lesson9;

/**
 * 1) Создать класс Треугольник, Прямоугольник, Квадрат, Круг, Овал.
 * 2) Самостоятельно подумать какие нам нужны в этих классах поля, прописать их.
 * 3) Создать все методы гет и сет во всех классах.
 * 4) Создать минимум 2 конструктора в каждом классе
 * 5) Создать в каждом классе методы: площадь и периметр, которые возвращают значение площади или периметра, по заданным полям класса.
 * 6) Создать класс Main и показать как работают методы площадь и периметр.
 * Для этого конечно необходимо будет создать по 1 объекту каждой фигуры, и установить каждому значения сторон.
 */
public class Main {
    public static void main(String[] args) {

        Triangle testTreangle = new Triangle(4, 5, 6);
        Circle testCircle = new Circle(9);
        Square testSquare = new Square(4);
        Rectangle testRectangle = new Rectangle(5.7, 10.4);
        Oval testOval = new Oval(7.77, 6.66);


        System.out.println("Периметр круга равен " + testCircle.getPerimeterCircle());
        System.out.println("Площадь круга равна " + testCircle.getSquareCircle());
        System.out.println("---------------------------------------------------");
        System.out.println("Периметр реугольника равен " + testTreangle.getPerimeterTriangle());
        System.out.println("Площадь треугольника равна " + testTreangle.getSquareTriangle());
        System.out.println("---------------------------------------------------");
        System.out.println("Периметр квадрата равен " + testSquare.getPerimeterSquare());
        System.out.println("Площадь квадрата равна " + testSquare.getSquareSquare());
        System.out.println("---------------------------------------------------");
        System.out.println("Периметр прямоугольника равен " + testRectangle.getPerimeterRectangle());
        System.out.println("Площадь прямоугольника равна " + testRectangle.getSquareRectangle());
        System.out.println("---------------------------------------------------");
        System.out.println("Периметр овала равен " + testOval.getPerimeterOval());
        System.out.println("Площадь овала равна " + testOval.getSquareOval());




    }
}
