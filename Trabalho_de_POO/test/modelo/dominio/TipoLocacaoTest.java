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
public class TipoLocacaoTest {
    
    public TipoLocacaoTest() {
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
     * Test of getPrecoPorQuilometro method, of class TipoLocacao.
     */
    @Test
    public void testGetPrecoPorQuilometro() {
        System.out.println("getPrecoPorQuilometro");
        TipoLocacao instance = new TipoLocacao();
        double expResult = 0.0;
        double result = instance.getPrecoPorQuilometro();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecoPorQuilometro method, of class TipoLocacao.
     */
    @Test
    public void testSetPrecoPorQuilometro() {
        System.out.println("setPrecoPorQuilometro");
        double precoPorQuilometro = 0.0;
        TipoLocacao instance = new TipoLocacao();
        instance.setPrecoPorQuilometro(precoPorQuilometro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoVeiculo method, of class TipoLocacao.
     */
    @Test
    public void testGetTipoVeiculo() {
        System.out.println("getTipoVeiculo");
        TipoLocacao instance = new TipoLocacao();
        TipoVeiculo expResult = null;
        TipoVeiculo result = instance.getTipoVeiculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoVeiculo method, of class TipoLocacao.
     */
    @Test
    public void testSetTipoVeiculo() {
        System.out.println("setTipoVeiculo");
        TipoVeiculo tipoVeiculo = null;
        TipoLocacao instance = new TipoLocacao();
        instance.setTipoVeiculo(tipoVeiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaDiarias method, of class TipoLocacao.
     */
    @Test
    public void testGetTaxaDiarias() {
        System.out.println("getTaxaDiarias");
        TipoLocacao instance = new TipoLocacao();
        double expResult = 0.0;
        double result = instance.getTaxaDiarias();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaDiarias method, of class TipoLocacao.
     */
    @Test
    public void testSetTaxaDiarias() {
        System.out.println("setTaxaDiarias");
        double taxaDiarias = 0.0;
        TipoLocacao instance = new TipoLocacao();
        instance.setTaxaDiarias(taxaDiarias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaPorKm method, of class TipoLocacao.
     */
    @Test
    public void testGetTaxaPorKm() {
        System.out.println("getTaxaPorKm");
        TipoLocacao instance = new TipoLocacao();
        double expResult = 0.0;
        double result = instance.getTaxaPorKm();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaPorKm method, of class TipoLocacao.
     */
    @Test
    public void testSetTaxaPorKm() {
        System.out.println("setTaxaPorKm");
        double taxaPorKm = 0.0;
        TipoLocacao instance = new TipoLocacao();
        instance.setTaxaPorKm(taxaPorKm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class TipoLocacao.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        TipoLocacao instance = new TipoLocacao();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class TipoLocacao.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        TipoLocacao instance = new TipoLocacao();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
