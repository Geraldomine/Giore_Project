package giore.services;

import giore.model.Cart;
import giore.model.Product;
import giore.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public Cart addToCart(Cart cart, Product product, int quantity) {
        cart.addItem(product, quantity);
        return cartRepository.save(cart);
    }

    public Cart removeFromCart(Cart cart, Product product) {
        cart.removeItem(product);
        return cartRepository.save(cart);
    }

    public Cart updateCartItem(Cart cart, Product product, int quantity) {
        cart.updateItem(product, quantity);
        return cartRepository.save(cart);
    }

    public Cart getCartById(Long cartId) {
        Cart cart = null;
        return cartRepository.save(null);
    }

}
