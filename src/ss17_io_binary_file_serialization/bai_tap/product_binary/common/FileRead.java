package ss17_io_binary_file_serialization.bai_tap.product_binary.common;

import ss17_io_binary_file_serialization.bai_tap.product_binary.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileRead {
    public static List<Product> read(String path){
        List<Product> list= new ArrayList<>();
        try {
            BufferedReader bufferedReader= new BufferedReader(new FileReader(path));
            String temp="";
            Product product;
            String[] tempArr;
            while ((temp= bufferedReader.readLine())!=null){
                tempArr=temp.split(",");
                product= new Product(tempArr[0],tempArr[1]
                        ,tempArr[2],tempArr[3],tempArr[4]);
                list.add(product);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return list;
    }
    public static List<Product> readDataFromFile(String path){
        List<Product> productList= new ArrayList<>();
        ObjectInputStream objectInputStream= null;
        try {
             objectInputStream= new ObjectInputStream(new FileInputStream(path));
             
        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return productList;
    }
}
