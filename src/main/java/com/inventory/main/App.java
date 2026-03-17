package com.inventory.main;

import com.inventory.dao.ProductDAO;
import com.inventory.entity.Product;

public class App {
    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();

        // Insert products
        Product p1 = new Product("Laptop", "Gaming Laptop", 75000, 10);
        Product p2 = new Product("Mouse", "Wireless Mouse", 1200, 50);

        dao.saveProduct(p1);
        dao.saveProduct(p2);

        // Update product
        dao.updateProduct(1, 72000, 8);

        // Delete product
        dao.deleteProduct(2);

        // Retrieve product
        Product retrieved = dao.getProduct(1);
        System.out.println("Retrieved Product: " + retrieved.getName() + " - " + retrieved.getPrice());
    }
}