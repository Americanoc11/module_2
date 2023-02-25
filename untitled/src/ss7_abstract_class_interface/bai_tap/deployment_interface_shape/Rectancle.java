package ss7_abstract_class_interface.bai_tap.deployment_interface_shape;

public class Rectancle implements IResizeable {
    private double width;
    private double height;

    public Rectancle() {

    }

    public Rectancle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectancle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double resize(double percent) {
        return ((width * height) * percent) / 100;
    }
}
