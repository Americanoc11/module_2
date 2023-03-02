package ss12_java_collection_framework.bai_tap.used_mvc.service;

import ss12_java_collection_framework.bai_tap.used_mvc.repository.ProductRepository;

public class ProductService implements IProductService {
    private ProductRepository productRepository = new ProductRepository();

    @Override
    public void displayProduct() {
        productRepository.displayProduct();
    }

    @Override
    public void deleted(int id) {
        productRepository.deleted(id);
    }

    @Override
    public void findProduct(String name) {
        productRepository.findProduct(name);
    }

    @Override
    public void addProduct() {
        productRepository.addProduct();
    }
}
