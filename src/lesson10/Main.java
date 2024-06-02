package lesson10;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {
        Library library = new Library();


        Edition tolstayaBook = getSamayaTolstayaBook(library.getEditions());


        printArray(library.getEditions());
        System.out.println("======================");
        System.out.println("Самая толстая книга:");
        System.out.println(tolstayaBook);

    }

    private static void printArray(Edition[] editions) {
        Arrays.stream(editions).filter(Objects::nonNull).forEach(System.out::println);
    }

    private static Book getSamayaTolstayaBook(Edition[] edition1) {
        Book tolstaya = null;
        for (Edition t : edition1) {
            if (t instanceof Book bookTemp) {
                if (tolstaya == null) {
                    tolstaya = bookTemp;
                }
                if (tolstaya.getPages() < bookTemp.getPages()) {
                    tolstaya = bookTemp;
                }
            }
        }
        return tolstaya;
    }
}
