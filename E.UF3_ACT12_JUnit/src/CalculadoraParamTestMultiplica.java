import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)  // Se a�ade delante de la clase - Importante

public class CalculadoraParamTestMultiplica {
		//Creamos los parametros necesarios para realizar las pruebas
		private int num1;
		private int num2;
		private int resultado;
		
		//Se crea un constructor
			public CalculadoraParamTestMultiplica(int num1, int num2, int resultado) {
			     this.num1 = num1;
			     this.num2 = num2;
			     this.resultado = resultado;
			}
			
		//M�todo que devuelve los valores a probar. 
	@Parameters
		public static Collection<Object[]> datos(){   
			return Arrays.asList(new Object[][] {
			// Son 4 listas, con diferentes valores. La prueba la ejecutamos una vez pero autom�ticamente se ejecuta 4 veces con los diferentes valores
				{2,4,8},
				{2,2,6},	//Erroneo
			});
		}
			
		@Test
		public void testMultiplica() {
			Calculadora calmulti = new Calculadora(num1,num2);
			int resul = calmulti.multiplica();
			assertEquals(resultado, resul);
		}

	}
