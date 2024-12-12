package model;

import java.util.ArrayList;
import java.util.List;

public class MenuModel {
    private List<MenuItem> menuItems;

    public MenuModel() {
        this.menuItems = new ArrayList<>();
    }


    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }


    public void removeMenuItem(MenuItem item) {
        menuItems.remove(item);
    }


    public List<MenuItem> getMenuItems() {
        return menuItems;
    }


    public MenuItem findMenuItemByName(String name) {
        for (MenuItem item : menuItems) {
            if (item.getName().equalsIgnoreCase(name)) { // Assuming MenuItem has a getName() method
                return item;
            }
        }
        return null;
    }
}
