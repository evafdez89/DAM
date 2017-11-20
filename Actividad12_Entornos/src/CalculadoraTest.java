import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testResta() {
		Calculadora calresta = new Calculadora(4,2);  //Se crea un objeto de la clase, para poder llamar al método
		int resultado = calresta.resta();    //llamo al metodo que quiero probar, que es resta. Para ello creo una variable
		assertEquals("no es correcto",2,resultado);  //Compara el valor que se espera y el valor que se obtiene. Si la prueba fallase apareceria el texto "no es correcto".
		
	}


	@Test
	public void testResta2() {
		Calculadora calresta2 = new Calculadora(4,2);   //Se crea un objeto de la clase, para poder llamar al método
		boolean resultado = calresta2.resta2();   //Llamo al método que quiero probar, en este caso resta2. Para ello creo una variable
		assertTrue("El número 2 es mayor que el número 1",resultado);  //Realizo asserTrue para validar que el resultado es verdadero.

		
	}
	
	@Test
	public void testDivide2() {
		Calculadora caldivide = new Calculadora(4,2);   //Se crea un objeto de la clase, para poder llamar al método
		int resultado = caldivide.divide2();   //Llamo al método que quiero probar, en este caso divide2. Para ello creo una variable
		assertNotNull(resultado);   //Realizo assertunotnull para validar que el resultado no sea null

		
	}

}
