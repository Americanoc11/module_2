package ss6_inheritance.bai_tap.package_circle;

public class Cylinder extends Circle {
    public double height;

    public Cylinder() {
        super();
        this.getRadius();
        this.getColor();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolunm() {
        return (height * Math.pow(getRadius(), 2) * Math.PI);
    }

    @Override
    public String toString() {
        return super.toString() +
                "height=" + height + ", Volunm=" + getVolunm() +
                '}';
    }
}
