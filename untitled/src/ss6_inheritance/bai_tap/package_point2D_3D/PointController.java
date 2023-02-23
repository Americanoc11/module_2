package ss6_inheritance.bai_tap.package_point2D_3D;

public class PointController {
    public static void main(String[] args) {
        Point2D twoD = new Point2D();
        System.out.println(twoD.toString());
        Point2D twoD1 = new Point2D(2.0f, 5.0f);
        System.out.println(twoD1.toString());
        twoD1.setXY(3.0f, 3.0f);
        System.out.println(twoD1.toString());
        System.out.println("--------------------");
        Point3D threeD = new Point3D();
        System.out.println(threeD.toString());
        Point3D threeD1 = new Point3D();
        threeD1.setX(7.33f);
        threeD1.setY(5.0f);
        threeD1.setZ(0.5f);
        System.out.println(threeD1.toString());

    }
}
