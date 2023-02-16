package ss2_loop;

public class AlertPrime20 {
    public static void main(String[] args) {
        int number = 0;
        int count = 0;
        while (count < 20) {
            if (number < 2) {
            } else {
                boolean flag = true;
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }
                if (flag) {
                    count++;
                    System.out.println(number);
                }
            }
            number++;
        }
    }
}
