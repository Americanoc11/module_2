package ss17_io_binary_file_serialization.bai_tap.product_binary.service;

import ss17_io_binary_file_serialization.bai_tap.product_binary.model.Product;
import ss17_io_binary_file_serialization.bai_tap.product_binary.repository.IProductRepo;
import ss17_io_binary_file_serialization.bai_tap.product_binary.repository.ProductRepo;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
    IProductRepo iProductRepo= new ProductRepo();
    @Override
    public void display() {
        iProductRepo.display();
    }

    @Override
    public void add() {
        List<Product> list= new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String id;
        boolean isId;
        do {
            try{
                System.out.println("Nhập id sản phẩm");
                id =input.nextLine();
                break;
            }catch (NumberFormatException e){
                System.out.println("Bạn phải nhập số ");
                isId= true;
            }
        }while (true);
        System.out.println(" Nhập tên sản phẩm ");
        String name= input.nextLine();
        System.out.println("Nhập giá tiền");
        String price=input.nextLine();
        System.out.println("Nhập hàng sản xuất");
        String goods=input.nextLine();
        System.out.println(" Mô tả sản phẩm");
        String describle=input.nextLine();
        Product newProduct= new Product(id,name,price,goods,describle);
        iProductRepo.add(newProduct);
    }
}
