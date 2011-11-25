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
public class VisaoCadastroLocacaoTest {
    
    public VisaoCadastroLocacaoTest() {
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
     * Test of main method, of class VisaoCadastroLocacao.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VisaoCadastroLocacao.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarCamposNumericos method, of class VisaoCadastroLocacao.
     */
    @Test
    public void testVerificarCamposNumericos() {
        System.out.println("verificarCamposNumericos");
        String campo = "";
        VisaoCadastroLocacao instance = new VisaoCadastroLocacao();
        boolean expResult = false;
        boolean result = instance.verificarCamposNumericos(campo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarCliente method, of class VisaoCadastroLocacao.
     */
    @Test
    public void testVerificarCliente() {
        System.out.println("verificarCliente");
        VisaoCadastroLocacao instance = new VisaoCadastroLocacao();
        boolean expResult = false;
        boolean result = instance.verificarCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarMotorista method, of class VisaoCadastroLocacao.
     */
    @Test
    public void testVerificarMotorista() {
        System.out.println("verificarMotorista");
        VisaoCadastroLocacao instance = new VisaoCadastroLocacao();
        boolean expResult = false;
        boolean result = instance.verificarMotorista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarVeiculo method, of class VisaoCadastroLocacao.
     */
    @Test
    public void testVerificarVeiculo() {
        System.out.println("verificarVeiculo");
        VisaoCadastroLocacao instance = new VisaoCadastroLocacao();
        boolean expResult = false;
        boolean result = instance.verificarVeiculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarOutrosDados method, of class VisaoCadastroLocacao.
     */
    @Test
    public void testVerificarOutrosDados() {
        System.out.println("verificarOutrosDados");
        VisaoCadastroLocacao instance = new VisaoCadastroLocacao();
        boolean expResult = false;
        boolean result = instance.verificarOutrosDados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chamarVerificacoes method, of class VisaoCadastroLocacao.
     */
    @Test
    public void testChamarVerificacoes() {
        System.out.println("chamarVerificacoes");
        VisaoCadastroLocacao instance = new VisaoCadastroLocacao();
        instance.chamarVerificacoes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
