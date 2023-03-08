package ss15_exception_debug.thuc_hanh.use_try_catch.Fractor;

import java.util.Scanner;

public class TestFraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Num: ");
            int num = Integer.parseInt(input.nextLine());
            System.out.println("Deno: ");
            int deno = Integer.parseInt(input.nextLine());
            Fraction f= new Fraction(num,deno);
            System.out.println("Numberator: " + num + "\nDenominator: " + deno);
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
