/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dominio;

import java.util.List;
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
public class VeiculosTest {
    
    public VeiculosTest() {
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
     * Test of getPlaca method, of class Veiculos.
     */
    @Test
    public void testGetPlaca() {
        System.out.println("getPlaca");
        Veiculos instance = new Veiculos();
        String expResult = "";
        String result = instance.getPlaca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlaca method, of class Veiculos.
     */
    @Test
    public void testSetPlaca() {
        System.out.println("setPlaca");
        String placa = "";
        Veiculos instance = new Veiculos();
        instance.setPlaca(placa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCor method, of class Veiculos.
     */
    @Test
    public void testGetCor() {
        System.out.println("getCor");
        Veiculos instance = new Veiculos();
        String expResult = "";
        String result = instance.getCor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCor method, of class Veiculos.
     */
    @Test
    public void testSetCor() {
        System.out.println("setCor");
        String cor = "";
        Veiculos instance = new Veiculos();
        instance.setCor(cor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAno method, of class Veiculos.
     */
    @Test
    public void testGetAno() {
        System.out.println("getAno");
        Veiculos instance = new Veiculos();
        int expResult = 0;
        int result = instance.getAno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAno method, of class Veiculos.
     */
    @Test
    public void testSetAno() {
        System.out.println("setAno");
        int ano = 0;
        Veiculos instance = new Veiculos();
        instance.setAno(ano);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObservacao method, of class Veiculos.
     */
    @Test
    public void testGetObservacao() {
        System.out.println("getObservacao");
        Veiculos instance = new Veiculos();
        String expResult = "";
        String result = instance.getObservacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObservacao method, of class Veiculos.
     */
    @Test
    public void testSetObservacao() {
        System.out.println("setObservacao");
        String observacao = "";
        Veiculos instance = new Veiculos();
        instance.setObservacao(observacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoVeiculo method, of class Veiculos.
     */
    @Test
    public void testGetTipoVeiculo() {
        System.out.println("getTipoVeiculo");
        Veiculos instance = new Veiculos();
        TipoVeiculo expResult = null;
        TipoVeiculo result = instance.getTipoVeiculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoVeiculo method, of class Veiculos.
     */
    @Test
    public void testSetTipoVeiculo() {
        System.out.println("setTipoVeiculo");
        TipoVeiculo tipoVeiculo = null;
        Veiculos instance = new Veiculos();
        instance.setTipoVeiculo(tipoVeiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarcaVeiculo method, of class Veiculos.
     */
    @Test
    public void testGetMarcaVeiculo() {
        System.out.println("getMarcaVeiculo");
        Veiculos instance = new Veiculos();
        MarcaVeiculo expResult = null;
        MarcaVeiculo result = instance.getMarcaVeiculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarcaVeiculo method, of class Veiculos.
     */
    @Test
    public void testSetMarcaVeiculo() {
        System.out.println("setMarcaVeiculo");
        MarcaVeiculo marcaVeiculo = null;
        Veiculos instance = new Veiculos();
        instance.setMarcaVeiculo(marcaVeiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloVeiculo method, of class Veiculos.
     */
    @Test
    public void testGetModeloVeiculo() {
        System.out.println("getModeloVeiculo");
        Veiculos instance = new Veiculos();
        ModeloVeiculo expResult = null;
        ModeloVeiculo result = instance.getModeloVeiculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloVeiculo method, of class Veiculos.
     */
    @Test
    public void testSetModeloVeiculo() {
        System.out.println("setModeloVeiculo");
        ModeloVeiculo modeloVeiculo = null;
        Veiculos instance = new Veiculos();
        instance.setModeloVeiculo(modeloVeiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalLocacoes method, of class Veiculos.
     */
    @Test
    public void testGetTotalLocacoes() {
        System.out.println("getTotalLocacoes");
        Veiculos instance = new Veiculos();
        int expResult = 0;
        int result = instance.getTotalLocacoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalLocacoes method, of class Veiculos.
     */
    @Test
    public void testSetTotalLocacoes() {
        System.out.println("setTotalLocacoes");
        int totalLocacoes = 0;
        Veiculos instance = new Veiculos();
        instance.setTotalLocacoes(totalLocacoes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorTotalLocacoes method, of class Veiculos.
     */
    @Test
    public void testGetValorTotalLocacoes() {
        System.out.println("getValorTotalLocacoes");
        Veiculos instance = new Veiculos();
        double expResult = 0.0;
        double result = instance.getValorTotalLocacoes();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorTotalLocacoes method, of class Veiculos.
     */
    @Test
    public void testSetValorTotalLocacoes() {
        System.out.println("setValorTotalLocacoes");
        double valorTotalLocacoes = 0.0;
        Veiculos instance = new Veiculos();
        instance.setValorTotalLocacoes(valorTotalLocacoes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Veiculos.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Veiculos instance = new Veiculos();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Veiculos.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Veiculos instance = new Veiculos();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpcionais method, of class Veiculos.
     */
    @Test
    public void testGetOpcionais() {
        System.out.println("getOpcionais");
        Veiculos instance = new Veiculos();
        List expResult = null;
        List result = instance.getOpcionais();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOpcionais method, of class Veiculos.
     */
    @Test
    public void testSetOpcionais() {
        System.out.println("setOpcionais");
        List<String> opcionais = null;
        Veiculos instance = new Veiculos();
        instance.setOpcionais(opcionais);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
