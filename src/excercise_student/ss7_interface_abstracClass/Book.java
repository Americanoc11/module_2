package excercise_student.ss7_interface_abstracClass;

public abstract class Book implements IBook{
    private String nameBook;
    private String publisher;
    private String year;

    public Book() {

    }

    public Book(String nameBook, String publisher, String year) {
        this.nameBook = nameBook;
        this.publisher = publisher;
        this.year = year;
    }

    @Override
    public String toString() {
        return
                ", nameBook='" + nameBook + '\'' +
                        ", publisher='" + publisher + '\'' +
                        ", year='" + year + '\'';
    }
}
