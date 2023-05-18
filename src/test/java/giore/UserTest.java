package giore;

import giore.model.Order;
import giore.model.Product;
import giore.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Order 1"));
        orders.add(new Order(2, "Order 2"));


        List<Product> cart = new ArrayList<>();
        cart.add(new Product(1, "Product 1"));
        cart.add(new Product(2, "Product 2"));


        User user = new User(1, "Geraldien", "Domine", "gdomine@hotmail.com.ar", "ger1213", true, orders, cart);


        System.out.println("User Details:");
        System.out.println("ID: " + user.getId());
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Is Premium: " + user.isPremium());
        System.out.println("Orders: " + user.getOrders());
        System.out.println("Cart: " + user.getCart());
    }
}
