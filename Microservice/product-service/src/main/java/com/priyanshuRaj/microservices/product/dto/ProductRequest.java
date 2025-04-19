package com.priyanshuRaj.microservices.product.dto;

public record ProductRequest(String id, String name, int price, String description) {
}
