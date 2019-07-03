package main.java;

public class Books {

    private String name;
    private String author;
    private String publishingHouse;
    private String year;

    public Books(String name, String author, String publishingHouse, String year) {
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
