package ss2_loop.bai_tap;

public class AlertPrime20 {
    public static void main(String[] args) {
        int number = 0;
        int count = 0;
        while (count < 20) {
            if (number >= 2) {
                boolean flag = true;
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(number);
                    count++;
                }
            }
            number++;
        }
    }
}
