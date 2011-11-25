/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

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
public class VisaoLocacaoTest {
    
    public VisaoLocacaoTest() {
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
     * Test of cadastraLocacao method, of class VisaoLocacao.
     */
    @Test
    public void testCadastraLocacao() {
        System.out.println("cadastraLocacao");
        VisaoLocacao instance = new VisaoLocacao();
        instance.cadastraLocacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarLocacao method, of class VisaoLocacao.
     */
    @Test
    public void testAlterarLocacao() {
        System.out.println("alterarLocacao");
        VisaoLocacao instance = new VisaoLocacao();
        instance.alterarLocacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisarLocacao method, of class VisaoLocacao.
     */
    @Test
    public void testPesquisarLocacao() {
        System.out.println("pesquisarLocacao");
        VisaoLocacao instance = new VisaoLocacao();
        instance.pesquisarLocacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fecharLocacao method, of class VisaoLocacao.
     */
    @Test
    public void testFecharLocacao() {
        System.out.println("fecharLocacao");
        VisaoLocacao instance = new VisaoLocacao();
        instance.fecharLocacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirLocacao method, of class VisaoLocacao.
     */
    @Test
    public void testExcluirLocacao() {
        System.out.println("excluirLocacao");
        VisaoLocacao instance = new VisaoLocacao();
        instance.excluirLocacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of locacoesEmAberto method, of class VisaoLocacao.
     */
    @Test
    public void testLocacoesEmAberto() {
        System.out.println("locacoesEmAberto");
        VisaoLocacao instance = new VisaoLocacao();
        instance.locacoesEmAberto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of locacoesFinalizadas method, of class VisaoLocacao.
     */
    @Test
    public void testLocacoesFinalizadas() {
        System.out.println("locacoesFinalizadas");
        VisaoLocacao instance = new VisaoLocacao();
        instance.locacoesFinalizadas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimirLocacao method, of class VisaoLocacao.
     */
    @Test
    public void testImprimirLocacao() {
        System.out.println("imprimirLocacao");
        Locacao locacao = null;
        VisaoLocacao instance = new VisaoLocacao();
        instance.imprimirLocacao(locacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
