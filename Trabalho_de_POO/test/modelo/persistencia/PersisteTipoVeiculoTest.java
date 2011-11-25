/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.util.List;
import modelo.dominio.TipoVeiculo;
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
public class PersisteTipoVeiculoTest {
    
    public PersisteTipoVeiculoTest() {
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
     * Test of retornarListaTipos method, of class PersisteTipoVeiculo.
     */
    @Test
    public void testRetornarListaTipos() {
        System.out.println("retornarListaTipos");
        PersisteTipoVeiculo instance = new PersisteTipoVeiculo();
        List expResult = null;
        List result = instance.retornarListaTipos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornarTipoVeiculo method, of class PersisteTipoVeiculo.
     */
    @Test
    public void testRetornarTipoVeiculo() {
        System.out.println("retornarTipoVeiculo");
        TipoVeiculo tipoVeiculo = null;
        PersisteTipoVeiculo instance = new PersisteTipoVeiculo();
        TipoVeiculo expResult = null;
        TipoVeiculo result = instance.retornarTipoVeiculo(tipoVeiculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarTipoJaCadastrado method, of class PersisteTipoVeiculo.
     */
    @Test
    public void testVerificarTipoJaCadastrado() {
        System.out.println("verificarTipoJaCadastrado");
        TipoVeiculo tipoVeiculo = null;
        PersisteTipoVeiculo instance = new PersisteTipoVeiculo();
        boolean expResult = false;
        boolean result = instance.verificarTipoJaCadastrado(tipoVeiculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvarBD method, of class PersisteTipoVeiculo.
     */
    @Test
    public void testSalvarBD() {
        System.out.println("salvarBD");
        TipoVeiculo tipoVeiculo = null;
        PersisteTipoVeiculo instance = new PersisteTipoVeiculo();
        instance.salvarBD(tipoVeiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
