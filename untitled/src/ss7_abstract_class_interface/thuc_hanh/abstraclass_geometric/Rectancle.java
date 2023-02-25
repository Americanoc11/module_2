package ss7_abstract_class_interface.thuc_hanh.abstraclass_geometric;

public class Rectancle extends GeometricObject{
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
public Rectancle() {

}
    public Rectancle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectancle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectancle{" +
                "width=" + width +
                ", height=" + height + super.toString()+
                '}';
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return (width+height)*2;
    }
}
