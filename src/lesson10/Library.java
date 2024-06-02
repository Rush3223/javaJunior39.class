package lesson10;

public class Library {
    private Edition[] editions = new Edition[5];

    public Library() {
        Book book1 = new Book("publishingHouse1",
                "HobbiT", "Author1", 450, 2010);
        Book book2 = new Book("publishingHouse2",
                "Playing GOD", "Author2", 999, 0);
        Journal journal1 = new Journal("Energy industry", 2,
                "publishingHouse3", 2020);
        Journal journal2 = new Journal("Learning Java", 5,
                "publishingHouse4", 2022);

        editions[0] = book1;
        editions[1] = book2;
        editions[2] = journal1;
        editions[3] = journal2;
    }

    public Edition[] getEditions() {
        return editions;
    }

    public void setEditions(Edition[] editions) {
        this.editions = editions;
    }

}
