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
public class ModeloVeiculoTest {
    
    public ModeloVeiculoTest() {
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
     * Test of getModelo method, of class ModeloVeiculo.
     */
    @Test
    public void testGetModelo() {
        System.out.println("getModelo");
        ModeloVeiculo instance = new ModeloVeiculo();
        String expResult = "";
        String result = instance.getModelo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModelo method, of class ModeloVeiculo.
     */
    @Test
    public void testSetModelo() {
        System.out.println("setModelo");
        String modelo = "";
        ModeloVeiculo instance = new ModeloVeiculo();
        instance.setModelo(modelo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class ModeloVeiculo.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ModeloVeiculo instance = new ModeloVeiculo();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class ModeloVeiculo.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        ModeloVeiculo instance = new ModeloVeiculo();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
