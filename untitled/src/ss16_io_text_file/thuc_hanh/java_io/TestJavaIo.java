package ss16_io_text_file.thuc_hanh.java_io;

import java.util.Scanner;

public class TestJavaIo {
    public static void main(String[] args) {
        /**
         Chữ màu đỏ thể hiện cho lỗi
         System.err.println("Error message");
         */
        Scanner input= new Scanner(System.in);
         int   j=Integer.parseInt(input.nextLine());
        System.out.println((char) j );
    }
}
