package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class DeltaOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, delta;
        System.out.println("aX + b = 0");
        System.out.println("Enter a number a ");
        a = input.nextInt();
        System.out.println("Enter a number b");
        b = input.nextInt();
        delta = (-b) / a;
        if (a == 0 && b == 0) {
            System.out.println(" Wealth of counter");
        } else if (a == 0 && b != 0) {
            System.out.println(" no solution ");
        } else if (a != 0) {
            System.out.println("Have a solution: " + delta);
        }

    }
}
