package lesson9;

public class Circle{
    private double radius;


    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeterCircle() {
        return Math.PI * radius;
    }

    public double getSquareCircle() {
        return 2 * Math.PI * radius;
    }

}
//System.out.println("Площадь круга равна " + );
//        System.out.println("Периметр круга равен " + 2 * Math.PI * radius);