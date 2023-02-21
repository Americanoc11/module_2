package ss4_class_object.bai_tap.Fan;

public class FanController {
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
