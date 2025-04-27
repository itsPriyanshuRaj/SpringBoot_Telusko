package com.priyanshuRaj.inventory.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priyanshuRaj.inventory.model.Inventory;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Long>{

    boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode, Integer quantity);
    
}
