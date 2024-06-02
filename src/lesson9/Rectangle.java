package lesson9;

public class Rectangle {
    private double sideRectangleA;
    private double sideRectangleB;


    public Rectangle() {

    }

    public Rectangle(double sideRectangleA, double sideRectangleB) {
        this.sideRectangleA = sideRectangleA;
        this.sideRectangleB = sideRectangleB;
    }

    public double getSideRectangleA() {
        return sideRectangleA;
    }

    public void setSideRectangleA(double sideRectangleA) {
        this.sideRectangleA = sideRectangleA;
    }

    public double getSideRectangleB() {
        return sideRectangleB;
    }

    public void setSideRectangleB(double sideRectangleB) {
        this.sideRectangleB = sideRectangleB;
    }

    public double getPerimeterRectangle() {
        return (sideRectangleA + sideRectangleB) * 2;
    }

    public double getSquareRectangle() {
        return sideRectangleA * sideRectangleB;
    }

}
