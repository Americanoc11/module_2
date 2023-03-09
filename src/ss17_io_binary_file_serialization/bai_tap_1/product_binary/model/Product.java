package ss17_io_binary_file_serialization.bai_tap_1.product_binary.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private String price;
    private String goods;
    private String describe;
    public Product(){}

    public Product(String id, String name, String price, String goods, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.goods = goods;
        this.describe = describe;
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

    public String getDescribe() {
        return describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", goods='" + goods + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
