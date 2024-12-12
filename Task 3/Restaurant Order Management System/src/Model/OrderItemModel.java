package model;

public class OrderItemModel {
    private MenuItemModel menuItem;
    private int quantity;

    public OrderItemModel(MenuItemModel menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }


    public double calculateItemTotal() {
        return menuItem.getPrice() * quantity;
    }


    public MenuItemModel getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItemModel menuItem) {
        this.menuItem = menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
