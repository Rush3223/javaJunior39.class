package lesson10;

import java.util.Objects;

public class Book extends Edition {
    private String author;
    private int pages;
    private int yearOfPublication;

    public Book() {
    }

    public Book(String publishingHouse, String title, String author, int pages, int yearOfPublication) {
        super(publishingHouse, title);
        this.author = author;
        this.pages = pages;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;
        return pages == book.pages && yearOfPublication == book.yearOfPublication && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(author);
        result = 31 * result + pages;
        result = 31 * result + yearOfPublication;
        return result;
    }

    @Override
    public String toString() {
        return "Книга: " +
                "Автор " + author +
                ", название " + getTitle() +
                ", страниц " + pages +
                ", год публикации " + yearOfPublication +
                ", издательство " + getPublishingHouse();
    }


}
