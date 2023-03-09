package ss17_io_binary_file_serialization.bai_tap_csv.controller;

import ss17_io_binary_file_serialization.bai_tap_csv.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductService productService= new ProductService();
        int choice;
        do {
            System.out.println("--Quản lý sản phẩm-- ");
            System.out.println("1. Hiển thị sản phẩm");
            System.out.println("2. Xóa sản phẩm");
            System.out.println("3. Thêm sản phẩm");
            System.out.println("4. Sửa sản phẩm");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    productService.display();
                    break;
                case 2:
                    break;
                case 3:
                    productService.add();
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (choice>0 && choice<=5);
    }
}
