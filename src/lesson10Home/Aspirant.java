package lesson10Home;

import java.util.Objects;

public abstract class Aspirant extends Student {
    protected String scientificWork;

    public Aspirant() {
    }

    public Aspirant(String firstName, String lastName, int group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Aspirant aspirant = (Aspirant) o;
        return Objects.equals(scientificWork, aspirant.scientificWork);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(scientificWork);
        return result;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "scientificWork='" + scientificWork + '\'' +
                '}';
    }

    @Override
    public abstract void getScholarship();

}

