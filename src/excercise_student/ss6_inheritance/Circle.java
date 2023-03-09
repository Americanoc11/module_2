package excercise_student.ss6_inheritance;

public class Circle {
    private double radius;
    // radius không thể kế thừa
    private String color;
    // color không thể kế thừa

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }// có thể gọi lại constructor

    public double getRadius() {
        return radius;
    }// được kế thừa

    public void setRadius(double radius) {
        this.radius = radius;
    }// được kế thừa

    public String getColor() {
        return color;
    }// được kế thừa

    public void setColor(String color) {
        this.color = color;
    }// được kế thừa

    double getArea() {
        return (Math.PI * 2) * radius;
    }// được kế thừa

    double getPerimeter() {
        return (radius * 2) * Math.PI;
    }// được kế thừa

    @Override
    public String toString() {
        return "Circle{" +
                "radius: " + radius +
                ", color: '" + color + '\''
                + ", area: " + getArea()
                + ", perimeter: " + getPerimeter() +
                '}';
    }// được kế thừa
}
