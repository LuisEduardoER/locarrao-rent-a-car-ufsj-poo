/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

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
public class DaoBaseTest {
    
    public DaoBaseTest() {
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
     * Test of abrirDB method, of class DaoBase.
     */
    @Test
    public void testAbrirDB() {
        System.out.println("abrirDB");
        DaoBase instance = new DaoBase();
        instance.abrirDB();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fecharDB method, of class DaoBase.
     */
    @Test
    public void testFecharDB() {
        System.out.println("fecharDB");
        DaoBase instance = new DaoBase();
        instance.fecharDB();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
