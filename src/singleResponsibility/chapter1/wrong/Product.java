package singleResponsibility.chapter1.wrong;

import java.util.List;

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
    //This Product class has to keep fields that The Product CLass has.
    //These getAll method and add method against to SingleResponsibility
    //This Product entity has a one submission.It is keep fields that The Product Class has
    public List<Product> getAll(){
        //db connection
        return null;
    }
    public void add(){
        //db connection logic
    }


}
