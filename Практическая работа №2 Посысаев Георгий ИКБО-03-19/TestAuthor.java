package Mirea.practice.second;

public class TestAuthor {

    public static void main(String[] args) {
        author author1 = new author("HEMINGYAY", "hemin@mail.ru", 'M');
        author author2 = new author("Sapkovsii", "Sap@gmail.com", 'M');
        System.out.println(author1.toString());
        System.out.println(author2.toString());
    }
}
