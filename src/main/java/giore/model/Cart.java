package giore.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> items;


    public Cart() {
        items = new HashMap<>();
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    public void setItems(Map<Product, Integer> items) {
        this.items = items;
    }

    public void addItem(Product product, int quantity) {
        items.put(product, quantity);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public void updateItem(Product product, int quantity) {
        items.put(product, quantity);
    }

    public double getTotalAmount() {
        double totalAmount = 0;
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            totalAmount += entry.getKey().getPrice() * entry.getValue();
        }
        return totalAmount;
    }
}

