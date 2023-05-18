package giore.model;

public class Review {
    private int id;
    private String comment;
    private int rating;
    private User user;
    private Product product;


    public Review(int id, String comment, int rating, User user, Product product) {
        this.id = id;
        this.comment = comment;
        this.rating = rating;
        this.user = user;
        this.product = product;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
