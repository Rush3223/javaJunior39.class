package lesson15Home;

import java.util.*;

public class ListUtilsMain implements ListUtils{
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        List<String> result = new ArrayList<>();
        for (String s : strings)
            result.add(s);
        return result;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        List<Double> result = new ArrayList<>(data);
        Collections.sort(result);
        Collections.reverse(result);
        return result;
    }
}
