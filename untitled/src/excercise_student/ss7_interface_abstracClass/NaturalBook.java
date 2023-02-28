package excercise_student.ss7_interface_abstracClass;

public class NaturalBook extends Book implements IBook{
    private long publish;

    public NaturalBook() {

    }

    public NaturalBook(long publish) {
        this.publish = publish;
    }

    public NaturalBook(String nameBook, String publisher, String year, long publish) {
        super(nameBook, publisher, year);
        this.publish = publish;
    }

    @Override
    public String toString() {
        return "NaturalBook{" +
                "publish=" + publish + super.toString() +
                '}';
    }

    @Override
    public void display() {
        System.out.println(" Natural book ");
    }
}
