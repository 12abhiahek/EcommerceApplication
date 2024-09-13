package com.example.ecommerce.Service;

import com.example.ecommerce.Entity.Product;
import com.example.ecommerce.Repository.ProductRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepos productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Page<Product> searchProducts(String query, Pageable pageable) {
        return productRepository.findByNameContainingOrCategoryContaining(query, query, pageable);
    }

    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }
}
