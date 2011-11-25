/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.util.List;
import modelo.dominio.TipoVeiculo;
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
public class PersisteVeiculosTest {
    
    public PersisteVeiculosTest() {
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
     * Test of retornarTodosVeiculos method, of class PersisteVeiculos.
     */
    @Test
    public void testRetornarTodosVeiculos() {
        System.out.println("retornarTodosVeiculos");
        PersisteVeiculos.retornarTodosVeiculos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvar method, of class PersisteVeiculos.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        Veiculos veiculos = null;
        PersisteVeiculos instance = new PersisteVeiculos();
        boolean expResult = false;
        boolean result = instance.salvar(veiculos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarVeiculo method, of class PersisteVeiculos.
     */
    @Test
    public void testAlterarVeiculo() throws Exception {
        System.out.println("alterarVeiculo");
        Veiculos veiculos = null;
        PersisteVeiculos instance = new PersisteVeiculos();
        boolean expResult = false;
        boolean result = instance.alterarVeiculo(veiculos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisarVeiculo method, of class PersisteVeiculos.
     */
    @Test
    public void testPesquisarVeiculo() throws Exception {
        System.out.println("pesquisarVeiculo");
        Veiculos veiculos = null;
        PersisteVeiculos instance = new PersisteVeiculos();
        boolean expResult = false;
        boolean result = instance.pesquisarVeiculo(veiculos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarVeiculo method, of class PersisteVeiculos.
     */
    @Test
    public void testRetornarVeiculo() {
        System.out.println("retornarVeiculo");
        Veiculos veiculo = null;
        PersisteVeiculos instance = new PersisteVeiculos();
        instance.retornarVeiculo(veiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarveiculosDisponiveis method, of class PersisteVeiculos.
     */
    @Test
    public void testVerificarveiculosDisponiveis() {
        System.out.println("verificarveiculosDisponiveis");
        PersisteVeiculos instance = new PersisteVeiculos();
        instance.verificarveiculosDisponiveis();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarVeiculosMaisProcurados method, of class PersisteVeiculos.
     */
    @Test
    public void testMostrarVeiculosMaisProcurados() {
        System.out.println("mostrarVeiculosMaisProcurados");
        PersisteVeiculos instance = new PersisteVeiculos();
        instance.mostrarVeiculosMaisProcurados();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarVeiculosMaisRentaveis method, of class PersisteVeiculos.
     */
    @Test
    public void testMostrarVeiculosMaisRentaveis() {
        System.out.println("mostrarVeiculosMaisRentaveis");
        PersisteVeiculos instance = new PersisteVeiculos();
        instance.mostrarVeiculosMaisRentaveis();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarVeiculosDisponiveis method, of class PersisteVeiculos.
     */
    @Test
    public void testMostrarVeiculosDisponiveis() {
        System.out.println("mostrarVeiculosDisponiveis");
        TipoVeiculo tipoVeiculo = null;
        PersisteVeiculos instance = new PersisteVeiculos();
        instance.mostrarVeiculosDisponiveis(tipoVeiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisarVeiculoBD method, of class PersisteVeiculos.
     */
    @Test
    public void testPesquisarVeiculoBD() {
        System.out.println("pesquisarVeiculoBD");
        Veiculos veiculo = null;
        PersisteVeiculos instance = new PersisteVeiculos();
        boolean expResult = false;
        boolean result = instance.pesquisarVeiculoBD(veiculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvarBD method, of class PersisteVeiculos.
     */
    @Test
    public void testSalvarBD() {
        System.out.println("salvarBD");
        Veiculos veiculo = null;
        PersisteVeiculos instance = new PersisteVeiculos();
        instance.salvarBD(veiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of veiculosDisponiveisBD method, of class PersisteVeiculos.
     */
    @Test
    public void testVeiculosDisponiveisBD() {
        System.out.println("veiculosDisponiveisBD");
        PersisteVeiculos instance = new PersisteVeiculos();
        List expResult = null;
        List result = instance.veiculosDisponiveisBD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
