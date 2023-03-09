package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class UseOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height, width, acreage;
        System.out.println("Enter a height");
        height = input.nextInt();
        System.out.println("Enter a width");
        width = input.nextInt();
        acreage = height * width;
        System.out.println("Rectangular area: " + acreage);
    }
}
