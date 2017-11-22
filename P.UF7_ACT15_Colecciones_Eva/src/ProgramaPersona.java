import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

/*
 * Por simplificar, se utilizarán los constructores sin parámetros. 
 * Se crearan objetos Persona y se irán añadiendo al ArrayList. 
 * El objeto creado será Persona, Obrero o Técnico dependiendo de un número obtenido de forma aleatoria, 
 *    por ejemplo si es 0 será Persona, si es 1 será Obrero y si es 2 Técnico.
 * El ArrayList tendrá un número aleatorio de elementos que no excederá de 20.
 * El programa después de añadir los objetos Persona (recordad Obrero y Técnico son Persona, porque son Empleado), 
 *  recorrerá el ArrayList, y mostrará la información de los objetos que contiene.
*/

public class ProgramaPersona {

	public static void main(String[] args) {

		ArrayList <Persona> Personas = new ArrayList <Persona> ();  //Se crea un arraylist de la clase Personas, limitado a 20 elementos.
	//	ArrayList <Persona> Personas = new ArrayList <Persona> (20);   Arraylist limitado a 20
		Random aleatorios =new Random();  //se genera un objeto de la clase random
		
		int aleatorio = aleatorios.nextInt(20 - 1) + 1; // Se genera un número entre 1 y 20 aleatoriamente, sera el máximo de elementos de la lista.
		System.out.println("El número de objetos a crear es: "+ aleatorio);
	
		System.out.println(".......Creación e Inclusión de Objetos .........");

		for(int a=0;a<aleatorio;a++) {  //Bucle que recorre el ArrayList creando e incluyendo objetos
			int numaleatorio =  aleatorios.nextInt(3 - 0)+ 0;  //Variable donde almaceno un numero aleatorio entre el 0 y el 2.
			System.out.println("El numero aleatorio generado es: " + numaleatorio);  //Muestra el número aleatorio generado en pantalla
			if (numaleatorio == 0)             //Si el número  generado es 0..
				Personas.add(new Persona());  //Se crea un objeto de tipo persona dentro del arraylist Personas.
			else if (numaleatorio == 1)       //Si el numero generado es 1..
				Personas.add(new Obrero());  //Se crea un objeto de tipo obrero dentro del arraylist Personas
			else                             //Si el numero generado no es 0 ni 1 ....
				Personas.add(new Tecnico());  //Se crea un objeto de tipo tecnico dentro del arraylist Personas.
				
			
			System.out.println("Creado y Añadido: " + Personas.get(a)); //Muestra el objeto creado indicando
			System.out.println("-------------------------------------------");
		}
				
	System.out.println(".......Visualizar los objetos que contiene la lista con listIterator......... .........");
			
	//Visualizar los objetos que contiene el la lista  con lisIterator
		ListIterator<Persona> lista = Personas.listIterator();
			while (lista.hasNext()) {
				System.out.println(lista.next());				
			}
	
	System.out.println(".......Visualizar los objetos que contiene la lista con for each......... .........");
			
	//Visualizar los objetos que contiene la lista con for each
		for (Persona elemento: Personas)
			System.out.println(elemento);
			
	//Recorrer el array para contabilizar cuantos objetos hay de cada tipo de clase
	//		for (int i=0; 1<Personas.size();i++);
			
		
	}
}
