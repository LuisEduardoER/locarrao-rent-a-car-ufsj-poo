/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao.grafica;

import java.util.List;
import modelo.dominio.MarcaVeiculo;
import modelo.dominio.ModeloVeiculo;
import modelo.dominio.TipoVeiculo;
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
public class VisaoCadastroVeiculoTest {
    
    public VisaoCadastroVeiculoTest() {
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
     * Test of main method, of class VisaoCadastroVeiculo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VisaoCadastroVeiculo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preencherComboTipo method, of class VisaoCadastroVeiculo.
     */
    @Test
    public void testPreencherComboTipo() {
        System.out.println("preencherComboTipo");
        VisaoCadastroVeiculo instance = new VisaoCadastroVeiculo();
        instance.preencherComboTipo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preencherComboModelo method, of class VisaoCadastroVeiculo.
     */
    @Test
    public void testPreencherComboModelo() {
        System.out.println("preencherComboModelo");
        VisaoCadastroVeiculo instance = new VisaoCadastroVeiculo();
        instance.preencherComboModelo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preencherComboMarca method, of class VisaoCadastroVeiculo.
     */
    @Test
    public void testPreencherComboMarca() {
        System.out.println("preencherComboMarca");
        VisaoCadastroVeiculo instance = new VisaoCadastroVeiculo();
        instance.preencherComboMarca();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarCamposObrigatoriosEmBranco method, of class VisaoCadastroVeiculo.
     */
    @Test
    public void testVerificarCamposObrigatoriosEmBranco() {
        System.out.println("verificarCamposObrigatoriosEmBranco");
        VisaoCadastroVeiculo instance = new VisaoCadastroVeiculo();
        boolean expResult = false;
        boolean result = instance.verificarCamposObrigatoriosEmBranco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarCombos method, of class VisaoCadastroVeiculo.
     */
    @Test
    public void testVerificarCombos() {
        System.out.println("verificarCombos");
        VisaoCadastroVeiculo instance = new VisaoCadastroVeiculo();
        boolean expResult = false;
        boolean result = instance.verificarCombos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarChecksMarcados method, of class VisaoCadastroVeiculo.
     */
    @Test
    public void testRetornarChecksMarcados() {
        System.out.println("retornarChecksMarcados");
        VisaoCadastroVeiculo instance = new VisaoCadastroVeiculo();
        List expResult = null;
        List result = instance.retornarChecksMarcados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarTipo method, of class VisaoCadastroVeiculo.
     */
    @Test
    public void testRetornarTipo() {
        System.out.println("retornarTipo");
        VisaoCadastroVeiculo instance = new VisaoCadastroVeiculo();
        TipoVeiculo expResult = null;
        TipoVeiculo result = instance.retornarTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarModelo method, of class VisaoCadastroVeiculo.
     */
    @Test
    public void testRetornarModelo() {
        System.out.println("retornarModelo");
        VisaoCadastroVeiculo instance = new VisaoCadastroVeiculo();
        ModeloVeiculo expResult = null;
        ModeloVeiculo result = instance.retornarModelo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarMarca method, of class VisaoCadastroVeiculo.
     */
    @Test
    public void testRetornarMarca() {
        System.out.println("retornarMarca");
        VisaoCadastroVeiculo instance = new VisaoCadastroVeiculo();
        MarcaVeiculo expResult = null;
        MarcaVeiculo result = instance.retornarMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pegarValores method, of class VisaoCadastroVeiculo.
     */
    @Test
    public void testPegarValores() {
        System.out.println("pegarValores");
        VisaoCadastroVeiculo instance = new VisaoCadastroVeiculo();
        instance.pegarValores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarCampoNumerico method, of class VisaoCadastroVeiculo.
     */
    @Test
    public void testVerificarCampoNumerico() {
        System.out.println("verificarCampoNumerico");
        VisaoCadastroVeiculo instance = new VisaoCadastroVeiculo();
        boolean expResult = false;
        boolean result = instance.verificarCampoNumerico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvar method, of class VisaoCadastroVeiculo.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        VisaoCadastroVeiculo instance = new VisaoCadastroVeiculo();
        instance.salvar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
