/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dominio;

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
@Suite.SuiteClasses({modelo.dominio.LocacaoTest.class, modelo.dominio.TipoLocacaoTest.class, modelo.dominio.VeiculosTest.class, modelo.dominio.EnderecoTest.class, modelo.dominio.PessoaTest.class, modelo.dominio.ClientesTest.class, modelo.dominio.TipoVeiculoTest.class, modelo.dominio.ValidaTest.class, modelo.dominio.MarcaVeiculoTest.class, modelo.dominio.ModeloVeiculoTest.class, modelo.dominio.MotoristaTest.class, modelo.dominio.FuncionariosTest.class})
public class DominioSuite {

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
