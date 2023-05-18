package giore.model;

import java.util.List;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean isPremium;
    private List<Order> orders;
    private List<Product> cart;

    public User(int id, String firstName, String lastName, String email, String password, boolean isPremium, List<Order> orders, List<Product> cart) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.isPremium = isPremium;
        this.orders = orders;
        this.cart = cart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }
}
