package ss6_inheritance.bai_tap.package_circle;

public class Circle {
    private double radius=1.0;
    private String color="Green";

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {

        return (radius * 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color;
    }
}
