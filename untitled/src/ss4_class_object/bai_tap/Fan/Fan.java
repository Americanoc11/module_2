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


    String display() {
        if (on) {
            System.out.println("Speed: " + this.speed + " Color: " + this.color + " radius: " + this.radius);
        } else {
            System.out.println("Speed: " + this.speed + " Color: " + this.color + " radius: " + this.radius + " Status: " + this.on);
        }
        return toString();
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.getTurnOn();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.display();
        Fan fan2 = new Fan();
        fan2.getTurnOff();
        fan2.setSpeed(fan1.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.display();
        System.out.println(fan2.toString());
    }
}
