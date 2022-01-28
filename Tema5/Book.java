package Tema5;

/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private String refNumber = "";
    private int pages;
    private int borrowed;
    private final boolean courseText;


    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, String refNumber, boolean bookcourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        courseText = bookcourseText;
    }

    // Add the methods here ...
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public boolean isCourseText() {
        return courseText;
    }

    public void printAuthor() {
        System.out.println(getAuthor());
    }

    public void printTitle() {
        System.out.println(getTitle());
    }

    public void setRefNumber(String ref) {
        if (ref.length() > 3) {
            refNumber = ref;
        } else {
            System.out.println("El número de referencia es inferior a tres carácteres.");
        }
    }

    public void borrow() {
        this.borrowed++;
    }

    public int getBorrowed() {
        return this.borrowed;
    }

    public void printDetails() {
        System.out.println(getAuthor());
        System.out.println(getTitle());
        System.out.println(getPages());
        System.out.println(getRefNumber());
        System.out.println(borrowed);
        System.out.println(isCourseText());
    }
}