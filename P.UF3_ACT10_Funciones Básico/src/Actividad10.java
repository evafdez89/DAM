/* Actividad 10. Intentando obtener el resultado con un bucle y un array
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Actividad10 
{
	public static Scanner reader = new Scanner(System.in);
	
	public static int funcionnumeros() 
	{
	   int numero;                                  // Declaraci�n de variable.
	   Scanner sclector = new Scanner(System.in);  // Creando un nuevo objeto, clase scanner q ya existe en JAVA, con la funcionalidad de system-in.
	   
       System.out.println("Teclea un n�mero");      //Solicita en pantalla que se introduzca un n�mero.
       numero = sclector.nextInt();                //lee el n�mero y lo almacena en "n".
       
     return numero;
	
	}
	
	public static String funciontunombre() 
	{
	   Scanner reader = new Scanner(System.in);
	   String nombre;	
	   
	   System.out.println("Teclea tu nombre");
	   nombre = reader.nextLine();                            //lee el n�mero y lo almacena en "n".
		
	 return nombre;
	}

	public static void main(String[] args) 
	{
		int num;  //Almacenara los n�meros introducidos   
		String texto;  //Almacena el texto a introducido.
        ArrayList lista = new ArrayList(); // Lista de tipo array que almacenara los valores introducidos.
		
		for(int i=1; i<=3 ; i++)
		{
			num = funcionnumeros();	//Llamo a la funci�n "numeros".
            lista.add(num); // a�adimos en cada iteraci�n el valor a la lista creada.
            //lista.add(funcionnumeros()); //Es lo mismo que las lineas 43 y 44, pero realizado en una sola l�nea. Si se habilita, hay que deshabilitar la 43 y 44.
		}
		
		texto = funciontunombre();    //Llamo a la funci�n "tunombre"
		lista.add(texto);             //almaceno el resultado de la funci�n"tunombre" en la variable array "lista".
						
	 System.out.println ("Los n�meros y texto introducidos son " + lista); //Muestro el resultado de la variable array "lista" que contiene los numeros y el texto.
    }
}	








//Una funcion siempre tiene que volver un valor aunque sea nulo.
//Cuando vea una Mayuscula, puede ser una clase.
//Clase. Lo q t permite es hacer un monton de objetos de un mismo patron. Es como un molde, que recoje las caracteristicas. Es uan churrera de hacer objetos. 
//http://puntocomnoesunlenguaje.blogspot.com.es/2012/07/arreglos-en-java-calcular-media.html  

