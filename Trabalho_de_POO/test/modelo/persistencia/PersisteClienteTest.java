/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import modelo.dominio.Clientes;
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
public class PersisteClienteTest {
    
    public PersisteClienteTest() {
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
     * Test of retornarTodosClientes method, of class PersisteCliente.
     */
    

    /**
     * Test of pesquisarClienteBD method, of class PersisteCliente.
     */
    @Test
    public void testPesquisarClienteBD() {
        System.out.println("pesquisarClienteBD");
        Clientes cliente = null;
        PersisteCliente instance = new PersisteCliente();
        boolean expResult = false;
        boolean result = instance.pesquisarClienteBD(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarClienteJaCadastrado method, of class PersisteCliente.
     */
    @Test
    public void testVerificarClienteJaCadastrado() {
        System.out.println("verificarClienteJaCadastrado");
        Clientes cliente = null;
        PersisteCliente instance = new PersisteCliente();
        boolean expResult = false;
        boolean result = instance.verificarClienteJaCadastrado(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvarBD method, of class PersisteCliente.
     */
    @Test
    public void testSalvarBD() {
        System.out.println("salvarBD");
        Clientes cliente = null;
        PersisteCliente instance = new PersisteCliente();
        instance.salvarBD(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
