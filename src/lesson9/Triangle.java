package lesson9;

public class Triangle {
    private double sideTriangleA;
    private double sideTriangleB;
    private double sideTriangleC;


    public Triangle() {

    }

    public Triangle(double sideTriabgleA, double sideTriabgleB, double sideTriabgleC) {
        this.sideTriangleA = sideTriabgleA;
        this.sideTriangleB = sideTriabgleB;
        this.sideTriangleC = sideTriabgleC;
    }

    public double getSideTriangleA() {
        return sideTriangleA;
    }

    public void setSideTriangleA(double sideTriabgleA) {
        this.sideTriangleA = sideTriabgleA;
    }

    public double getSideTriangleB() {
        return sideTriangleB;
    }

    public void setSideTriangleB(double sideTriabgleB) {
        this.sideTriangleB = sideTriabgleB;
    }

    public double getSideTriangleC() {
        return sideTriangleC;
    }

    public void setSideTriangleC(double sideTriangleC) {
        this.sideTriangleC = sideTriangleC;
    }

    public double getPerimeterTriangle() {
        return sideTriangleA + sideTriangleB + sideTriangleC;
    }

    public double getSquareTriangle() {
        double halfPerimetrTriangle = getPerimeterTriangle() / 2;
        return Math.sqrt(halfPerimetrTriangle * (halfPerimetrTriangle - sideTriangleA) *
                (halfPerimetrTriangle - sideTriangleB) * (halfPerimetrTriangle - sideTriangleC));
    }

}
