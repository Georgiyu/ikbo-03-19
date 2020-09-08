package Laba2.Java;
import java.util.Scanner;
public class TestBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Book book1 = new Book();
        System.out.println("Введите фамилию автора");
        String Author = in.nextLine();
        System.out.println("Введите название книги");
        String name_of_book = in.nextLine();
        System.out.println("Введите год написания");
        Integer year = in.nextInt();
        book1.setName_of_book(name_of_book);
        book1.setAuthor(Author);
        book1.setYear(year);
        System.out.println(book1.toString());

    }
}
