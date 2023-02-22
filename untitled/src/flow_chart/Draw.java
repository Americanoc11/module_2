package flow_chart;

public class Draw {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println();
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2; j++) {
                if (j == i * 2 - 1 || j == 0) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
        }
        for (int i = 4; i > 0; i--) {
            System.out.println();
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < 5 * 2; j++) {
                if (j == 1 || j == 5 * 2) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

}
