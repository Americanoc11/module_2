package ss17_io_binary_file_serialization.bai_tap_csv.service;

import ss17_io_binary_file_serialization.bai_tap_1.product_binary.service.IProductService;
import ss17_io_binary_file_serialization.bai_tap_csv.model.Product;
import ss17_io_binary_file_serialization.bai_tap_csv.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    ProductRepository productRepository = new ProductRepository();
    Scanner input = new Scanner(System.in);

    public void display() {
        productRepository.display();
    }

    @Override
    public void add() {
        List<Product> productList = new ArrayList<>();
        System.out.println("Nhập id sản phẩm");
        String id = input.nextLine();
        System.out.println(" Nhập tên sản phẩm");
        String name = input.nextLine();
        System.out.println("Nhập giá tiền");
        String price = input.nextLine();
        System.out.println("Nhập hàng sản xuất");
        String goods = input.nextLine();
        System.out.println("Mô tả sản phẩm");
        String describle = input.nextLine();
        Product product = new Product(id, name, price, goods, describle);
        productRepository.add(product);

    }
}
