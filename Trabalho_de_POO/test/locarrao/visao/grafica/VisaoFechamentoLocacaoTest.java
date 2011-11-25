/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao.grafica;

import java.util.List;
import modelo.dominio.Clientes;
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
public class VisaoFechamentoLocacaoTest {
    
    public VisaoFechamentoLocacaoTest() {
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
     * Test of main method, of class VisaoFechamentoLocacao.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VisaoFechamentoLocacao.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exibirResultado method, of class VisaoFechamentoLocacao.
     */
    @Test
    public void testExibirResultado() {
        System.out.println("exibirResultado");
        VisaoFechamentoLocacao instance = new VisaoFechamentoLocacao();
        instance.exibirResultado();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarListaLocacoes method, of class VisaoFechamentoLocacao.
     */
    @Test
    public void testBuscarListaLocacoes() {
        System.out.println("buscarListaLocacoes");
        Clientes cliente = null;
        VisaoFechamentoLocacao instance = new VisaoFechamentoLocacao();
        instance.buscarListaLocacoes(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirNaTabela method, of class VisaoFechamentoLocacao.
     */
    @Test
    public void testInserirNaTabela() {
        System.out.println("inserirNaTabela");
        List<Locacao> lista = null;
        VisaoFechamentoLocacao instance = new VisaoFechamentoLocacao();
        instance.inserirNaTabela(lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pegarValor method, of class VisaoFechamentoLocacao.
     */
    @Test
    public void testPegarValor() {
        System.out.println("pegarValor");
        VisaoFechamentoLocacao instance = new VisaoFechamentoLocacao();
        instance.pegarValor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chamarVerificacoes method, of class VisaoFechamentoLocacao.
     */
    @Test
    public void testChamarVerificacoes() {
        System.out.println("chamarVerificacoes");
        VisaoFechamentoLocacao instance = new VisaoFechamentoLocacao();
        boolean expResult = false;
        boolean result = instance.chamarVerificacoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarEntrada method, of class VisaoFechamentoLocacao.
     */
    @Test
    public void testVerificarEntrada() {
        System.out.println("verificarEntrada");
        VisaoFechamentoLocacao instance = new VisaoFechamentoLocacao();
        boolean expResult = false;
        boolean result = instance.verificarEntrada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
