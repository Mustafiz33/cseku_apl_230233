package model;

public class MenuItemModel {
    private int id;
    private String name;
    private double price;
    private String category;

    public MenuItemModel(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }


    public String getDetails() {
        return "ID: " + id + ", Name: " + name + ", Price: " + price + ", Category: " + category;
    }


    public double getPrice() {
        return price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
