package excercise_student.ss7_interface_abstracClass;

public class BookController {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new NaturalBook("Blackmail and Bibingka", "Duc", "2000", 2000);
        books[1] = new NaturalBook("Hello World ", "Danh", "1995", 1000);
        books[2] = new NaturalBook("God Father", "Hưng", "2023", 500);
        books[3] = new SocialBook("Information Technology", "Hoang", "2010", " steve job");
        books[4] = new SocialBook("War of kingdom", "Hạnh", "1890", " Jonathan");
        for (Book bookName : books) {
            bookName.display();
            System.out.println(bookName.toString());
        }
    }
}
