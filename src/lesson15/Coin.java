package lesson15;

import java.util.Objects;

public class Coin implements Comparable<Coin>{
    private int nominal;
    private int year;
    private String metall;
    private double diametr;

    public Coin() {
    }

    public Coin(int nominal, int year, String metall, double diametr) {
        this.nominal = nominal;
        this.metall = metall;
        this.year = year;
        this.diametr = diametr;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;
        return nominal == coin.nominal && year == coin.year && Double.compare(diametr, coin.diametr) == 0 && Objects.equals(metall, coin.metall);
    }

    @Override
    public int hashCode() {
        int result = nominal;
        result = 31 * result + year;
        result = 31 * result + Objects.hashCode(metall);
        result = 31 * result + Double.hashCode(diametr);
        return result;
    }

    @Override
    public String toString() {
        return "Coin{ " +
                "nominal= " + nominal +
                ", year= " + year +
                ", metall= '" + metall + '\'' +
                ", diametr= " + diametr +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        //   +   0   -
        // this
        // o
        if (nominal != o.nominal){
            return nominal - o.nominal; // 5 - 10 = -5
        }
        if (year != o.year){
            return year - o.year;
        }
        if (metall.equals(o.metall)){
            return metall.compareTo(o.metall);
        }

        return Double.compare(diametr, o.diametr);
    }
}
