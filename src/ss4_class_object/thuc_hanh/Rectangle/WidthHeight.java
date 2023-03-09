package ss4_class_object.thuc_hanh.Rectangle;

import ss4_class_object.thuc_hanh.Rectangle.Rectangle;

import java.util.Scanner;

public class WidthHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a width");
        int width = input.nextInt();
        System.out.println("Enter a height");
        int height = input.nextInt();
        String display = "";
        Rectangle length = new Rectangle(width, height);
        System.out.println("Area : " + length.getArea());
        System.out.println("Perimeter: " + length.getPerimeter());
        System.out.println(length.getDisplay(display, width, height));
    }
}

