package ss17_io_binary_file_serialization.bai_tap_csv.repository;

import ss17_io_binary_file_serialization.bai_tap_csv.common.ReadFile;
import ss17_io_binary_file_serialization.bai_tap_csv.common.WriteFile;
import ss17_io_binary_file_serialization.bai_tap_csv.model.Product;

import java.util.List;

public class ProductRepository implements ss17_io_binary_file_serialization.bai_tap_csv.repository.IProductRepository {
    public static final String file="src/ss17_io_binary_file_serialization/bai_tap_1/data/Product.txt";
    @Override
    public void display() {
//        List<Product> productList= new ArrayList<>();
//        if (productList.size()==0){
//            System.out.println("Không có sản phẩm");
//        } else {
//            for (Product p: productList){
//                System.out.println(p);
//            }
//        }
        List<Product> list= ReadFile.read(file);
        for (Product p: list){
            System.out.println(p.toString());
        }
    }

    @Override
    public void add(Product product) {
        List<Product> list= WriteFile.write(file,product);
    }
}
