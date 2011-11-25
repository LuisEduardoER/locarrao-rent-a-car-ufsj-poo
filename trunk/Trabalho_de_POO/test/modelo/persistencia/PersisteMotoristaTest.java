package modelo.persistencia;

import modelo.dominio.Motorista;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersisteMotoristaTest {
    
    public PersisteMotoristaTest() {
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
     * Test of pesquisarMotoristaBD method, of class PersisteMotorista.
     */
    @Test
    public void testPesquisarMotoristaBD() {
        System.out.println("pesquisarMotoristaBD");
        Motorista motorista = null;
        PersisteMotorista instance = new PersisteMotorista();
        boolean expResult = false;
        boolean result = instance.pesquisarMotoristaBD(motorista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarMotoristaJaCadastrado method, of class PersisteMotorista.
     */
    @Test
    public void testVerificarMotoristaJaCadastrado() {
        System.out.println("verificarMotoristaJaCadastrado");
        Motorista motorista = null;
        PersisteMotorista instance = new PersisteMotorista();
        boolean expResult = false;
        boolean result = instance.verificarMotoristaJaCadastrado(motorista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvarBD method, of class PersisteMotorista.
     */
    @Test
    public void testSalvarBD() {
        System.out.println("salvarBD");
        Motorista motorista = null;
        PersisteMotorista instance = new PersisteMotorista();
        instance.salvarBD(motorista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
