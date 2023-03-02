package ss12_java_collection_framework.bai_tap.used_mvc.repository;

public interface IProductRepository {
    void displayProduct();

    void deleted(int id);

    void findProduct(String name);

    void addProduct();
}
