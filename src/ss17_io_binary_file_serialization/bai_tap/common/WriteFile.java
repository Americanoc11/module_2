package ss17_io_binary_file_serialization.bai_tap_csv.common;

import ss17_io_binary_file_serialization.bai_tap_csv.model.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    public static List<Product> write(String file, Product product) {
        List<Product> list= new ArrayList<>();
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(product.writeToCsv());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
