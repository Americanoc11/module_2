package ss17_io_binary_file_serialization.bai_tap.product_binary.controller;

import ss17_io_binary_file_serialization.bai_tap.product_binary.service.IProductService;
import ss17_io_binary_file_serialization.bai_tap.product_binary.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IProductService iProductService= new ProductService();
        int choice;
        do {
            System.out.println("-- Quản lý sản phẩm --");
            System.out.println("1. Hiển thị danh sách sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Tìm kiếm thông tin sản phẩm");
            System.out.println("4. Thoát");
            System.out.println("Chọn chức năng");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    iProductService.display();
                    break;
                case 2:
                    iProductService.add();
                    break;
                case 3:
                    iProductService.findInformation();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (choice > 0 && choice < 5);
    }
}
