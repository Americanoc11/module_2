package ss7_abstract_class_interface.bai_tap.deployment_interface_shape;

public class RectancleController {
    public static void main(String[] args) {
        Rectancle rectancle = new Rectancle(5.0, 10.0);
        System.out.println(rectancle.toString());
        System.out.println("Rectancle percent: " + rectancle.resize(5.0));
        Square square = new Square();
        square.setHeight(5.0);
        System.out.println(square.toString());
        System.out.println("Square percent: " + square.resize(3.0));
    }
}
