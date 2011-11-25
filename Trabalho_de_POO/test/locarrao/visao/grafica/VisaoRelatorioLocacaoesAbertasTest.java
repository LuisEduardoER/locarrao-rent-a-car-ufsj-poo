/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao.grafica;

import java.util.List;
import modelo.dominio.Locacao;
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
public class VisaoRelatorioLocacaoesAbertasTest {
    
    public VisaoRelatorioLocacaoesAbertasTest() {
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
     * Test of main method, of class VisaoRelatorioLocacaoesAbertas.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VisaoRelatorioLocacaoesAbertas.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirNaTabela method, of class VisaoRelatorioLocacaoesAbertas.
     */
    @Test
    public void testInserirNaTabela() {
        System.out.println("inserirNaTabela");
        List<Locacao> lista = null;
        VisaoRelatorioLocacaoesAbertas instance = new VisaoRelatorioLocacaoesAbertas();
        instance.inserirNaTabela(lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarCamposEmBranco method, of class VisaoRelatorioLocacaoesAbertas.
     */
    @Test
    public void testVerificarCamposEmBranco() {
        System.out.println("verificarCamposEmBranco");
        VisaoRelatorioLocacaoesAbertas instance = new VisaoRelatorioLocacaoesAbertas();
        boolean expResult = false;
        boolean result = instance.verificarCamposEmBranco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarCamposDatas method, of class VisaoRelatorioLocacaoesAbertas.
     */
    @Test
    public void testVerificarCamposDatas() {
        System.out.println("verificarCamposDatas");
        VisaoRelatorioLocacaoesAbertas instance = new VisaoRelatorioLocacaoesAbertas();
        boolean expResult = false;
        boolean result = instance.verificarCamposDatas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of criarRelatorio method, of class VisaoRelatorioLocacaoesAbertas.
     */
    @Test
    public void testCriarRelatorio() {
        System.out.println("criarRelatorio");
        VisaoRelatorioLocacaoesAbertas instance = new VisaoRelatorioLocacaoesAbertas();
        instance.criarRelatorio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
