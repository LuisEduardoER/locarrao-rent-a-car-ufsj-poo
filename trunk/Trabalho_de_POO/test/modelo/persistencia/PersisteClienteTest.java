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
    @Test
    public void testRetornarTodosClientes() {
        System.out.println("retornarTodosClientes");
        PersisteCliente.retornarTodosClientes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvar method, of class PersisteCliente.
     */
    @Test
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        Clientes clientes = null;
        PersisteCliente instance = new PersisteCliente();
        boolean expResult = false;
        boolean result = instance.salvar(clientes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarCliente method, of class PersisteCliente.
     */
    @Test
    public void testAlterarCliente() throws Exception {
        System.out.println("alterarCliente");
        Clientes clientes = null;
        PersisteCliente instance = new PersisteCliente();
        boolean expResult = false;
        boolean result = instance.alterarCliente(clientes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisarCliente method, of class PersisteCliente.
     */
    @Test
    public void testPesquisarCliente_Clientes() throws Exception {
        System.out.println("pesquisarCliente");
        Clientes cliente = null;
        PersisteCliente instance = new PersisteCliente();
        boolean expResult = false;
        boolean result = instance.pesquisarCliente(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisarCliente method, of class PersisteCliente.
     */
    @Test
    public void testPesquisarCliente_int() throws Exception {
        System.out.println("pesquisarCliente");
        int codigo = 0;
        PersisteCliente instance = new PersisteCliente();
        boolean expResult = false;
        boolean result = instance.pesquisarCliente(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarCliente method, of class PersisteCliente.
     */
    @Test
    public void testRetornarCliente() {
        System.out.println("retornarCliente");
        Clientes cliente = null;
        PersisteCliente instance = new PersisteCliente();
        boolean expResult = false;
        boolean result = instance.retornarCliente(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarClienteComCpf method, of class PersisteCliente.
     */
    @Test
    public void testRetornarClienteComCpf() {
        System.out.println("retornarClienteComCpf");
        Clientes cliente = null;
        PersisteCliente instance = new PersisteCliente();
        boolean expResult = false;
        boolean result = instance.retornarClienteComCpf(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarClientesComNome method, of class PersisteCliente.
     */
    @Test
    public void testMostrarClientesComNome() {
        System.out.println("mostrarClientesComNome");
        String nome = "";
        PersisteCliente instance = new PersisteCliente();
        instance.mostrarClientesComNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

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
