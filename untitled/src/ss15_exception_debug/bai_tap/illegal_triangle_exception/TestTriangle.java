package ss15_exception_debug.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class TestTriangle {

    public void triangle() throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a side 1: ");
        int side1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a side 2: ");
        int side2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a side 3:  ");
        int side3 = Integer.parseInt(scanner.nextLine());

        if (side1 <= 0 || side2 <= 0 || side3 <= 0 ||
                side1 + side2 < side3 ||
                side2 + side3 < side1 ||
                side3 + side1 < side2) {
            throw new IllegalTriangleException("Side is not condition. Please replay");
        } else {
            System.out.println("Three side triangle: " + side1 + " " + side2 + " " + side3);
        }
    }

    public static void main(String[] args) {
        TestTriangle testTriangle = new TestTriangle();
        boolean flag = true;
        do {
            flag = false;
            try {
                testTriangle.triangle();
            } catch (IllegalTriangleException e) {
                e.getMessage();
                flag = true;
                System.out.println("Replay");
            }
        } while (flag);
    }
}
