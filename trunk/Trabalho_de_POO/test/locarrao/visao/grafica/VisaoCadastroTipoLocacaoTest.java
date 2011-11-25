/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao.grafica;

import modelo.dominio.TipoLocacao;
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
public class VisaoCadastroTipoLocacaoTest {
    
    public VisaoCadastroTipoLocacaoTest() {
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
     * Test of main method, of class VisaoCadastroTipoLocacao.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VisaoCadastroTipoLocacao.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preencherCombo method, of class VisaoCadastroTipoLocacao.
     */
    @Test
    public void testPreencherCombo() {
        System.out.println("preencherCombo");
        VisaoCadastroTipoLocacao instance = new VisaoCadastroTipoLocacao();
        instance.preencherCombo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarCamposEmBranco method, of class VisaoCadastroTipoLocacao.
     */
    @Test
    public void testValidarCamposEmBranco() {
        System.out.println("validarCamposEmBranco");
        VisaoCadastroTipoLocacao instance = new VisaoCadastroTipoLocacao();
        boolean expResult = false;
        boolean result = instance.validarCamposEmBranco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarDadosIncorretos method, of class VisaoCadastroTipoLocacao.
     */
    @Test
    public void testVerificarDadosIncorretos() {
        System.out.println("verificarDadosIncorretos");
        TipoLocacao tipoLocacao = null;
        VisaoCadastroTipoLocacao instance = new VisaoCadastroTipoLocacao();
        boolean expResult = false;
        boolean result = instance.verificarDadosIncorretos(tipoLocacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvar method, of class VisaoCadastroTipoLocacao.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        VisaoCadastroTipoLocacao instance = new VisaoCadastroTipoLocacao();
        instance.salvar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
