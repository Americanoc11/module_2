package ss12_java_collection_framework.bai_tap.used_mvc.controller;

import ss12_java_collection_framework.bai_tap.used_mvc.service.ProductService;

import java.util.Scanner;

public class Controller {
    private Scanner input = new Scanner(System.in);
    private ProductService productService = new ProductService();

    public void menu() {
        int choice;
        do {
            System.out.println("-------------------------------------------------");
            System.out.println("--Chương trình quản lý sản phẩm--");
            System.out.println("1. Thêm sản phẩm ");
            System.out.println("2. Xóa sản phẩm theo id");
            System.out.println("3. Hiển thị danh sách sản phẩm ");
            System.out.println("4. Tìm kiếm sản phẩm theo tên");
            System.out.println("5. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");
            System.out.println();
            System.out.println("-------------------------------------------------");

            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    System.out.println("Nhập mã sản phẩm muốn xóa");
                    int id = Integer.parseInt(input.nextLine());
                    productService.deleted(id);
                    break;
                case 3:
                    productService.displayProduct();
                    break;
                case 4:
                    System.out.println("Nhập tên sản phẩm muốn tìm ");
                    String name = input.nextLine();
                    productService.findProduct(name);
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
