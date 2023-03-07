package ss15_exception_debug.bai_tap.illegal_triangle_exception;

public class TriangleException extends Exception {
    private double a;
    private double b;
    private double c;

    public TriangleException(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TriangleException(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }


    public void triangle(double side1, double side2, double side3) {
        double a = side1;
        double b = side2;
        double c = side3;
        try {
            if (a != 0 || b != 0 || c != 0) {
                throw new RuntimeException();
            }
            if (a < (b + c) || b < (a + c) || c < (a + b)) {
                System.out.println("Side are a Triangle");
            } else {
                System.out.println("Side aren't a Triangle");
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}


