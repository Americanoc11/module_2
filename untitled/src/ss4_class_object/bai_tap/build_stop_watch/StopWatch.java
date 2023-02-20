package ss4_class_object.bai_tap.build_stop_watch;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    Scanner input = new Scanner(System.in);

    private long startTime;
    private long endTime;

    public StopWatch() {
    }


    void start() {
        startTime = new Date().toInstant().toEpochMilli();
    }


    void stop() {
        endTime  = new Date().toInstant().toEpochMilli();
    }

    public long getElasedTime() {
        return this.endTime - startTime;
    }

    public static void main(String[] args) {

        StopWatch rolex = new StopWatch();
        rolex.start();
        int a = 6;
        System.out.println(rolex.startTime);
        for (int i =0; i<100000000l; i++) {
            a =5;
        }
        rolex.stop();
        System.out.println(rolex.endTime);
        System.out.println(rolex.getElasedTime());

    }
}


