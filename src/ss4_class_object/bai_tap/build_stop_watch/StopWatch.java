package ss4_class_object.bai_tap.build_stop_watch;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    Scanner input = new Scanner(System.in);
    Date date= new Date();

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

}


