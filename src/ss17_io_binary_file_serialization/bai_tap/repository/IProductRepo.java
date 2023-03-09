package ss17_io_binary_file_serialization.bai_tap.repository;

import ss17_io_binary_file_serialization.bai_tap.model.Product;

public interface IProductRepo {
    void display();

    void add(Product product);
}
