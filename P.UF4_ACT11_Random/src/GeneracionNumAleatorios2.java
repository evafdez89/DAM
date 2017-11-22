/*Se trata de utilizando Random, se generen n�meros aleatorios tantas veces como otro n�mero aleatorio indique. 
 * Este n�mero aleatorio har� de variable contadora de un bucle for.
 * Se aconseja limitar el n�mero aleatorio de la variable contador a un valor que sea mayor que cero y menor que 20 (aproximadamente).
 * Los n�meros aleatorios en cada iteraci�n deben estar comprendidos en el rango de 18 a 65. 
 */
import java.util.Random;
import java.util.Scanner;

public class GeneracionNumAleatorios2 
{
	public static void main(String[] args) 
	{
		int numero; //Variable donde se almacena el numero aleatorio generado
        Random generadornumeros = new Random(); //Creamos un objeto de la clase Random		

        numero = generadornumeros.nextInt(20)+1;  //Se asigna a la variable "n�mero", un numero aleatorio entre 1 y 20.
		
        for ( int i = 1 ; i <= numero; i++)  //Se hace un bucle para que se generen los numeros aleatorios solicitados
		  {
			System.out.println(generadornumeros.nextInt(65-18+1)+18);  //Crea numeros en 18-65 ambos incluidos y los muestra en pantalla
			
	      }	     	    
        System.out.println("Hemos iterado " + numero + " veces");
	 }
	
}

