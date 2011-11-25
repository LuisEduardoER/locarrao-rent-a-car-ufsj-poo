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
public class ValidaTest {
    
    public ValidaTest() {
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
     * Test of validarCPF method, of class Valida.
     */
    @Test
    public void testValidarCPF() {
        System.out.println("validarCPF");
        String CPF = "";
        Valida instance = new Valida();
        boolean expResult = false;
        boolean result = instance.validarCPF(CPF);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarCnh method, of class Valida.
     */
    @Test
    public void testValidarCnh() {
        System.out.println("validarCnh");
        String cnh = "";
        Valida instance = new Valida();
        boolean expResult = false;
        boolean result = instance.validarCnh(cnh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarCEP method, of class Valida.
     */
    @Test
    public void testValidarCEP() {
        System.out.println("validarCEP");
        String cep = "";
        Valida instance = new Valida();
        boolean expResult = false;
        boolean result = instance.validarCEP(cep);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarTelefone method, of class Valida.
     */
    @Test
    public void testValidarTelefone() {
        System.out.println("validarTelefone");
        String telefone = "";
        Valida instance = new Valida();
        boolean expResult = false;
        boolean result = instance.validarTelefone(telefone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
