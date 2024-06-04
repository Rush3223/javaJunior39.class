package lesson15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("www");
        set.add("rrr");
        set.add("eee");
        set.add("qqq");
        set.add("fff");

        for (String s: set){
            System.out.println(s);
        }

        // с помощью итератора
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext(); ){
            System.out.println(iterator.next());
        }
    }
}