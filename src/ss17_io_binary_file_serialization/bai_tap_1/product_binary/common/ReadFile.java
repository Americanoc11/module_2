package ss17_io_binary_file_serialization.bai_tap_1.product_binary.common;

import ss17_io_binary_file_serialization.bai_tap_csv.model.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Product> read(String file) {
        List<Product> productList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String temp = "";
            Product product;
            String[] tempArr;
            while ((temp = bufferedReader.readLine()) != null) {
                tempArr = temp.split(",");
                product = new Product(tempArr[0], tempArr[1], tempArr[2], tempArr[3], tempArr[4]);
                productList.add(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productList;
    }
}
