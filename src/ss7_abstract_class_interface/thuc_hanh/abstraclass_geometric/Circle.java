package ss7_abstract_class_interface.thuc_hanh.abstraclass_geometric;

import java.util.Date;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + super.toString() +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * radius * 2;
    }

    @Override
    public double getPerimeter() {
        return (radius * 2) * Math.PI;
    }
}
