package com.priyanshuRaj.order.Service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.priyanshuRaj.order.dto.OrderRequest;
import com.priyanshuRaj.order.model.Order;
import com.priyanshuRaj.order.repository.OrderRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class OrderService {

    private final OrderRepo orderRepo;

    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setQuantity(orderRequest.Quantity());
        order.setSkuCode(orderRequest.skuCode());
        orderRepo.save(order);
    }
}
