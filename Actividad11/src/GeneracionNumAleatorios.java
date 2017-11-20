/*Se trata de utilizando Random, se generen números aleatorios tantas veces como otro número aleatorio indique. 
 * Este número aleatorio hará de variable contadora de un bucle for.
 * Se aconseja limitar el número aleatorio de la variable contador a un valor que sea mayor que cero y menor que 20 (aproximadamente).
 * Los números aleatorios en cada iteración deben estar comprendidos en el rango de 18 a 65. 
 */
import java.util.Random;
import java.util.Scanner;

public class GeneracionNumAleatorios {

	public static void main(String[] args) {
		int numero; //Variable para los número aleatorios a generar.
		Scanner sclector = new Scanner(System.in);  // Creando un nuevo objeto.
        Random generadornumeros = new Random(); //Creamos un objeto de la clase Random
						
	    System.out.println("Dime cuantos números quieres:");      //Solicita en pantalla que se introduzca un número
	    numero = sclector.nextInt();                              //lee el número y lo almacena en "numero"
		
		for ( int i = 1 ; i <= numero; i++)  //Se hace un bucle para que se generen los numeros aleatorios solicitados
		{
			 System.out.println(generadornumeros.nextInt(65-18+1)+18);  //Crea numeros en 18-65 ambos incluidos.
	        
	    }
		
	}

}


