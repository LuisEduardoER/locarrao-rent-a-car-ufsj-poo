/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao.grafica;

import java.util.List;
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
public class VisaoRelatorioVeiculosDisponiveisTest {
    
    public VisaoRelatorioVeiculosDisponiveisTest() {
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
     * Test of main method, of class VisaoRelatorioVeiculosDisponiveis.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VisaoRelatorioVeiculosDisponiveis.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirNaTabela method, of class VisaoRelatorioVeiculosDisponiveis.
     */
    @Test
    public void testInserirNaTabela() {
        System.out.println("inserirNaTabela");
        List<Veiculos> lista = null;
        VisaoRelatorioVeiculosDisponiveis instance = new VisaoRelatorioVeiculosDisponiveis();
        instance.inserirNaTabela(lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
