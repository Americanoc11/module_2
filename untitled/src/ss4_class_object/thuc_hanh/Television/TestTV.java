package ss4_class_object.thuc_hanh.Television;

public class TestTV {
    int channel = 1;
    int volume = 1;
    boolean on = false;

    public TestTV() {
    }

    ;

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void channelup() {
        if (on && channel < 120) {
            channel++;
        }
    }

    public void channelDown() {
        if (on && channel < 120 || channel > 0) {
            channel--;
        }
    }

    public void volumeUp() {
        if (on && volume < 7) {
            volume++;
        }
    }

    public void volumeDown() {
        if (on && volume > 0 || volume < 7) {
            volume--;
        }
    }

    public static void main(String[] args) {
        TestTV sony = new TestTV();
        sony.turnOn();
        sony.setChannel(30);
        sony.setVolume(6);
        sony.channelup();
        sony.volumeUp();
        System.out.println("TV channel is " + sony.channel + " add volume " + sony.volume);
    }
}
