package com.priyanshuRaj.microservices.product.dto;

public record ProductRequest(String name, String id, String description, int price) {
}
