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
     * Test of retornarTodosTipoLocacao method, of class PersisteTipoLocacao.
     */
    @Test
    public void testRetornarTodosTipoLocacao() {
        System.out.println("retornarTodosTipoLocacao");
        PersisteTipoLocacao.retornarTodosTipoLocacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvar method, of class PersisteTipoLocacao.
     */
    @Test
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        TipoLocacao tipoLocacao = null;
        PersisteTipoLocacao instance = new PersisteTipoLocacao();
        boolean expResult = false;
        boolean result = instance.salvar(tipoLocacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarCadastroTipoLocacao method, of class PersisteTipoLocacao.
     */
    @Test
    public void testAlterarCadastroTipoLocacao() {
        System.out.println("alterarCadastroTipoLocacao");
        TipoLocacao tipoLocacao = null;
        PersisteTipoLocacao instance = new PersisteTipoLocacao();
        instance.alterarCadastroTipoLocacao(tipoLocacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarTaxa method, of class PersisteTipoLocacao.
     */
    @Test
    public void testRetornarTaxa() {
        System.out.println("retornarTaxa");
        TipoLocacao tipoLocacao = null;
        Locacao locacao = null;
        PersisteTipoLocacao instance = new PersisteTipoLocacao();
        double expResult = 0.0;
        double result = instance.retornarTaxa(tipoLocacao, locacao);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarPrecoPorKm method, of class PersisteTipoLocacao.
     */
    @Test
    public void testRetornarPrecoPorKm() {
        System.out.println("retornarPrecoPorKm");
        TipoLocacao tipoLocacao = null;
        PersisteTipoLocacao instance = new PersisteTipoLocacao();
        double expResult = 0.0;
        double result = instance.retornarPrecoPorKm(tipoLocacao);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarTipoVeiculoBD method, of class PersisteTipoLocacao.
     */
    @Test
    public void testRetornarTipoVeiculoBD() {
        System.out.println("retornarTipoVeiculoBD");
        TipoVeiculo tipoVeiculo = null;
        PersisteTipoLocacao instance = new PersisteTipoLocacao();
        TipoVeiculo expResult = null;
        TipoVeiculo result = instance.retornarTipoVeiculoBD(tipoVeiculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarTipoLocacao method, of class PersisteTipoLocacao.
     */
    @Test
    public void testRetornarTipoLocacao() {
        System.out.println("retornarTipoLocacao");
        TipoLocacao tipoLocacao = null;
        PersisteTipoLocacao instance = new PersisteTipoLocacao();
        TipoLocacao expResult = null;
        TipoLocacao result = instance.retornarTipoLocacao(tipoLocacao);
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
