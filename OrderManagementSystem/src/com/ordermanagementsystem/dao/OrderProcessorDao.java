package com.ordermanagementsystem.dao;

import java.util.List;

import com.ordermanagementsystem.model.Product;
import com.ordermanagementsystem.model.User;

interface OrderProcessorDao {

    void createProducts(Product products);

    void createUser(User user);

    List<Product> getAllProduct();
}