package ss7_abstract_class_interface.thuc_hanh.abstraclass_geometric;

public class RectancleController {
    public static void main(String[] args) {
        Rectancle rectancle= new Rectancle();
        System.out.println(rectancle.toString());
        Rectancle recOne= new Rectancle(5.0,10.0);
        System.out.println(recOne.getArea());
        System.out.println(recOne.getPerimeter());
        System.out.println(recOne.toString());

    }
}
