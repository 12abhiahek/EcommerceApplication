package com.example.ecommerce.Service;

import com.example.ecommerce.Entity.CartEntity;
import com.example.ecommerce.Entity.Cartitem;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private CartService cartService;

    @Autowired
    private InventoryService inventoryService;

    @Transactional
    public void placeOrder(Long userId) throws Exception {
        List<CartEntity> cartItems = cartService.getUserCart(userId);
        for (CartEntity cart : cartItems) {
            inventoryService.updateStock(cart.getId(), cart.getQuantity());
        }
        cartService.removeFromCart(userId);  // Implement clearCart method to remove all items for a user
    }
}
