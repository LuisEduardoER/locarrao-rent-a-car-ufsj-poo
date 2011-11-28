/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.util.List;
import modelo.dominio.MarcaVeiculo;
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
public class PersisteMarcaVeiculoTest {
    
    public PersisteMarcaVeiculoTest() {
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
     * Test of salvarBD method, of class PersisteMarcaVeiculo.
     */
    @Test
    public void testSalvarBD() {
        System.out.println("salvarBD");
        MarcaVeiculo marca = null;
        PersisteMarcaVeiculo instance = new PersisteMarcaVeiculo();
        instance.salvarBD(marca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarMarcaJaCadastrada method, of class PersisteMarcaVeiculo.
     */
    @Test
    public void testVerificarMarcaJaCadastrado() {
        System.out.println("verificarMarcaJaCadastrado");
        MarcaVeiculo marca = null;
        PersisteMarcaVeiculo instance = new PersisteMarcaVeiculo();
        boolean expResult = false;
        boolean result = instance.verificarMarcaJaCadastrada(marca);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarMarcaVeiculo method, of class PersisteMarcaVeiculo.
     */
    @Test
    public void testRetornarMarcaVeiculo() {
        System.out.println("retornarMarcaVeiculo");
        MarcaVeiculo marca = null;
        PersisteMarcaVeiculo instance = new PersisteMarcaVeiculo();
        MarcaVeiculo expResult = null;
        MarcaVeiculo result = instance.retornarMarcaVeiculo(marca);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarTodasMarcasBD method, of class PersisteMarcaVeiculo.
     */
    @Test
    public void testRetornarTodosModelosBD() {
        System.out.println("retornarTodosModelosBD");
        PersisteMarcaVeiculo instance = new PersisteMarcaVeiculo();
        List expResult = null;
        List result = instance.retornarTodasMarcasBD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
