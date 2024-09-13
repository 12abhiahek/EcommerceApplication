package com.example.ecommerce.Repository;

import com.example.ecommerce.Entity.CartEntity;
import com.example.ecommerce.Entity.Cartitem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepos extends JpaRepository<Cartitem,Long> {
    List<CartEntity> findByUserId(Long userId);
}
