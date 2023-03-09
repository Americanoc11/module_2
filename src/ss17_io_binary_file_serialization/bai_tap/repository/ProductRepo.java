package ss17_io_binary_file_serialization.bai_tap.repository;

import ss17_io_binary_file_serialization.bai_tap.common.ReadFile;
import ss17_io_binary_file_serialization.bai_tap.common.WriteFile;
import ss17_io_binary_file_serialization.bai_tap.model.Product;

import java.util.List;

public class ProductRepo implements IProductRepo{
    public static String file="src/ss17_io_binary_file_serialization/bai_tap/data/Product.txt";
    @Override
    public void display() {
        List<Product> productList= ReadFile.read(file);
        for (Product p: productList){
            System.out.println(p.toString());
        }

    }

    @Override
    public void add(Product product) {
        WriteFile.writeFile(file,product);
    }
}
