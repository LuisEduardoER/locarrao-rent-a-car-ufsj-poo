/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

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
public class VisaoClientesTest {
    
    public VisaoClientesTest() {
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
     * Test of cadastrarClientes method, of class VisaoClientes.
     */
    @Test
    public void testCadastrarClientes() {
        System.out.println("cadastrarClientes");
        VisaoClientes instance = new VisaoClientes();
        instance.cadastrarClientes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarCliente method, of class VisaoClientes.
     */
    @Test
    public void testAlterarCliente() {
        System.out.println("alterarCliente");
        VisaoClientes instance = new VisaoClientes();
        instance.alterarCliente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisarCliente method, of class VisaoClientes.
     */
    @Test
    public void testPesquisarCliente() {
        System.out.println("pesquisarCliente");
        VisaoClientes instance = new VisaoClientes();
        instance.pesquisarCliente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirCliente method, of class VisaoClientes.
     */
    @Test
    public void testExcluirCliente() {
        System.out.println("excluirCliente");
        VisaoClientes instance = new VisaoClientes();
        instance.excluirCliente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaPorNome method, of class VisaoClientes.
     */
    @Test
    public void testBuscaPorNome() {
        System.out.println("buscaPorNome");
        VisaoClientes instance = new VisaoClientes();
        instance.buscaPorNome();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimeCliente method, of class VisaoClientes.
     */
    @Test
    public void testImprimeCliente() {
        System.out.println("imprimeCliente");
        Clientes cliente = null;
        VisaoClientes instance = new VisaoClientes();
        instance.imprimeCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
