/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import application.entity.Customer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
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
public class CustomerControllerTest {
    
    public CustomerControllerTest() {
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
     * Test of isCustomerExists method, of class CustomerController.
     */
    @Test
    public void testIsCustomerExists() {
        System.out.println("isCustomerExists");
        Customer customer = null;
        CustomerController instance = new CustomerController();
        int expResult = 0;
        int result = instance.isCustomerExists(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCustomerContact method, of class CustomerController.
     */
    @Test
    public void testCheckCustomerContact() {
        System.out.println("checkCustomerContact");
        Customer customer = null;
        CustomerController instance = new CustomerController();
        boolean expResult = false;
        boolean result = instance.checkCustomerContact(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCustomerById method, of class CustomerController.
     */
    @Test
    public void testFindCustomerById() {
        System.out.println("findCustomerById");
        int id = 0;
        CustomerController instance = new CustomerController();
        Customer expResult = null;
        Customer result = instance.findCustomerById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomer method, of class CustomerController.
     */
    @Test
    public void testGetAllCustomer() {
        System.out.println("getAllCustomer");
        DefaultTableModel dtm = null;
        CustomerController instance = new CustomerController();
        instance.getAllCustomer(dtm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomerForCombo method, of class CustomerController.
     */
    @Test
    public void testGetAllCustomerForCombo() {
        System.out.println("getAllCustomerForCombo");
        DefaultComboBoxModel cbm = null;
        CustomerController instance = new CustomerController();
        boolean expResult = false;
        boolean result = instance.getAllCustomerForCombo(cbm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
