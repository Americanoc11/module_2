package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class Compounding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter money");
        double money = input.nextDouble();
        System.out.println("Enter a month send money");
        int month = input.nextInt();
        System.out.println("Enter percent");
        double percent= input.nextDouble();
        double interest= money*(percent/12);
        for (int i = 0; i < month; i++) {

        }
    }
}
