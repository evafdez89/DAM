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
	   int numero;                                  // Declaración de variable.
	   Scanner sclector = new Scanner(System.in);  // Creando un nuevo objeto, clase scanner q ya existe en JAVA, con la funcionalidad de system-in.
	   
       System.out.println("Teclea un número");      //Solicita en pantalla que se introduzca un número.
       numero = sclector.nextInt();                //lee el número y lo almacena en "n".
       
     return numero;
	
	}
	
	public static String funciontunombre() 
	{
	   Scanner reader = new Scanner(System.in);
	   String nombre;	
	   
	   System.out.println("Teclea tu nombre");
	   nombre = reader.nextLine();                            //lee el número y lo almacena en "n".
		
	 return nombre;
	}

	public static void main(String[] args) 
	{
		int num;  //Almacenara los números introducidos   
		String texto;  //Almacena el texto a introducido.
        ArrayList lista = new ArrayList(); // Lista de tipo array que almacenara los valores introducidos.
		
		for(int i=1; i<=3 ; i++)
		{
			num = funcionnumeros();	//Llamo a la función "numeros".
            lista.add(num); // añadimos en cada iteración el valor a la lista creada.
            //lista.add(funcionnumeros()); //Es lo mismo que las lineas 43 y 44, pero realizado en una sola línea. Si se habilita, hay que deshabilitar la 43 y 44.
		}
		
		texto = funciontunombre();    //Llamo a la función "tunombre"
		lista.add(texto);             //almaceno el resultado de la función"tunombre" en la variable array "lista".
						
	 System.out.println ("Los números y texto introducidos son " + lista); //Muestro el resultado de la variable array "lista" que contiene los numeros y el texto.
    }
}	








//Una funcion siempre tiene que volver un valor aunque sea nulo.
//Cuando vea una Mayuscula, puede ser una clase.
//Clase. Lo q t permite es hacer un monton de objetos de un mismo patron. Es como un molde, que recoje las caracteristicas. Es uan churrera de hacer objetos. 
//http://puntocomnoesunlenguaje.blogspot.com.es/2012/07/arreglos-en-java-calcular-media.html  

