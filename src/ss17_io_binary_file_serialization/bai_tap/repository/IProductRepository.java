package ss17_io_binary_file_serialization.bai_tap_csv.repository;

import ss17_io_binary_file_serialization.bai_tap_csv.model.Product;

public interface IProductRepository {
    void display();

    void add(Product product);
}
