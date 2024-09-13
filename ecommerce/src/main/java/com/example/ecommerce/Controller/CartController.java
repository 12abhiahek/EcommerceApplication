package com.example.ecommerce.Controller;

import com.example.ecommerce.Entity.CartEntity;
import com.example.ecommerce.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping
    public ResponseEntity<CartEntity> addToCart(@RequestBody CartEntity cart) {
        return ResponseEntity.ok(cartService.addToCart(cart.getId(), cart.getProduct().getId(), cart.getQuantity()));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<CartEntity>> getCart(@PathVariable Long userId) {
        return ResponseEntity.ok(cartService.getUserCart(userId));
    }

    @DeleteMapping("/{cartId}")
    public ResponseEntity<Void> removeFromCart(@PathVariable Long cartId) {
        cartService.removeFromCart(cartId);
        return ResponseEntity.noContent().build();
    }
}
