package lesson14;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add("qwe" + i);
        }
        long time2 = System.currentTimeMillis();
        System.out.println("Arraylist add --- " + (time2 - time1));
        for (int i = 0; i < 100000; i++) {
            linkedList.add("qwe" + i);
        }
        long time3 = System.currentTimeMillis();
        System.out.println("Linkedlist add --- " + (time3 - time2));
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }
        long time4 = System.currentTimeMillis();
        System.out.println("Arraylist get --- " + (time4 - time3));
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        long time5 = System.currentTimeMillis();
        System.out.println("Linkedlist get --- " + (time5 - time4));
    }
}