package ss2_loop.bai_tap;

import java.util.Scanner;

public class AlertPrimse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int count = 0;
        while (count < 100) {
            if (number >= 2) {
                boolean flag = true;
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    if (number < 100) {
                        System.out.println(number);
                    }
                    count++;
                }
            }
            number++;
        }
    }
}
