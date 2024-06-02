package lesson10;

import java.util.Objects;

public class Edition {
    private String title;
    private String publishingHouse;


    public Edition() {
    }

    public Edition(String publishingHouse, String title) {
        this.publishingHouse = publishingHouse;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Edition edition = (Edition) o;
        return Objects.equals(title, edition.title) && Objects.equals(publishingHouse, edition.publishingHouse);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(title);
        result = 31 * result + Objects.hashCode(publishingHouse);
        return result;
    }

    @Override
    public String toString() {
        return "Library{" +
                "title='" + title + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }

}
