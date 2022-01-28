package Tema5;
public class BookTest {
    public static void main(String[] args) {
        Book b1, b2;

        b1 = new Book("Rafa", "LOL", 120, "2224", true);
        b2 = new Book("Sr", "No", 320, "34", false);

        b1.printDetails();
        System.out.println();
        b2.printDetails();
        System.out.println();
        b2.printDetails();
    }
}
