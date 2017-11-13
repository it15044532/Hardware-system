/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import application.entity.Invoice;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class InvoiceControllerTest {
    
    public InvoiceControllerTest() {
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
     * Test of saveInvoiceDetais method, of class InvoiceController.
     */
    @Test
    public void testSaveInvoiceDetais() {
        System.out.println("saveInvoiceDetais");
        Invoice invoice = null;
        InvoiceController instance = new InvoiceController();
        boolean expResult = false;
        boolean result = instance.saveInvoiceDetais(invoice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
