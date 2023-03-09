package ss4_class_object.thuc_hanh.Rectangle;

public class Rectangle {
    public int width;
    public int height;

    public Rectangle(int width1, int height1) {
        width = width1;
        height = height1;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return (width + height) * 2;
    }

    public String getDisplay(String display, int width, int height) {
        for (int i = 0; i < width; i++) {
            System.out.println();
            for (int j = 0; j < height; j++) {
                System.out.print("*" + " ");
            }
        }
        return "";
    }
}
