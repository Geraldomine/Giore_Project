package giore.repositories;

import giore.model.Cart;

public interface CartRepository <Cart, Long> {
    giore.model.Cart save(giore.model.Cart cart);
}