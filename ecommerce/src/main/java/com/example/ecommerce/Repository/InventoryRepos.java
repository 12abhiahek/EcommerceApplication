package com.example.ecommerce.Repository;

import com.example.ecommerce.Entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryRepos extends JpaRepository<Inventory, Long> {
    Optional<Inventory> findByProductId(Long productId);
}
