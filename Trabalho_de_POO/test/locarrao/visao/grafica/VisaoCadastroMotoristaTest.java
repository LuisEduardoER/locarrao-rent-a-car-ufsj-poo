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
public class VisaoCadastroMotoristaTest {
    
    public VisaoCadastroMotoristaTest() {
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
     * Test of main method, of class VisaoCadastroMotorista.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VisaoCadastroMotorista.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarDadosPessoaisEmBranco method, of class VisaoCadastroMotorista.
     */
    @Test
    public void testVerificarDadosPessoaisEmBranco() {
        System.out.println("verificarDadosPessoaisEmBranco");
        VisaoCadastroMotorista instance = new VisaoCadastroMotorista();
        boolean expResult = false;
        boolean result = instance.verificarDadosPessoaisEmBranco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarCnhEmBranco method, of class VisaoCadastroMotorista.
     */
    @Test
    public void testVerificarCnhEmBranco() {
        System.out.println("verificarCnhEmBranco");
        VisaoCadastroMotorista instance = new VisaoCadastroMotorista();
        boolean expResult = false;
        boolean result = instance.verificarCnhEmBranco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarContemLetraNaCnh method, of class VisaoCadastroMotorista.
     */
    @Test
    public void testVerificarContemLetraNaCnh() {
        System.out.println("verificarContemLetraNaCnh");
        VisaoCadastroMotorista instance = new VisaoCadastroMotorista();
        boolean expResult = false;
        boolean result = instance.verificarContemLetraNaCnh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarDadosEndereco method, of class VisaoCadastroMotorista.
     */
    @Test
    public void testVerificarDadosEndereco() {
        System.out.println("verificarDadosEndereco");
        VisaoCadastroMotorista instance = new VisaoCadastroMotorista();
        boolean expResult = false;
        boolean result = instance.verificarDadosEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pegarDados method, of class VisaoCadastroMotorista.
     */
    @Test
    public void testPegarDados() {
        System.out.println("pegarDados");
        VisaoCadastroMotorista instance = new VisaoCadastroMotorista();
        instance.pegarDados();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chamarVerificacoes method, of class VisaoCadastroMotorista.
     */
    @Test
    public void testChamarVerificacoes() {
        System.out.println("chamarVerificacoes");
        VisaoCadastroMotorista instance = new VisaoCadastroMotorista();
        instance.chamarVerificacoes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
