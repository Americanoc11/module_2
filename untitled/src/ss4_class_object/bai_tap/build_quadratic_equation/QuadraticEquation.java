package ss4_class_object.bai_tap.build_quadratic_equation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getA() {
        return this.a;
    }

    double getB() {
        return this.b;
    }

    double getC() {
        return this.c;
    }

    double getDiscriminat() {
        double delta = b * b - 4 * a * c;
        return delta;
    }

    double getRoot1() {
        return (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / 2 * a;
    }

    double getRoot2() {
        return (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / 2 * a;
    }

}
