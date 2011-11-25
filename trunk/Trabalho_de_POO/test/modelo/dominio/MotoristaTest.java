/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Magelinha
 */
public class MotoristaTest {
    
    public MotoristaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCnh method, of class Motorista.
     */
    @Test
    public void testGetCnh() {
        System.out.println("getCnh");
        Motorista instance = new Motorista();
        String expResult = "";
        String result = instance.getCnh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCnh method, of class Motorista.
     */
    @Test
    public void testSetCnh() {
        System.out.println("setCnh");
        String cnh = "";
        Motorista instance = new Motorista();
        instance.setCnh(cnh);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
