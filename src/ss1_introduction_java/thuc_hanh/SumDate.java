package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class SumDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month");
        int month = input.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Month: " + month + " have 31 day");
                break;
            case 4:
            case 6:
            case 11:
                System.out.println("Month: " + month + " have 30 day");
                break;
            case 2:
                System.out.println("Month: " + month + " have 28,29 day");
                break;
            default:
                System.out.println(" Not found");
                break;
        }
    }
}
