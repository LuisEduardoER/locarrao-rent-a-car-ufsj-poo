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
