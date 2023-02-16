package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class FindYearLeap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.println("Enter a year");
        year = input.nextInt();
        boolean isLeapYear = false;
        boolean isDivisible4 = year % 4 == 0;
        if (isDivisible4) {
            boolean isDivisible100 = year % 100 == 0;
            if (isDivisible100) {
                boolean isDivinsible400 = year % 400 == 0;
                if (isDivinsible400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println("Year: " + year + " is a leap year");
        } else {
            System.out.println("Year: " + year + " is not a leap year");
        }
    }
}
