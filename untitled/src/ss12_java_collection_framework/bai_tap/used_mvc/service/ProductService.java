package ss12_java_collection_framework.bai_tap.used_mvc.service;

import ss12_java_collection_framework.bai_tap.used_mvc.model.Product;
import ss12_java_collection_framework.bai_tap.used_mvc.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private ProductRepository productRepository = new ProductRepository();
    Scanner input = new Scanner(System.in);

    @Override
    public void displayProduct() {
        productRepository.displayProduct();
    }

    @Override
    public void deleted(int id) {
        productRepository.deleted(id);
    }

    @Override
    public void findProduct(String name) {
        productRepository.findProduct(name);
    }

    @Override
    public void addProduct() {
        System.out.println("Nhập mã sản phẩn");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = input.nextLine();
        System.out.println("Nhập nhà phân phối");
        String tradeMark = input.nextLine();
        Product newProduct = new Product(id, name, tradeMark);
        productRepository.add(newProduct);
    }
}
