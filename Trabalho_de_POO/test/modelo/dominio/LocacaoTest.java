/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dominio;

import java.util.Date;
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
public class LocacaoTest {
    
    public LocacaoTest() {
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
     * Test of getQuilometragemDeSaida method, of class Locacao.
     */
    @Test
    public void testGetQuilometragemDeSaida() {
        System.out.println("getQuilometragemDeSaida");
        Locacao instance = new Locacao();
        long expResult = 0L;
        long result = instance.getQuilometragemDeSaida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuilometragemDeSaida method, of class Locacao.
     */
    @Test
    public void testSetQuilometragemDeSaida() {
        System.out.println("setQuilometragemDeSaida");
        long quilometragemDeSaida = 0L;
        Locacao instance = new Locacao();
        instance.setQuilometragemDeSaida(quilometragemDeSaida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuilometragemDeEntrada method, of class Locacao.
     */
    @Test
    public void testGetQuilometragemDeEntrada() {
        System.out.println("getQuilometragemDeEntrada");
        Locacao instance = new Locacao();
        long expResult = 0L;
        long result = instance.getQuilometragemDeEntrada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuilometragemDeEntrada method, of class Locacao.
     */
    @Test
    public void testSetQuilometragemDeEntrada() {
        System.out.println("setQuilometragemDeEntrada");
        long quilometragemDeEntrada = 0L;
        Locacao instance = new Locacao();
        instance.setQuilometragemDeEntrada(quilometragemDeEntrada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Locacao.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Locacao instance = new Locacao();
        double expResult = 0.0;
        double result = instance.getValor();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class Locacao.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        double valor = 0.0;
        Locacao instance = new Locacao();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataSaida method, of class Locacao.
     */
    @Test
    public void testGetDataSaida() {
        System.out.println("getDataSaida");
        Locacao instance = new Locacao();
        Date expResult = null;
        Date result = instance.getDataSaida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataSaida method, of class Locacao.
     */
    @Test
    public void testSetDataSaida() {
        System.out.println("setDataSaida");
        long dataSaida = 0L;
        Locacao instance = new Locacao();
        instance.setDataSaida(dataSaida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataDevolucao method, of class Locacao.
     */
    @Test
    public void testGetDataDevolucao() {
        System.out.println("getDataDevolucao");
        Locacao instance = new Locacao();
        Date expResult = null;
        Date result = instance.getDataDevolucao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataDevolucao method, of class Locacao.
     */
    @Test
    public void testSetDataDevolucao() {
        System.out.println("setDataDevolucao");
        long dataDevolucao = 0L;
        Locacao instance = new Locacao();
        instance.setDataDevolucao(dataDevolucao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrevisao method, of class Locacao.
     */
    @Test
    public void testGetPrevisao() {
        System.out.println("getPrevisao");
        Locacao instance = new Locacao();
        int expResult = 0;
        int result = instance.getPrevisao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrevisao method, of class Locacao.
     */
    @Test
    public void testSetPrevisao() {
        System.out.println("setPrevisao");
        int previsao = 0;
        Locacao instance = new Locacao();
        instance.setPrevisao(previsao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLocacaoAberta method, of class Locacao.
     */
    @Test
    public void testIsLocacaoAberta() {
        System.out.println("isLocacaoAberta");
        Locacao instance = new Locacao();
        boolean expResult = false;
        boolean result = instance.isLocacaoAberta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocacaoAberta method, of class Locacao.
     */
    @Test
    public void testSetLocacaoAberta() {
        System.out.println("setLocacaoAberta");
        boolean locacaoAberta = false;
        Locacao instance = new Locacao();
        instance.setLocacaoAberta(locacaoAberta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoLocacao method, of class Locacao.
     */
    @Test
    public void testGetTipoLocacao() {
        System.out.println("getTipoLocacao");
        Locacao instance = new Locacao();
        TipoLocacao expResult = null;
        TipoLocacao result = instance.getTipoLocacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoLocacao method, of class Locacao.
     */
    @Test
    public void testSetTipoLocacao() {
        System.out.println("setTipoLocacao");
        TipoLocacao tipoLocacao = null;
        Locacao instance = new Locacao();
        instance.setTipoLocacao(tipoLocacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Locacao.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Locacao instance = new Locacao();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Locacao.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Locacao instance = new Locacao();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class Locacao.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Locacao instance = new Locacao();
        Clientes expResult = null;
        Clientes result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class Locacao.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Clientes cliente = null;
        Locacao instance = new Locacao();
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMotorista method, of class Locacao.
     */
    @Test
    public void testGetMotorista() {
        System.out.println("getMotorista");
        Locacao instance = new Locacao();
        Motorista expResult = null;
        Motorista result = instance.getMotorista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMotorista method, of class Locacao.
     */
    @Test
    public void testSetMotorista() {
        System.out.println("setMotorista");
        Motorista motorista = null;
        Locacao instance = new Locacao();
        instance.setMotorista(motorista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVeiculo method, of class Locacao.
     */
    @Test
    public void testGetVeiculo() {
        System.out.println("getVeiculo");
        Locacao instance = new Locacao();
        Veiculos expResult = null;
        Veiculos result = instance.getVeiculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVeiculo method, of class Locacao.
     */
    @Test
    public void testSetVeiculo() {
        System.out.println("setVeiculo");
        Veiculos veiculo = null;
        Locacao instance = new Locacao();
        instance.setVeiculo(veiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Locacao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Locacao instance = new Locacao();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Locacao.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Locacao instance = new Locacao();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Locacao.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Locacao instance = new Locacao();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
