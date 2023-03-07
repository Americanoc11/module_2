package ss15_exception_debug.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class TriangleController {
    public static void main(String[] args) throws TriangleException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a side 1");
        double side1 = Double.parseDouble(input.nextLine());
        System.out.println("Enter a side 2");
        double side2 = Double.parseDouble(input.nextLine());
        System.out.println("Enter a side 3");
        double side3 = Double.parseDouble(input.nextLine());
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            throw new TriangleException("Side aren't a triangle");
        }
    }
}
