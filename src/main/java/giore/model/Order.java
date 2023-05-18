package giore.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Order {
    private int id;
    private LocalDate date;
    private List<Product> products;
    private BigDecimal totalAmount;
    private String paymentMethod;
    private Address shippingAddress;

    public Order(int id, LocalDate date, List<Product> products, BigDecimal totalAmount,
                 String paymentMethod, Address shippingAddress) {
        if (id <= 0 || date == null || products == null || products.isEmpty() ||
                totalAmount == null || paymentMethod == null || paymentMethod.isEmpty() ||
                shippingAddress == null || !shippingAddress.isValid()) {
            throw new IllegalArgumentException("Invalid parameters for Order");
        }
        this.id = id;
        this.date = date;
        this.products = products;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
        this.shippingAddress = shippingAddress;
    }

    public Order(int id, String s) {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
