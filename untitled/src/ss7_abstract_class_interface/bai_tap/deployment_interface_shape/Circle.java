package ss7_abstract_class_interface.bai_tap.deployment_interface_shape;

public class Circle implements IResizeable{
    private double radius;
    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double resize(double percent) {
        return (radius*percent)/100;
    }
}
