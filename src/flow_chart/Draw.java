package flow_chart;

public class Draw {
    //    public static void main(String[] args) {
//        for (int i = 1; i < 5; i++) {
//            System.out.println();
//            for (int j = 5; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i * 2; j++) {
//                if (j == i * 2 - 1 || j == 0) {
//                    System.out.print(i);
//                } else {
//                    System.out.print(" ");
//                }
//            }
//        }
//        for (int i = 4; i > 0; i--) {
//            System.out.println();
//            for (int j = 4; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j < 5 * 2; j++) {
//                if (j == 1 || j == 5 * 2) {
//                    System.out.print(i);
//                } else {
//                    System.out.print(" ");
//                }
//            }
//        }
//    }
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6 - i; j++) {
                System.out.print(" ");
            }
            System.out.print(i + " ");
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            if (i != 0) {
                System.out.print("" + i);
            }
            System.out.println();
        }
        for (int i = 6 - 2; i > 0; i--) {
            for (int j = 1; j <= 6 - i-1; j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            if (i != 0) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}
