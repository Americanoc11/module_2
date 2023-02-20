package ss4_class_object.bai_tap.build_stop_watch;

import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    Scanner input = new Scanner(System.in);

    public Date date = new Date();
    private long startTime;
    private long endTime;

    public StopWatch() {
    }


    long start() {
        Date date = new Date();
        startTime = date.toInstant().toEpochMilli();
        return startTime;
    }


    long stop() {
        Date date = new Date();
        endTime  = date.toInstant().toEpochMilli();
        return endTime;
    }

    public long getElasedTime() {
        return this.endTime - startTime;
    }

    public static void main(String[] args) {

        StopWatch rolex = new StopWatch();
        System.out.println(rolex.date);
        rolex.start();

        rolex.stop();
        System.out.println(rolex.getElasedTime());
    }
}


