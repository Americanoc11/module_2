package ss17_io_binary_file_serialization.bai_tap.product_binary.common;

import ss17_io_binary_file_serialization.bai_tap.product_binary.model.Product;

import java.io.*;
import java.util.List;

public class FileWrite {
    public static void write(String path, Product product) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path,true));
            bufferedWriter.write(product.writeToCsv());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void writeDataToFile(String path, List<Product> products){
        ObjectOutputStream objectOutputStream= null;
            try {
                objectOutputStream= new ObjectOutputStream(new FileOutputStream(path,false));
                objectOutputStream.writeObject(products);
                objectOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            }
        }

}
