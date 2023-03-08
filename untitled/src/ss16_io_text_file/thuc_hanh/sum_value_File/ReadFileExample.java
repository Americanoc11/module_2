package ss16_io_text_file.thuc_hanh.sum_value_File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s= "Hello World";
        String c="C1222G1";
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter= null;
        try {
            fileWriter = new FileWriter("src/ss16_io_text_file/thuc_hanh/sum_value_File/textSumValue.txt");
            bufferedWriter= new BufferedWriter(fileWriter);
            bufferedWriter.write(s);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }

}

