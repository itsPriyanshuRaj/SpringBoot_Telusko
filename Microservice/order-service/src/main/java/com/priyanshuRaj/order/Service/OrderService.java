package com.priyanshuRaj.order.Service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.priyanshuRaj.order.client.InventoryClient;
import com.priyanshuRaj.order.dto.OrderRequest;
import com.priyanshuRaj.order.model.Order;
import com.priyanshuRaj.order.repository.OrderRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class OrderService {

    private final OrderRepo orderRepo;
    private final InventoryClient inventoryClient;

    public void placeOrder(OrderRequest orderRequest){

        var isProductInStock = inventoryClient.isInStock(orderRequest.skuCode(), orderRequest.quantity());

        if(isProductInStock){
            Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setQuantity(orderRequest.quantity());
        order.setSkuCode(orderRequest.skuCode());
        orderRepo.save(order);
        }else{
            throw new RuntimeException("Product is out of stock" + orderRequest.skuCode());
        }

        
    }
}
