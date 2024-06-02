package lesson10;

public class Journal extends Edition {
    private int yearOfRelease;
    private int issueNumber;

    public Journal() {
    }

    public Journal(int yearOfRelease, int issueNumber) {
        this.yearOfRelease = yearOfRelease;
        this.issueNumber = issueNumber;
    }

    public Journal(String title, int issueNumber, String publishingHouse, int yearOfRelease) {
        super(publishingHouse, title);
        this.yearOfRelease = yearOfRelease;
        this.issueNumber = issueNumber;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Journal journal = (Journal) o;
        return yearOfRelease == journal.yearOfRelease && issueNumber == journal.issueNumber;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + yearOfRelease;
        result = 31 * result + issueNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Журнал:" +
                " Название " + getTitle() +
                ", год выпуска " + yearOfRelease +
                ", номер выпуска " + issueNumber +
                ", издательство " +getPublishingHouse()
                ;
    }
}
