/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

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
public class VisaoTipoLocacaoTest {
    
    public VisaoTipoLocacaoTest() {
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
     * Test of cadastraTipoLocacao method, of class VisaoTipoLocacao.
     */
    @Test
    public void testCadastraTipoLocacao() {
        System.out.println("cadastraTipoLocacao");
        VisaoTipoLocacao instance = new VisaoTipoLocacao();
        instance.cadastraTipoLocacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisaTipoVeiculo method, of class VisaoTipoLocacao.
     */
    @Test
    public void testPesquisaTipoVeiculo() {
        System.out.println("pesquisaTipoVeiculo");
        TipoLocacao tipoLocacao = null;
        VisaoTipoLocacao instance = new VisaoTipoLocacao();
        instance.pesquisaTipoVeiculo(tipoLocacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornaTipoDeLocacao method, of class VisaoTipoLocacao.
     */
    @Test
    public void testRetornaTipoDeLocacao() {
        System.out.println("retornaTipoDeLocacao");
        VisaoTipoLocacao instance = new VisaoTipoLocacao();
        String expResult = "";
        String result = instance.retornaTipoDeLocacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alteraTipoLocacao method, of class VisaoTipoLocacao.
     */
    @Test
    public void testAlteraTipoLocacao() {
        System.out.println("alteraTipoLocacao");
        VisaoTipoLocacao instance = new VisaoTipoLocacao();
        instance.alteraTipoLocacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
