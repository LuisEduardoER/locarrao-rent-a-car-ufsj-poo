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
public class MarcaVeiculoTest {
    
    public MarcaVeiculoTest() {
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
     * Test of getMarca method, of class MarcaVeiculo.
     */
    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        MarcaVeiculo instance = new MarcaVeiculo();
        String expResult = "";
        String result = instance.getMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarca method, of class MarcaVeiculo.
     */
    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = "";
        MarcaVeiculo instance = new MarcaVeiculo();
        instance.setMarca(marca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class MarcaVeiculo.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        MarcaVeiculo instance = new MarcaVeiculo();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class MarcaVeiculo.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        MarcaVeiculo instance = new MarcaVeiculo();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
