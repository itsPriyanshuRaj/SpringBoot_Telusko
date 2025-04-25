package com.priyanshuRaj.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyanshuRaj.order.model.Order;

public interface OrderRepo extends JpaRepository<Order, Long>{
    
}
