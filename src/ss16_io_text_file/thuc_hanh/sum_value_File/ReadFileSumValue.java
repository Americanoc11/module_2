package ss16_io_text_file.thuc_hanh.sum_value_File;

import java.io.*;

public class ReadFileSumValue {
    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line;
        int sum = 0;
        int max= 0;
        try {
            fileReader = new FileReader("src/ss16_io_text_file/thuc_hanh/sum_value_File/textSumValue.txt");
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                max=Integer.parseInt(line);

                sum +=Integer.parseInt(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
        System.out.println(sum);
    }
}
