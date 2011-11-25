/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

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
public class VisaoVeiculosTest {
    
    public VisaoVeiculosTest() {
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
     * Test of cadastraVeiculos method, of class VisaoVeiculos.
     */
    @Test
    public void testCadastraVeiculos() {
        System.out.println("cadastraVeiculos");
        VisaoVeiculos instance = new VisaoVeiculos();
        instance.cadastraVeiculos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarVeiculos method, of class VisaoVeiculos.
     */
    @Test
    public void testAlterarVeiculos() {
        System.out.println("alterarVeiculos");
        VisaoVeiculos instance = new VisaoVeiculos();
        instance.alterarVeiculos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisarVeiculo method, of class VisaoVeiculos.
     */
    @Test
    public void testPesquisarVeiculo_Veiculos() {
        System.out.println("pesquisarVeiculo");
        Veiculos veiculos = null;
        VisaoVeiculos instance = new VisaoVeiculos();
        boolean expResult = false;
        boolean result = instance.pesquisarVeiculo(veiculos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisarVeiculo method, of class VisaoVeiculos.
     */
    @Test
    public void testPesquisarVeiculo_0args() {
        System.out.println("pesquisarVeiculo");
        VisaoVeiculos instance = new VisaoVeiculos();
        instance.pesquisarVeiculo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirVeiculo method, of class VisaoVeiculos.
     */
    @Test
    public void testExcluirVeiculo() {
        System.out.println("excluirVeiculo");
        VisaoVeiculos instance = new VisaoVeiculos();
        instance.excluirVeiculo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of veiculosDisponiveis method, of class VisaoVeiculos.
     */
    @Test
    public void testVeiculosDisponiveis() {
        System.out.println("veiculosDisponiveis");
        VisaoVeiculos instance = new VisaoVeiculos();
        instance.veiculosDisponiveis();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of veiculosMaisProcurados method, of class VisaoVeiculos.
     */
    @Test
    public void testVeiculosMaisProcurados() {
        System.out.println("veiculosMaisProcurados");
        VisaoVeiculos instance = new VisaoVeiculos();
        instance.veiculosMaisProcurados();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of veiculosMaisRentaveis method, of class VisaoVeiculos.
     */
    @Test
    public void testVeiculosMaisRentaveis() {
        System.out.println("veiculosMaisRentaveis");
        VisaoVeiculos instance = new VisaoVeiculos();
        instance.veiculosMaisRentaveis();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disponibilidadePorTipo method, of class VisaoVeiculos.
     */
    @Test
    public void testDisponibilidadePorTipo() {
        System.out.println("disponibilidadePorTipo");
        VisaoVeiculos instance = new VisaoVeiculos();
        instance.disponibilidadePorTipo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimirVeiculo method, of class VisaoVeiculos.
     */
    @Test
    public void testImprimirVeiculo() {
        System.out.println("imprimirVeiculo");
        Veiculos veiculo = null;
        VisaoVeiculos instance = new VisaoVeiculos();
        instance.imprimirVeiculo(veiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
