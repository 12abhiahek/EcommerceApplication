package com.example.ecommerce.Service;

import com.example.ecommerce.Entity.CartEntity;
import com.example.ecommerce.Entity.Cartitem;
import com.example.ecommerce.Repository.CartItemRepos;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartItemRepos cartRepository;



   public CartEntity addToCart(Long id, Long product, int quantity){
      // CartEntity cart=new CartEntity(id,product, quantity);
      // return cartRepository.save(cart);
       Cartitem cart=new Cartitem(id, product,quantity);
       return cartRepository.saveAll(cart);
   }

    public List<CartEntity> getUserCart(Long userId) {
        return cartRepository.findByUserId(userId);
    }

    public void removeFromCart(Long cartId) {
        cartRepository.deleteById(cartId);
    }
}
