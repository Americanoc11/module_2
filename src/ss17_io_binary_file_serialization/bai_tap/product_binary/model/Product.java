package ss17_io_binary_file_serialization.bai_tap.product_binary.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private String price;
    private String goods;
    private String describle;

    public Product() {
    }

    public Product(String id, String name, String price, String goods, String describle) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.goods = goods;
        this.describle = describle;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getGoods() {
        return goods;
    }

    public String getDescrible() {
        return describle;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", goods='" + goods + '\'' +
                ", describle='" + describle + '\'' +
                '}';
    }

    public String writeToCsv() {
        return id + "," + name + "," + price + "," + goods + "," + describle;
    }
}
