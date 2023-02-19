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
        System.out.println("Enter a year");
        int year = input.nextInt();
        System.out.println("Enter a month");
        int month = input.nextInt();
        System.out.println("Enter date");
        int date1 = input.nextInt();
        System.out.println("Enter hours");
        int hrs = input.nextInt();
        System.out.println("Enter min");
        int min = input.nextInt();
        System.out.println("Enter sec");
        int sec = input.nextInt();
        Date date2 = new Date(year, month, date1, hrs, min, sec);
        System.out.println(date2);
        endTime = date2.toInstant().toEpochMilli();
        return endTime;
    }

    public long getElasedTime() {
        return this.start() + endTime;
    }

    public static void main(String[] args) {
        StopWatch rolex = new StopWatch();
        System.out.println(rolex.date);
        rolex.stop();
        System.out.println(rolex.endTime);
        System.out.println(rolex.getElasedTime());
    }
}


