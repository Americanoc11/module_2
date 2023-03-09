package ss16_io_text_file.bai_tap.popy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileTest {
    public static void main(String[] args) {
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        List<String> array= new ArrayList<>();
        try {
             fileReader= new FileReader("src/ss16_io_text_file/thuc_hanh/sum_value_File/textSumValue.txt");
             bufferedReader= new BufferedReader(fileReader);
             String line="";
             while ((line= bufferedReader.readLine())!=null){
                 array.add(line);

             }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src/ss16_io_text_file/bai_tap/popy_file_text/CopyFileTest");
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String s: array){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
