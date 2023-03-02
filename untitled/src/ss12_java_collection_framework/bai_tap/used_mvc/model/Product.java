package ss12_java_collection_framework.bai_tap.used_mvc.model;

public class Product {
    private int id;
    private String name;
    private String trademark;

    public Product() {

    }

    public Product(int id, String name, String trademark) {
        this.id = id;
        this.name = name;
        this.trademark = trademark;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", trademark='" + trademark + '\'' +
                '}';
    }
}
