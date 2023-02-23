package ss5_accessModifier_staticMethod_staticProperty.bai_tap.build_class_java;

import ss6_inheritance.bai_tap.package_circle.Circle;
import ss6_inheritance.bai_tap.package_circle.Cylinder;

public class CircleController {
    public static void main(String[] args) {
        Circle cir1 = new Circle();
        cir1.getRadius();
        cir1.getColor();
        Cylinder cyl = new Cylinder();
        cyl.setHeight(10.0);
        cyl.getVolunm();
        System.out.println(cyl.toString());
    }
}
