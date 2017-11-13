/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import application.entity.Product;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class ProductControllerTest {
    
    public ProductControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isProductExists method, of class ProductController.
     */
    
    @Test
    public void testIsProductExists() {
        System.out.println("isProductExists");
        Product product = null;
        ProductController instance = new ProductController();
        int expResult = 0;
        int result = instance.isProductExists(product);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findProductById method, of class ProductController.
     */
    @Test
    public void testFindProductById() {
        System.out.println("findProductById");
        int id = 0;
        ProductController instance = new ProductController();
        Product expResult = null;
        Product result = instance.findProductById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllProducts method, of class ProductController.
     */
    @Test
    public void testGetAllProducts() {
        System.out.println("getAllProducts");
        DefaultTableModel dtm = null;
        ProductController instance = new ProductController();
        instance.getAllProducts(dtm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
