package ss8_clean_code.thuc_hanh.extendMethod;

public class Cylinder {
    public static double getVolume(double radius, double height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }


    private static double getBaseArea(double radius) {
        return (2 * Math.PI) * radius;
    }

    private static double getPerimeter(double radius) {
        return (radius * 2) * Math.PI;
    }
    private double radius;

    private double height;

    public Cylinder() {

    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return getBaseArea(getRadius());
    }

    double getPerimeter() {
        return getPerimeter(getRadius());
    }

    double getVolume() {
        return getVolume(getRadius(), getHeight());
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
