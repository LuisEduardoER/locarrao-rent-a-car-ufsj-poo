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
public class VisaoCadastroMarcaVeiculoTest {
    
    public VisaoCadastroMarcaVeiculoTest() {
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
     * Test of main method, of class VisaoCadastroModeloVeiculo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VisaoCadastroModeloVeiculo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarCampoEmBranco method, of class VisaoCadastroModeloVeiculo.
     */
    @Test
    public void testVerificarCampoEmBranco() {
        System.out.println("verificarCampoEmBranco");
        VisaoCadastroModeloVeiculo instance = new VisaoCadastroModeloVeiculo();
        boolean expResult = false;
        boolean result = instance.verificarCampoEmBranco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pegarValores method, of class VisaoCadastroModeloVeiculo.
     */
    @Test
    public void testPegarValores() {
        System.out.println("pegarValores");
        VisaoCadastroModeloVeiculo instance = new VisaoCadastroModeloVeiculo();
        instance.pegarValores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvar method, of class VisaoCadastroModeloVeiculo.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        VisaoCadastroModeloVeiculo instance = new VisaoCadastroModeloVeiculo();
        instance.salvar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
