package dgzf;

public class Igrushka {
    private String color;
    private int size;

    public Igrushka() {

    }

    public Igrushka(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public String toString() {
        return "Igrushka{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
