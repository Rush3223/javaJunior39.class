package lesson9;

public class Oval {
    private double halfAxisA;
    private double halfAxisB;

    public Oval() {
    }

    public Oval(double halfAxisA, double halfAxisB) {
        this.halfAxisA = halfAxisA;
        this.halfAxisB = halfAxisB;
    }

    public double getHalfAxisA() {
        return halfAxisA;
    }

    public void setHalfAxisA(double halfAxisA) {
        this.halfAxisA = halfAxisA;
    }

    public double getHalfAxisB() {
        return halfAxisB;
    }

    public void setHalfAxisB(double halfAxisB) {
        this.halfAxisB = halfAxisB;
    }

    public double getPerimeterOval() {
        return (halfAxisA * halfAxisA + halfAxisB * halfAxisB) / 2;
    }

    public double getSquareOval() {
        return Math.PI * halfAxisB * halfAxisA;
    }
}