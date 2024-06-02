package lesson9;

public class Square {
    private double sideSquare;



    public Square() {
    }

    public Square(double sideSquare) {
        this.sideSquare = sideSquare;
    }

    public double getSideSquare() {
        return sideSquare;
    }

    public void setSideSquare(double sideSquare) {
        this.sideSquare = sideSquare;
    }

    public double getPerimeterSquare() {
        return sideSquare * 4;
    }

    public double getSquareSquare() {
        return sideSquare * sideSquare;
    }

}
