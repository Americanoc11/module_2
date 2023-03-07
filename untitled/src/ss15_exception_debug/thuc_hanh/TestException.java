package ss15_exception_debug.thuc_hanh;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        /**
         * Lỗi biên dịch nếu không nhập đúng kieu du lieu
         * InputMismatchException
         */
/*
         Scanner scanner = new Scanner(System.in);
         System.out.printf("Numerator:");
         int numerator = scanner.nextInt();
         System.out.printf("Denominator:");
         int denominator = scanner.nextInt();
         int result = numerator/denominator;
         System.out.printf("\nResult: %d / %d = %d \n",numerator, denominator, result);

 */

        /**
         * Lỗi runtime nếu nhập quá giá trị của mảng
         * ArrayIndexOutOfBoundsException
         */
//        int[] arr=new int[5];
//        arr[6]=0;
        /**
         *
         *NullPointerException
         */
        /*
        String str=null;
        String str1="Duc";
        if (str.equals(str1)){   // đổi đk lại > str1.equals(str1)
            System.out.println("Đ");
        } else {
            System.out.println("S");
        }
         */
        /**
         * lỗi bị tràn vùng nhớ
         * StackOverFlowError
         */
    }
}
