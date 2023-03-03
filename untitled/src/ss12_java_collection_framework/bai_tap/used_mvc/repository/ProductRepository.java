package ss12_java_collection_framework.bai_tap.used_mvc.repository;

import ss12_java_collection_framework.bai_tap.used_mvc.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
   private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(001, "Sữa", "Vinamilk"));
        productList.add(new Product(002, "Bánh", "Vinamilk"));
        productList.add(new Product(003, "Kẹo", "Vinamilk"));
        productList.add(new Product(004, "Sữa", "Vinamilk"));
    }

    Scanner input = new Scanner(System.in);

    @Override
    public void displayProduct() {
        if (productList.size() == 0) {
            System.out.println(" Danh sách trống ");
        } else {
            for (Product p : productList) {
                System.out.println(p);
            }
        }
    }

    @Override
    public void deleted(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                System.out.println("1. Xóa" + "\n" + "2. Hủy");
                int choice = Integer.parseInt(input.nextLine());
                if (choice == 1) {
                    System.out.println("Xóa thành công");
                    productList.remove(i);
                    break;
                } else if (choice == 2) {
                    System.out.println("Đã huỷ xóa");
                    break;
                } else {
                    System.out.println("Không hợp lệ");
                }
            }
        }
    }

    @Override
    public void findProduct(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                System.out.println("Sản phẩm: " + productList.get(i).getName() + ", Vị trí: " + (i + 1));
                break;
            }
        }
    }

    @Override
    public void add(Product newProduct) {
        productList.add(newProduct);
        System.out.println("Thêm thành công");
    }

}
