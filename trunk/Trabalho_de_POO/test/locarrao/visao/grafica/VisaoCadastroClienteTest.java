/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao.grafica;

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
public class VisaoCadastroClienteTest {
    
    public VisaoCadastroClienteTest() {
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
     * Test of main method, of class VisaoCadastroCliente.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VisaoCadastroCliente.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarDadosPessoaisEmBranco method, of class VisaoCadastroCliente.
     */
    @Test
    public void testVerificarDadosPessoaisEmBranco() {
        System.out.println("verificarDadosPessoaisEmBranco");
        VisaoCadastroCliente instance = new VisaoCadastroCliente();
        boolean expResult = false;
        boolean result = instance.verificarDadosPessoaisEmBranco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarDadosEndereco method, of class VisaoCadastroCliente.
     */
    @Test
    public void testVerificarDadosEndereco() {
        System.out.println("verificarDadosEndereco");
        VisaoCadastroCliente instance = new VisaoCadastroCliente();
        boolean expResult = false;
        boolean result = instance.verificarDadosEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pegarDados method, of class VisaoCadastroCliente.
     */
    @Test
    public void testPegarDados() {
        System.out.println("pegarDados");
        VisaoCadastroCliente instance = new VisaoCadastroCliente();
        instance.pegarDados();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chamarVerificacoes method, of class VisaoCadastroCliente.
     */
    @Test
    public void testChamarVerificacoes() {
        System.out.println("chamarVerificacoes");
        VisaoCadastroCliente instance = new VisaoCadastroCliente();
        instance.chamarVerificacoes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
