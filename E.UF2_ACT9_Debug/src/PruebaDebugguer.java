
public class PruebaDebugguer {

	public static void main(String[] args) {
		ClaseParaDepurar clase =new ClaseParaDepurar();  // Se crea una clase
		int valor = clase.echaCuentas() ;   //se crea una variable y se le asigna el valor de la clase de la función echacuentas.
		System.out.println("sale " + valor);  //Pinta en pantalla el resultado de la variable.
	}

}

