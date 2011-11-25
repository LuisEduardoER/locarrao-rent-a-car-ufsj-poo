/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.util.List;
import modelo.dominio.ModeloVeiculo;
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
public class PersisteModeloVeiculoTest {
    
    public PersisteModeloVeiculoTest() {
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
     * Test of retornarModeloVeiculo method, of class PersisteModeloVeiculo.
     */
    @Test
    public void testRetornarModeloVeiculo() {
        System.out.println("retornarModeloVeiculo");
        ModeloVeiculo modelo = null;
        PersisteModeloVeiculo instance = new PersisteModeloVeiculo();
        ModeloVeiculo expResult = null;
        ModeloVeiculo result = instance.retornarModeloVeiculo(modelo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarModeloJaCadastrado method, of class PersisteModeloVeiculo.
     */
    @Test
    public void testVerificarModeloJaCadastrado() {
        System.out.println("verificarModeloJaCadastrado");
        ModeloVeiculo modelo = null;
        PersisteModeloVeiculo instance = new PersisteModeloVeiculo();
        boolean expResult = false;
        boolean result = instance.verificarModeloJaCadastrado(modelo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvarBD method, of class PersisteModeloVeiculo.
     */
    @Test
    public void testSalvarBD() {
        System.out.println("salvarBD");
        ModeloVeiculo modelo = null;
        PersisteModeloVeiculo instance = new PersisteModeloVeiculo();
        instance.salvarBD(modelo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarTodosModelosBD method, of class PersisteModeloVeiculo.
     */
    @Test
    public void testRetornarTodosModelosBD() {
        System.out.println("retornarTodosModelosBD");
        PersisteModeloVeiculo instance = new PersisteModeloVeiculo();
        List expResult = null;
        List result = instance.retornarTodosModelosBD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarModeloVeiculoComNome method, of class PersisteModeloVeiculo.
     */
    @Test
    public void testRetornarModeloVeiculoComNome() {
        System.out.println("retornarModeloVeiculoComNome");
        ModeloVeiculo modelo = null;
        PersisteModeloVeiculo instance = new PersisteModeloVeiculo();
        ModeloVeiculo expResult = null;
        ModeloVeiculo result = instance.retornarModeloVeiculoComNome(modelo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
