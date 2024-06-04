package lesson14Home;

import java.util.*;

public class Collections implements CollectionUtils {


    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer numFromA : a) {
            if (b.contains(numFromA)) {
                result.add(numFromA);
            }
        }
        for (Integer numFromB : b) {
            if (a.contains(numFromB)) {
                result.add(numFromB);
            }
        }

        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new LinkedHashSet<>(a);
        result.addAll(b);

        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new LinkedHashSet<>(a);
        result.retainAll(b);
        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        /**
         * Асимметричная разница
         * Ненужное закомментить, по заданию не понятно что нужно сделать
         */
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.removeAll(b);

        return result;

        /** Симметричная разница без использования хэша
         * ArrayList<Integer> result1 = new ArrayList<>();
         *         result1.addAll(a);
         *         result1.removeAll(b);
         *         ArrayList<Integer> result2 = new ArrayList<>();
         *         result2.addAll(b);
         *         result2.removeAll(a);
         *         ArrayList<Integer> result = new ArrayList<>();
         *         result.addAll(result1);
         *         result.addAll(result2);
         *         return result;
         */
    }

}

