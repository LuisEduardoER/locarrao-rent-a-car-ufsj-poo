/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

import modelo.dominio.Motorista;
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
public class VisaoMotoristaTest {
    
    public VisaoMotoristaTest() {
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
     * Test of cadastrarMotorista method, of class VisaoMotorista.
     */
    @Test
    public void testCadastrarMotorista() {
        System.out.println("cadastrarMotorista");
        VisaoMotorista instance = new VisaoMotorista();
        instance.cadastrarMotorista();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarMotorista method, of class VisaoMotorista.
     */
    @Test
    public void testAlterarMotorista() {
        System.out.println("alterarMotorista");
        VisaoMotorista instance = new VisaoMotorista();
        instance.alterarMotorista();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisarMotorista method, of class VisaoMotorista.
     */
    @Test
    public void testPesquisarMotorista() {
        System.out.println("pesquisarMotorista");
        VisaoMotorista instance = new VisaoMotorista();
        instance.pesquisarMotorista();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exibirMotorista method, of class VisaoMotorista.
     */
    @Test
    public void testExibirMotorista() {
        System.out.println("exibirMotorista");
        Motorista motorista = null;
        VisaoMotorista instance = new VisaoMotorista();
        instance.exibirMotorista(motorista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirMotorista method, of class VisaoMotorista.
     */
    @Test
    public void testExcluirMotorista() {
        System.out.println("excluirMotorista");
        VisaoMotorista instance = new VisaoMotorista();
        instance.excluirMotorista();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
