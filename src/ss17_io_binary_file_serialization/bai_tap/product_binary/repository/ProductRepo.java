package ss17_io_binary_file_serialization.bai_tap.product_binary.repository;

import ss17_io_binary_file_serialization.bai_tap.product_binary.common.FileRead;
import ss17_io_binary_file_serialization.bai_tap.product_binary.common.FileWrite;
import ss17_io_binary_file_serialization.bai_tap.product_binary.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo implements IProductRepo {
    public static final String path = "src/ss17_io_binary_file_serialization/bai_tap/product_binary/data/product.txt";
    public static final String pathBinary = "src/ss17_io_binary_file_serialization/bai_tap/product_binary/data/binary_product.txt";

    @Override
    public void display() {
//        List<Product> products= FileRead.read(path);
//        for (Product p: products){
//            System.out.println(p.toString());
//        }
        List<Product> productList = FileRead.readDataFromFile(pathBinary);
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Override
    public void add(Product newProduct) {
        List<Product> products = new ArrayList<>();
        products.add(newProduct);
        FileWrite.write(path, newProduct);
        FileWrite.writeDataToFile(pathBinary, products);
    }

    @Override
    public void findIformation(String name) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).equals(name)) {
                System.out.println("Sản phẩm: "
                        + products.get(i).getName()
                        +"Mô tả: "+products.get(i).getDescrible());
            } else {
                System.out.println("Sản phẩm không tồn tại ");;
            }
        }
    }
}
