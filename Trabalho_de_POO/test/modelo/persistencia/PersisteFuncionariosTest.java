/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

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
public class PersisteFuncionariosTest {
    
    public PersisteFuncionariosTest() {
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
     * Test of verificarLogin method, of class PersisteFuncionarios.
     */
    @Test
    public void testVerificarLogin() {
        System.out.println("verificarLogin");
        Funcionarios funcionario = null;
        PersisteFuncionarios instance = new PersisteFuncionarios();
        boolean expResult = false;
        boolean result = instance.verificarLogin(funcionario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarFuncionarioJaCadastrado method, of class PersisteFuncionarios.
     */
    @Test
    public void testVerificarFuncionarioJaCadastrado() {
        System.out.println("verificarFuncionarioJaCadastrado");
        Funcionarios funcionario = null;
        PersisteFuncionarios instance = new PersisteFuncionarios();
        boolean expResult = false;
        boolean result = instance.verificarFuncionarioJaCadastrado(funcionario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvarBD method, of class PersisteFuncionarios.
     */
    @Test
    public void testSalvarBD() {
        System.out.println("salvarBD");
        Funcionarios funcionario = null;
        PersisteFuncionarios instance = new PersisteFuncionarios();
        instance.salvarBD(funcionario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
