package com.priyanshuRaj.inventory.service;

import org.springframework.stereotype.Service;

import com.priyanshuRaj.inventory.Repository.InventoryRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InventoryService {
    
    private final InventoryRepo inventoryRepo;

    public boolean inStock(String skuCode, int quantity){
        return inventoryRepo.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    }
}
