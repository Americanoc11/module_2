package ss15_exception_debug.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class TriangleController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side 1 for triangle");
        double side1;
        do {
            side1 = Double.parseDouble(input.nextLine());
            try {
                side1 = Double.parseDouble(input.nextLine());
            } catch (Exception e) {
                System.out.println("Error syntax");
            }
        } while (side1 >= 0);

    }
}
