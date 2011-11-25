/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao;

import java.util.Scanner;
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
public class MenuTest {
    
    public MenuTest() {
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
     * Test of main method, of class Menu.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Menu.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menu method, of class Menu.
     */
    @Test
    public void testMenu() {
        System.out.println("menu");
        Menu instance = new Menu();
        instance.menu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuCadastro method, of class Menu.
     */
    @Test
    public void testMenuCadastro() {
        System.out.println("menuCadastro");
        Scanner entrada = null;
        Menu instance = new Menu();
        int expResult = 0;
        int result = instance.menuCadastro(entrada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuCadastroCliente method, of class Menu.
     */
    @Test
    public void testMenuCadastroCliente() {
        System.out.println("menuCadastroCliente");
        Scanner entrada = null;
        Menu instance = new Menu();
        int expResult = 0;
        int result = instance.menuCadastroCliente(entrada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuCadastroVeiculo method, of class Menu.
     */
    @Test
    public void testMenuCadastroVeiculo() {
        System.out.println("menuCadastroVeiculo");
        Scanner entrada = null;
        Menu instance = new Menu();
        int expResult = 0;
        int result = instance.menuCadastroVeiculo(entrada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuCadastroMotorista method, of class Menu.
     */
    @Test
    public void testMenuCadastroMotorista() {
        System.out.println("menuCadastroMotorista");
        Scanner entrada = null;
        Menu instance = new Menu();
        int expResult = 0;
        int result = instance.menuCadastroMotorista(entrada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuCadastroTipoVeiculo method, of class Menu.
     */
    @Test
    public void testMenuCadastroTipoVeiculo() {
        System.out.println("menuCadastroTipoVeiculo");
        Scanner entrada = null;
        Menu instance = new Menu();
        int expResult = 0;
        int result = instance.menuCadastroTipoVeiculo(entrada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuCadastroMarcaVeiculo method, of class Menu.
     */
    @Test
    public void testMenuCadastroMarcaVeiculo() {
        System.out.println("menuCadastroMarcaVeiculo");
        Scanner entrada = null;
        Menu instance = new Menu();
        int expResult = 0;
        int result = instance.menuCadastroMarcaVeiculo(entrada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuCadastroModeloVeiculo method, of class Menu.
     */
    @Test
    public void testMenuCadastroModeloVeiculo() {
        System.out.println("menuCadastroModeloVeiculo");
        Scanner entrada = null;
        Menu instance = new Menu();
        int expResult = 0;
        int result = instance.menuCadastroModeloVeiculo(entrada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuCadastroTipoLocacao method, of class Menu.
     */
    @Test
    public void testMenuCadastroTipoLocacao() {
        System.out.println("menuCadastroTipoLocacao");
        Scanner entrada = null;
        Menu instance = new Menu();
        int expResult = 0;
        int result = instance.menuCadastroTipoLocacao(entrada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuRelatorios method, of class Menu.
     */
    @Test
    public void testMenuRelatorios() {
        System.out.println("menuRelatorios");
        Scanner entrada = null;
        Menu instance = new Menu();
        int expResult = 0;
        int result = instance.menuRelatorios(entrada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuLocacao method, of class Menu.
     */
    @Test
    public void testMenuLocacao() {
        System.out.println("menuLocacao");
        Scanner entrada = null;
        Menu instance = new Menu();
        int expResult = 0;
        int result = instance.menuLocacao(entrada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
