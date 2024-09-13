package com.example.ecommerce.Service;

import com.example.ecommerce.Entity.Inventory;
import com.example.ecommerce.Repository.InventoryRepos;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepos inventoryRepository;

    @Transactional
    public synchronized void updateStock(Long productId, int quantity) throws Exception {
        Inventory inventory = inventoryRepository.findByProductId(productId)
                .orElseThrow(() -> new Exception("Product not found in inventory"));

        if (inventory.getQuantity() < quantity) {
            throw new Exception("Insufficient stock");
        }
        inventory.setQuantity(inventory.getQuantity() - quantity);
        inventoryRepository.save(inventory);
    }
}
