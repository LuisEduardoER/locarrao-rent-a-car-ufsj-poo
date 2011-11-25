/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

import modelo.dominio.Funcionarios;
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
public class VisaoFuncionariosTest {
    
    public VisaoFuncionariosTest() {
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
     * Test of cadastraFuncionarios method, of class VisaoFuncionarios.
     */
    @Test
    public void testCadastraFuncionarios() {
        System.out.println("cadastraFuncionarios");
        VisaoFuncionarios instance = new VisaoFuncionarios();
        instance.cadastraFuncionarios();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimeFuncionarios method, of class VisaoFuncionarios.
     */
    @Test
    public void testImprimeFuncionarios() {
        System.out.println("imprimeFuncionarios");
        Funcionarios funcionario = null;
        VisaoFuncionarios instance = new VisaoFuncionarios();
        instance.imprimeFuncionarios(funcionario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
