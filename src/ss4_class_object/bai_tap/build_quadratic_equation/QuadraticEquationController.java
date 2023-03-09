package ss4_class_object.bai_tap.build_quadratic_equation;

import java.util.Scanner;

public class QuadraticEquationController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value a");
        double a = Double.parseDouble(input.nextLine());
        System.out.println("Enter value b");
        double b = Double.parseDouble(input.nextLine());
        System.out.println("Enter value c");
        double c = Double.parseDouble(input.nextLine());
        QuadraticEquation ex1 = new QuadraticEquation(a, b, c);
        ex1.getDiscriminat();
        if (ex1.getDiscriminat() > 0) {
            System.out.println("X1: " + ex1.getRoot1() + " X2: " + ex1.getRoot2());
        } else if (ex1.getDiscriminat() == 0) {
            System.out.println(" The equation has no real roots ");
        } else {
            System.out.println("The equation has no one root: " + ex1.getDiscriminat());
        }
    }
}
