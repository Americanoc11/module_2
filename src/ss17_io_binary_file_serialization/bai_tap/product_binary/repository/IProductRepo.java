package ss17_io_binary_file_serialization.bai_tap.product_binary.repository;

import ss17_io_binary_file_serialization.bai_tap.product_binary.model.Product;

public interface IProductRepo {
    void display();

    void add(Product newProduct);

    void findIformation(String name);
}
