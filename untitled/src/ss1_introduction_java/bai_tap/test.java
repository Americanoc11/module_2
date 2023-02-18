package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt();
        if ((year % 100 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println("The leap year: " + year);
        } else {
            System.out.println("Is not the leap year" + year);
        }
    }
}
