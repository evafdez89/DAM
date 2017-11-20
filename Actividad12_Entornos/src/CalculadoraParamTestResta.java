import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)  // Se añade delante de la clase - Importante

public class CalculadoraParamTestResta {
	//Creamos los parametros necesarios para realizar las pruebas
	private int num1;
	private int num2;
	private int resultado;
	
	//Se crea un constructor
		public CalculadoraParamTestResta(int num1, int num2, int resultado) {
		     this.num1 = num1;
		     this.num2 = num2;
		     this.resultado = resultado;
		}
		
	//Método que devuelve los valores a probar. 
@Parameters
	public static Collection<Object[]> datos(){   
		return Arrays.asList(new Object[][] {
		// Son 4 listas, con diferentes valores. La prueba la ejecutamos una vez pero automáticamente se ejecuta 4 veces con los diferentes valores
			{2,4,-2},
			{5,4,1},	
			{10,20,30},  //Erroneo
			{200,100,100},
		});
	}
		
	@Test
	public void testResta() {
		Calculadora calresta = new Calculadora(num1,num2);
		int resul = calresta.resta();
		assertEquals(resultado, resul);
	}

}
