package singleResponsibility.chapter1.best;

public class Product {
    private int id;
    private int price;
    private String name;
    private String category;

    public Product(int id, int price, String name, String category) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
