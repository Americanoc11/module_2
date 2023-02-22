package ss5_accessModifier_staticMethod_staticProperty.bai_tap.circle;

public class TestCircleController {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getRadius();
        circle.getArea();
        System.out.println(circle.getArea());
        Circle circle1 = new Circle(2.0);
        System.out.println(circle1.getArea());
    }
}
