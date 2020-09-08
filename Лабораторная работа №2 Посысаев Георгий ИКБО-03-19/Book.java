package Laba2.Java;

public class Book {
    private String Author, name_of_book;
    private int year;
    public void setAuthor(String Author){
        this.Author = Author;
    }
    public void setName_of_book(String name_of_book){
        this.name_of_book = name_of_book;
    }
    public void setYear(int year){
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return Author;
    }

    public String getName_of_book() {
        return name_of_book;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Author='" + Author + '\'' +
                ", name_of_book='" + name_of_book + '\'' +
                ", year=" + year +
                '}';
    }
}
