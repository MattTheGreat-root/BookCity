package Inventory;

import products.Product;

import java.util.ArrayList;

public class Inventory<T extends Product> {
    private ArrayList<T> items = new ArrayList<>();

    public ArrayList<T> getItems() {
        return items;
    }
    public void setItems(ArrayList<T> items) {
        this.items = items;
    }
    public void applyDiscount(String productName, int discount) {
        boolean found = false;
        for (T item : items) {
            if (item.getTitle().equals(productName)) {
                found = true;
                item.setPrice(item.getPrice() * (1 - discount / 100.0));
            }
        }
        if (!found) {
            throw new RuntimeException("Product not found");
        }
    }

    public void addItem(T product) {
        items.add(product);
    }

    public void removeItemsById(String id) {
        boolean found = false;
        for (T item : items) {
            if (item.getId().equals(id)) {
                found = true;
                items.remove(item);
                break;
            }
        }
        if (!found) {
            throw new RuntimeException("Product not found");
        }
    }
    public T findItemById(String id) {
        for (T item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        throw new RuntimeException("Product not found");
    }
    public void displayAll(){
        for (T item : items) {
            System.out.println(item);
        }
    }
}
