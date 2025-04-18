package com.ordermanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.ordermanagementsystem.model.Product;
import com.ordermanagementsystem.util.DbConnectionUtil;

public class OrderManagementRepoImpl {

    public void createProduct(Product product) {
        String sql = "INSERT INTO product VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = DbConnectionUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

        	statement.setInt(1, product.getProductID());
            statement.setString(2, product.getProductName());
            statement.setString(3, product.getDescription());
            statement.setDouble(4, product.getPrice());
            statement.setInt(5, product.getQuantityInStock());
            statement.setString(6, product.getType());

            int rows = statement.executeUpdate();
            if (rows > 0) {
                System.out.println("Product inserted successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
