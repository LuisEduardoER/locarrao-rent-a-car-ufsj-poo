/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import modelo.dominio.Locacao;
import modelo.dominio.TipoLocacao;
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
public class PersisteTipoLocacaoTest {
    
    public PersisteTipoLocacaoTest() {
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
     * Test of retornarTipoLocacaoPorTipoVeiculo method, of class PersisteTipoLocacao.
     */
    @Test
    public void testRetornarTipoLocacao() {
        System.out.println("retornarTipoLocacao");
        TipoVeiculo tipoVeiculo = null;
        PersisteTipoLocacao instance = new PersisteTipoLocacao();
        TipoLocacao expResult = null;
        TipoLocacao result = instance.retornarTipoLocacaoPorTipoVeiculo(tipoVeiculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvarBD method, of class PersisteTipoLocacao.
     */
    @Test
    public void testSalvarBD() {
        System.out.println("salvarBD");
        TipoLocacao tipoLocacao = null;
        PersisteTipoLocacao instance = new PersisteTipoLocacao();
        instance.salvarBD(tipoLocacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizarBD method, of class PersisteTipoLocacao.
     */
    @Test
    public void testAtualizarBD() {
        System.out.println("atualizarBD");
        TipoLocacao tipoLocacao = null;
        PersisteTipoLocacao instance = new PersisteTipoLocacao();
        instance.atualizarBD(tipoLocacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarSeExisteCadastro method, of class PersisteTipoLocacao.
     */
    @Test
    public void testVerificarSeExisteCadastro() {
        System.out.println("verificarSeExisteCadastro");
        TipoVeiculo tipoVeiculo = null;
        PersisteTipoLocacao instance = new PersisteTipoLocacao();
        boolean expResult = false;
        boolean result = instance.verificarSeExisteCadastro(tipoVeiculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
