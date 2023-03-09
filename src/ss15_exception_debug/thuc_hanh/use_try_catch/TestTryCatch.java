package ss15_exception_debug.thuc_hanh.use_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Numberator: ");
            int numerator = Integer.parseInt(input.nextLine());
            System.out.println("Denominator: ");
            int denominator = Integer.parseInt(input.nextLine());
            int result = numerator / denominator;
            System.out.print("Numberator= " + numerator + ", Denominator= " + denominator + ", Result= " + result);
        }catch (InputMismatchException e){
            e.printStackTrace();
        } finally {
            System.out.println("\nDone");
        }

    }
}
