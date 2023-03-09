package ss7_abstract_class_interface.thuc_hanh.abstraclass_geometric;

public class CircleController {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(2.0);
        System.out.println(circle.toString());
        System.out.println("Area circle: " + circle.getArea());
        System.out.println("Perimeter circle: " + circle.getPerimeter());

    }
}
