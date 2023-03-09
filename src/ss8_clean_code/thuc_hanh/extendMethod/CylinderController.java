package ss8_clean_code.thuc_hanh.extendMethod;

public class CylinderController {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2.0, 5.0);
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Perimeter: " + cylinder.getPerimeter());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
