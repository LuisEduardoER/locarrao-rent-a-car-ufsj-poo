/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.util.Date;
import java.util.List;
import modelo.dominio.Clientes;
import modelo.dominio.Locacao;
import modelo.dominio.Motorista;
import modelo.dominio.TipoLocacao;
import modelo.dominio.Veiculos;
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
public class PersisteLocacaoTest {
    
    public PersisteLocacaoTest() {
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
     * Test of calculaValorLocacao method, of class PersisteLocacao.
     */
    @Test
    public void testCalculaValorLocacao_4args_1() {
        System.out.println("calculaValorLocacao");
        long valorDeSaida = 0L;
        long valorDeChegada = 0L;
        TipoLocacao tipoLocacao = null;
        Locacao locacao = null;
        PersisteLocacao instance = new PersisteLocacao();
        double expResult = 0.0;
        double result = instance.calculaValorLocacao(valorDeSaida, valorDeChegada, tipoLocacao, locacao);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculaValorLocacao method, of class PersisteLocacao.
     */
    @Test
    public void testCalculaValorLocacao_4args_2() {
        System.out.println("calculaValorLocacao");
        Date dataDeSaida = null;
        Date dataDeChegada = null;
        TipoLocacao tipoLocacao = null;
        Locacao locacao = null;
        PersisteLocacao instance = new PersisteLocacao();
        double expResult = 0.0;
        double result = instance.calculaValorLocacao(dataDeSaida, dataDeChegada, tipoLocacao, locacao);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of diferencaDeDias method, of class PersisteLocacao.
     */
    @Test
    public void testDiferencaDeDias() {
        System.out.println("diferencaDeDias");
        long dataDeSaida = 0L;
        long dataDeChegada = 0L;
        PersisteLocacao instance = new PersisteLocacao();
        long expResult = 0L;
        long result = instance.diferencaDeDias(dataDeSaida, dataDeChegada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvarBD method, of class PersisteLocacao.
     */
    @Test
    public void testSalvarBD() {
        System.out.println("salvarBD");
        Locacao locacao = null;
        PersisteLocacao instance = new PersisteLocacao();
        instance.salvarBD(locacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarTipoLocacao method, of class PersisteLocacao.
     */
    @Test
    public void testRetornarTipoLocacao() {
        System.out.println("retornarTipoLocacao");
        Veiculos veiculo = null;
        PersisteLocacao instance = new PersisteLocacao();
        TipoLocacao expResult = null;
        TipoLocacao result = instance.retornarTipoLocacao(veiculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarLocacoesEmAbertoPorCliente method, of class PersisteLocacao.
     */
    @Test
    public void testRetornarLocacoesEmAbertoPorCliente() {
        System.out.println("retornarLocacoesEmAbertoPorCliente");
        Clientes cliente = null;
        PersisteLocacao instance = new PersisteLocacao();
        List expResult = null;
        List result = instance.retornarLocacoesEmAbertoPorCliente(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarLocacoesFinalizadasDB method, of class PersisteLocacao.
     */
    @Test
    public void testRetornarLocacoesFinalizadasDB_Date_Date() {
        System.out.println("retornarLocacoesFinalizadasDB");
        Date dataInicial = null;
        Date dataFinal = null;
        PersisteLocacao instance = new PersisteLocacao();
        List expResult = null;
        List result = instance.retornarLocacoesFinalizadasDB(dataInicial, dataFinal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarLocacoesFinalizadasDB method, of class PersisteLocacao.
     */
    @Test
    public void testRetornarLocacoesFinalizadasDB_0args() {
        System.out.println("retornarLocacoesFinalizadasDB");
        PersisteLocacao instance = new PersisteLocacao();
        List expResult = null;
        List result = instance.retornarLocacoesFinalizadasDB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarLocacoesAbertasDB method, of class PersisteLocacao.
     */
    @Test
    public void testRetornarLocacoesAbertasDB_Date_Date() {
        System.out.println("retornarLocacoesAbertasDB");
        Date dataInicial = null;
        Date dataFinal = null;
        PersisteLocacao instance = new PersisteLocacao();
        List expResult = null;
        List result = instance.retornarLocacoesAbertasDB(dataInicial, dataFinal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarLocacoesAbertasDB method, of class PersisteLocacao.
     */
    @Test
    public void testRetornarLocacoesAbertasDB_0args() {
        System.out.println("retornarLocacoesAbertasDB");
        PersisteLocacao instance = new PersisteLocacao();
        List expResult = null;
        List result = instance.retornarLocacoesAbertasDB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
