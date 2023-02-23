package ss6_inheritance.bai_tap.package_moveablePoint;

import ss6_inheritance.bai_tap.package_point2D_3D.Point2D;

public class PointController {
    public static void main(String[] args) {
        Point pointOne = new Point();
        System.out.println(pointOne.toString());
        Point pointTwo = new Point(1.0f, 2.0f);
        pointTwo.setXY(1.0f, 2.0f);
        System.out.println(pointTwo.toString());
        MovablePoint onePoint= new MovablePoint();
        System.out.println(onePoint.toString());
    }
}
