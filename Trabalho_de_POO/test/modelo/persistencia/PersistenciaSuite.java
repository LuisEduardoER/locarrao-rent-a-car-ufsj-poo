/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Magelinha
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({modelo.persistencia.PersisteTipoVeiculoTest.class, modelo.persistencia.PersisteMotoristaTest.class, modelo.persistencia.PersisteEnderecoTest.class, modelo.persistencia.PersisteTipoLocacaoTest.class, modelo.persistencia.PersisteMarcaVeiculoTest.class, modelo.persistencia.PersisteFuncionariosTest.class, modelo.persistencia.PersisteVeiculosTest.class, modelo.persistencia.PersisteModeloVeiculoTest.class, modelo.persistencia.PersisteLocacaoTest.class, modelo.persistencia.PersisteClienteTest.class, modelo.persistencia.DaoBaseTest.class})
public class PersistenciaSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
