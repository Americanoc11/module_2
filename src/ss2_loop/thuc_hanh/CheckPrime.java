package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int check = input.nextInt();
        if (check < 2) {
            System.out.println("Number: " + check + " not a prime");
        } else {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(check); i++) {
                if (check % i == 0) {
                    flag=false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Number: " + check + " is a prime");
            } else {
                System.out.println("Number: " + check + " not a prime");
            }
        }

    }
}
