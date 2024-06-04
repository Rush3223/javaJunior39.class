package lesson14;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();

        nums.add(2);
        nums.add(6);
        nums.add(1);
        nums.add(9);
        nums.set(0, 62);

        System.out.println(nums);
    }
}
