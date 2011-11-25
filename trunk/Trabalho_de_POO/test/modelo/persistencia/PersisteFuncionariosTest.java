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
     * Test of retornarTodosFuncionarios method, of class PersisteFuncionarios.
     */
    @Test
    public void testRetornarTodosFuncionarios() {
        System.out.println("retornarTodosFuncionarios");
        PersisteFuncionarios.retornarTodosFuncionarios();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvar method, of class PersisteFuncionarios.
     */
    @Test
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        Funcionarios funcionarios = null;
        PersisteFuncionarios instance = new PersisteFuncionarios();
        boolean expResult = false;
        boolean result = instance.salvar(funcionarios);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alteraFuncionarios method, of class PersisteFuncionarios.
     */
    @Test
    public void testAlteraFuncionarios() throws Exception {
        System.out.println("alteraFuncionarios");
        Funcionarios funcionarios = null;
        PersisteFuncionarios instance = new PersisteFuncionarios();
        boolean expResult = false;
        boolean result = instance.alteraFuncionarios(funcionarios);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisaFuncionarios method, of class PersisteFuncionarios.
     */
    @Test
    public void testPesquisaFuncionarios_Funcionarios() throws Exception {
        System.out.println("pesquisaFuncionarios");
        Funcionarios funcionarios = null;
        PersisteFuncionarios instance = new PersisteFuncionarios();
        boolean expResult = false;
        boolean result = instance.pesquisaFuncionarios(funcionarios);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisaFuncionarios method, of class PersisteFuncionarios.
     */
    @Test
    public void testPesquisaFuncionarios_int() {
        System.out.println("pesquisaFuncionarios");
        int codigo = 0;
        PersisteFuncionarios instance = new PersisteFuncionarios();
        boolean expResult = false;
        boolean result = instance.pesquisaFuncionarios(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarFuncionario method, of class PersisteFuncionarios.
     */
    @Test
    public void testRetornarFuncionario() {
        System.out.println("retornarFuncionario");
        Funcionarios funcionarios = null;
        PersisteFuncionarios instance = new PersisteFuncionarios();
        boolean expResult = false;
        boolean result = instance.retornarFuncionario(funcionarios);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarClienteComCpf method, of class PersisteFuncionarios.
     */
    @Test
    public void testRetornarClienteComCpf() {
        System.out.println("retornarClienteComCpf");
        Funcionarios funcionarios = null;
        PersisteFuncionarios instance = new PersisteFuncionarios();
        boolean expResult = false;
        boolean result = instance.retornarClienteComCpf(funcionarios);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarFuncionariosComNome method, of class PersisteFuncionarios.
     */
    @Test
    public void testMostrarFuncionariosComNome() {
        System.out.println("mostrarFuncionariosComNome");
        String nome = "";
        PersisteFuncionarios instance = new PersisteFuncionarios();
        instance.mostrarFuncionariosComNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
