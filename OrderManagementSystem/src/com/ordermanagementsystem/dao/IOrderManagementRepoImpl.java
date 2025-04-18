package com.ordermanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ordermanagementsystem.model.Product;
import com.ordermanagementsystem.util.DbConnectionUtil;

public interface IOrderManagementRepoImpl extends OrderProcessorDao
{

    public default void createProduct(Product product) {
        Connection connection = null;
        PreparedStatement statement = null;
        String sql = "INSERT INTO Product VALUES (?, ?, ?, ?, ?, ?)";

        try {
            connection = DbConnectionUtil.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, product.getProductID());
            statement.setString(2, product.getProductName());
            statement.setString(3, product.getDescription());
            statement.setDouble(4, product.getPrice());
            statement.setInt(5, product.getQuantityInStock());
            statement.setString(6, product.getType());


            statement.execute();
            System.out.println("Product inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
