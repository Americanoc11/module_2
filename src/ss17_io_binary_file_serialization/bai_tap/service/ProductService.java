package ss17_io_binary_file_serialization.bai_tap.service;

import ss17_io_binary_file_serialization.bai_tap.model.Product;
import ss17_io_binary_file_serialization.bai_tap.repository.ProductRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
    ProductRepo productRepo= new ProductRepo();
    @Override
    public void display() {
        productRepo.display();
    }

    @Override
    public void add() {
        List<Product> productList= new ArrayList<>();
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập id sản phẩm");
        String id= input.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String name=input.nextLine();
        System.out.println("Nhập giá tiền");
        String price=input.nextLine();
        System.out.println("Nhập hàng sản xuất");
        String goods=input.nextLine();
        System.out.println("Mô tả sản phẩm");
        String decrible=input.nextLine();
        Product product= new Product(id,name,price,goods,decrible);
        productRepo.add(product);
    }
}
