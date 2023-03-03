package ss12_java_collection_framework.bai_tap.used_mvc.repository;

import ss12_java_collection_framework.bai_tap.used_mvc.model.Product;

public interface IProductRepository {
    void displayProduct();

    void deleted(int id);

    void findProduct(String name);

    void add(Product newProduct);
}
