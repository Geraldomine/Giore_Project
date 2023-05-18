package giore.model.controllers;

import giore.model.Cart;
import giore.model.Product;
import giore.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carts")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/{cartId}/add")
    public Cart addToCart(@PathVariable Long cartId, @RequestBody Product product, @RequestParam int quantity) {
        Cart cart = cartService.getCartById(cartId);
        return cartService.addToCart(cart, product, quantity);
    }

    @PostMapping("/{cartId}/remove")
    public Cart removeFromCart(@PathVariable Long cartId, @RequestBody Product product) {
        Cart cart = cartService.getCartById(cartId);
        return cartService.removeFromCart(cart, product);
    }

    @PostMapping("/{cartId}/update")
    public Cart updateCartItem(@PathVariable Long cartId, @RequestBody Product product, @RequestParam int quantity) {
        Cart cart = cartService.getCartById(cartId);
        return cartService.updateCartItem(cart, product, quantity);
    }
}
