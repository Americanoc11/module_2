package ss7_abstract_class_interface.bai_tap.deployment_interface_colorable_shape;

public class Square implements IColorable {
    private double height;

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                '}';
    }

    public Square() {

    }


    public Square(double height) {
        this.height = height;
    }

    @Override
    public void howToColor() {
        System.out.println("Color: Blue");
    }
}
