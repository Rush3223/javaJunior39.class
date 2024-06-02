package dgzf;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Elka {
    private ArrayList<Igrushka> listIgrushek = new ArrayList<>();           // список который может хранить любой тип

    public ArrayList<Igrushka> getListIgrushek() {
        return listIgrushek;
    }
    public void povesitIgrushku(Igrushka igrushka){
        listIgrushek.add(igrushka);

    }

    @Override
    public String toString() {
        return "Elka{" +
                "listIgrushek=" + listIgrushek +
                '}';
    }
}
