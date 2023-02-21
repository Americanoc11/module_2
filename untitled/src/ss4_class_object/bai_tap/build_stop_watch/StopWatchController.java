package ss4_class_object.bai_tap.build_stop_watch;

public class StopWatchController {
    public static void main(String[] args) {

        StopWatch rolex = new StopWatch();
        rolex.start();
        int a = 6;
        for (int i = 0; i < 10000000l; i++) {
            a = 5;
        }
        rolex.stop();
        System.out.println(rolex.getElasedTime());
        System.out.println(rolex.date);
    }
}

