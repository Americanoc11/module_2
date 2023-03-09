package ss17_io_binary_file_serialization.bai_tap.common;

import ss17_io_binary_file_serialization.bai_tap.model.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeFile(String file, Product product){
        BufferedWriter bufferedWriter=null;
        try {
             bufferedWriter= new BufferedWriter(new FileWriter(file,true));
        bufferedWriter.write(product.writeToCsv());
        bufferedWriter.newLine();
        bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
