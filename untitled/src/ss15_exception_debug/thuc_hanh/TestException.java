package ss15_exception_debug.thuc_hanh;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        /**
         * InputMismatchException
         * Lỗi biên dịch nếu không nhập đúng kieu du lieu
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
         * ArrayIndexOutOfBoundsException
         * Lỗi runtime nếu nhập quá giá trị của mảng
         * , Nếu bạn chèn bất kỳ giá trị nào vào index sai
         */
//        int[] arr=new int[5];
//        arr[6]=0;
        /**
         *NullPointerException
         *Nếu chúng ta có bất kỳ biến nào có giá trị null
         * , thực hiện bất kỳ hoạt động nào bởi biến đó
         * sẽ xảy ra ngoại lệ NullPointerException.
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
         * StackOverFlowError
         * lỗi bị tràn vùng nhớ
         */

        /**
         * ArithmeticException
         * Lỗi nếu chúng ta chia cho 0
        */
//        System.out.println(5 / 0);
        /**
         * NumberFormatException
         * Lỗi nếu chúng ta bỏ string la chữa
         */
//        String s="abc";
//       String[] i1= s.split("");
//        int i=Integer.parseInt(s);//NumberFormatException
//
//
//        System.out.println(i);
        /**
         * lỗi biên dịch không thể chuyển int thành array
         * incompatible types
         */
//        String s="1234123123";
//        String[] i1= s.split("");
//        int i=Integer.parseInt(s);//NumberFormatException
//
//
//        System.out.println(i);
    }
}
