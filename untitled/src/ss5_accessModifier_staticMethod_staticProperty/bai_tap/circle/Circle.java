package ss5_accessModifier_staticMethod_staticProperty.bai_tap.circle;

public class Circle {
    private double radius = 1.0;
    String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * 2;
    }

}
