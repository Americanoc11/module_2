package ss4_class_object.bai_tap.Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private boolean on = false;
    private int speed = SLOW;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    boolean getTurnOn() {
        on = true;
        return on;
    }

    boolean getTurnOff() {
        on = false;
        return on;
    }

    int getSpeed() {
        return this.speed;
    }

    int setSpeed(int speed) {
        this.speed = speed;
        return this.speed;
    }

    double getRadius() {
        return this.radius;
    }

    double setRadius(double radius) {
        this.radius = radius;
        return this.radius;
    }

    String getColor() {
        return this.color;
    }

    String setColor(String color) {
        this.color = color;
        return this.color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "on=" + on +
                ", speed=" + speed +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    String display() {
        if (on == false) {
            System.out.println("Fan is off");
        } else {
            toString();
        }
        return null;
    }
}
