package com.inventory.HibernateInventory;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testApp() {
        // A simple test that always passes
        assertTrue(true);
    }

    @Test
    public void testProductCreation() {
        // Example: test creating a Product object
        com.inventory.entity.Product product = new com.inventory.entity.Product("Laptop", "Gaming Laptop", 75000, 10);
        assertEquals("Laptop", product.getName());
        assertEquals(75000, product.getPrice(), 0.01);
        assertEquals(10, product.getQuantity());
    }
}