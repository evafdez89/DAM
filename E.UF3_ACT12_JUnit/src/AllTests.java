import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)  //Indica que la clase es una suite de la clase
@SuiteClasses({ CalculadoraParamTestResta.class, CalculadoraParamTestSuma.class })  //Indica las clases que forman parte del conjunto de pruebas
public class AllTests {

}
