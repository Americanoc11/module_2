package ss16_io_text_file.bai_tap.read_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReadFile {
    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src/ss16_io_text_file/bai_tap/read_file/test.txt");
            bufferedReader= new BufferedReader(fileReader);
            String line="";
            while ((line= bufferedReader.readLine())!=null){
                System.out.println(line);
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

    }
}

