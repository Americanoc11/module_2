package ss17_io_binary_file_serialization.bai_tap_1.product_binary.common;

import ss17_io_binary_file_serialization.bai_tap_csv.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    public static List<Product> write(String file, List<Product> product) {
       List<Product> list= new ArrayList<>();
        ObjectOutputStream objectOutputStream = null;
        try {

            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(product);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
