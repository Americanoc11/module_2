package ss6_inheritance.thuc_hanh.package_geometry;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {

    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return (radius * 2) * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    Shape c = new Shape();

    @Override
    public String toString() {
        return "Circle with radius= " + radius + "\n" + "which is a subclass of= " + c.toString();
    }
}
