package ss16_io_text_file.thuc_hanh.io_java;

import java.io.FileWriter;
import java.io.IOException;

public class WriteATextfile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("D:\\codegym\\module_2\\untitled\\src\\ss16_io_text_file\\thuc_hanh\\io_java\\hello.txt");
            writer.write("Hello world");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
