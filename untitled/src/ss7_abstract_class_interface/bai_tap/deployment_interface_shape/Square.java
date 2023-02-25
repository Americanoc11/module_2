package ss7_abstract_class_interface.bai_tap.deployment_interface_shape;

public class Square extends Rectancle implements IResizeable {
    public Square() {

    }

    public Square(double width, double height) {
        super(width, height);
    }

    @Override
    public String toString() {
        return "Square{ height " + super.getHeight() + " }";
    }

    @Override
    public double resize(double percent) {
        return (getHeight() * percent) / 100;
    }
}
