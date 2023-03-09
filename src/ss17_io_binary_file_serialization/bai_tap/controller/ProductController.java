package ss17_io_binary_file_serialization.bai_tap.controller;

import ss12_java_collection_framework.bai_tap.used_mvc.model.Product;
import ss17_io_binary_file_serialization.bai_tap.service.IProductService;
import ss17_io_binary_file_serialization.bai_tap.service.ProductService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    public static String file="src/ss17_io_binary_file_serialization/bai_tap/data/ProductBinary.txt";
    public static List<Product> readDataToFile(String file) {
        List<Product> products = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void writeDataToFile(String file, List<Product> product) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file,true);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        IProductService iProductService = new ProductService();
        int choice;
        do {
            System.out.println("--Quản lý sản phẩm--");
            System.out.println("1. Hiển thị sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Tìm kiếm thông tin");
            System.out.println("4. Thoát");
            System.out.println("Chọn chức năng: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    iProductService.display();
                    writeDataToFile(file,list);
                    break;
                case 2:
                    iProductService.add();
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (choice > 0 && choice <= 4);
    }
}
