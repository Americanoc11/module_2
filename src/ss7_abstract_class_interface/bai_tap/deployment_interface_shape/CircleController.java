package ss7_abstract_class_interface.bai_tap.deployment_interface_shape;

public class CircleController {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());
        circle.setRadius(2.0);
        System.out.println("Percent radius: " + circle.resize(25.0));
    }
}
