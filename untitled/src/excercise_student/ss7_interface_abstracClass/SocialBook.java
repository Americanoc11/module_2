package excercise_student.ss7_interface_abstracClass;

public class SocialBook extends Book implements IBook {
    private String author;

    public SocialBook(String author) {
        this.author = author;
    }

    public SocialBook(String nameBook, String publisher, String year, String author) {
        super(nameBook, publisher, year);
        this.author = author;
    }

    @Override
    public String toString() {
        return "SocialBook{" +
                "author='" + author + '\'' + super.toString() +
                '}';
    }

    @Override
    public void display() {
        System.out.println(" Social book");
    }
}
