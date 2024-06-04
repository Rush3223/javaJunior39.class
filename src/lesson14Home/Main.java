package lesson14Home;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);

        Collections util = new Collections();
        Collection<Integer> unionResult = util.union(a, b);
        System.out.println(unionResult);
        System.out.println("-------------------------------");

        Collection<Integer> intersectionResult = util.intersection(a, b);
        System.out.println(intersectionResult);
        System.out.println("-------------------------------");

        Collection<Integer> unionWithoutDuplicateResult = util.unionWithoutDuplicate(a, b);
        System.out.println(unionWithoutDuplicateResult);
        System.out.println("-------------------------------");

        Collection<Integer> intersectionWithoutDuplicateResult = util.intersectionWithoutDuplicate(a, b);
        System.out.println(intersectionWithoutDuplicateResult);
        System.out.println("-------------------------------");

        Collection<Integer> differenceResult = util.difference(a, b);
        System.out.println(differenceResult);
        System.out.println("-------------------------------");


    }

}
