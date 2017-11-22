/*
 * Esta clase crea un array de 100 números. Lo rellena con los números del 0 al 99.
 * Después, lo recorre y va sumando cada uno de sus elementos, almacenando dicha suma en la variable “suma”.
 */

public class ClaseParaDepurar {
    
	private int suma;
	private int[] lista;
	

	public ClaseParaDepurar() {
		  System.out.println("Construyendo clase");  //Muestra en pantalla un texto
	}
	
	public int echaCuentas() {
		lista = new int[100];  //Se crea una variable tipo array de 100 numeros enteros, que se llama lista
		for (int i= 0; i< lista.length; i++) {  //se hace un bucle para rellenar la lista hasta su totalidad.
			lista[i] = i;
		}
		suma = 0;
		//for (int valor : lista) {  // se hace otro bucle donde se recorren los valores de la lista
		for (int valor=1;valor<lista.length;valor++) {  //El mismo for pero sin abreviar
			 suma += valor;   // cada valor encontrado se suma, aumentando así la variable suma.  
			//suma = suma + valor; // el mismo pero sin abreviar
		}
		return suma;   //devuelve la suma de los 100 numeros almacenados. Deberia ser de 5000.
	}
}