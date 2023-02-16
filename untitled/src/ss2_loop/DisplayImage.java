package ss2_loop;

import java.util.Scanner;

public class DisplayImage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, height, width;
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print iosceles triangle");
        System.out.println("4. Exit");
        do {
            System.out.println(" Choice a number");
            number = input.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Enter a height");
                    height = input.nextInt();
                    System.out.println("Enter a width");
                    width = input.nextInt();
                    for (int i = 0; i < height; i++) {
                        System.out.println();
                        for (int j = 0; j < width; j++) {
                            System.out.print("*" + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter a height");
                    height = input.nextInt();
                    for (int i = 0; i < height; i++) {
                        System.out.println();
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*" + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter a height");
                    height = input.nextInt();
                    for (int i = 0; i < height; i++) {
                        System.out.println();
                        for (int j = height; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k <= i * 2; k++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("not found");
                    break;
            }
        } while (number < 4);
    }
}
