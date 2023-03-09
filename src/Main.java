import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date1= new Date();
        long date = new Date().toInstant().toEpochMilli();
        System.out.println(date);
        System.out.println(date1);
    }
}