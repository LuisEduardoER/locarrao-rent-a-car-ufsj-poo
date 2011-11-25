/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package locarrao.visao.grafica;

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
public class VisaoLoginTest {
    
    public VisaoLoginTest() {
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
     * Test of main method, of class VisaoLogin.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VisaoLogin.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarLogin method, of class VisaoLogin.
     */
    @Test
    public void testVerificarLogin() {
        System.out.println("verificarLogin");
        VisaoLogin instance = new VisaoLogin();
        instance.verificarLogin();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
