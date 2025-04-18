package com.ordermanagementsystem.main;

import com.ordermanagementsystem.model.Product;
import com.ordermanagementsystem.dao.OrderManagementRepoImpl;

public class OrderManagementApp {
    public static void main(String[] args) {
        // Create sample product
        Product product = new Product(
            102,
            "iPhone 14",
            "Apple smartphone with 128GB storage",
            79999.99,
            50,
            "Electronics"
        );

        // Create repo object and call method
        OrderManagementRepoImpl repo = new OrderManagementRepoImpl();
        repo.createProduct(product);
    }
}
