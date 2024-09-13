package com.example.ecommerce.Repository;

import com.example.ecommerce.Entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepos extends JpaRepository<Product,Long> {
    Page<Product> findByNameContainingOrCategoryContaining(String name, String category, Pageable pageable);
}
