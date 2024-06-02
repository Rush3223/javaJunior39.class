package lesson1;

public class SecondProgramm {

    public static void main(String[] args) {
        int dlinaStola = 3;
        int shirinaStola = 5;
        int dlinaRoom = 34;
        int shirinaRoom = 25;

        int ploshadStola = dlinaStola * shirinaStola;
        int ploshadRoom = dlinaRoom * shirinaRoom;
        int colicestvoStolov = ploshadRoom / ploshadStola;

        System.out.println(colicestvoStolov);


    }
}
