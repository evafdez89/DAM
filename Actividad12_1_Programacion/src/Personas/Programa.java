package Personas;

public class Programa {

	public static void main(String[] args) {
		//Crear un objeto con el constructor sin parametros
		Personas persona1;  ////Declaramos una variable del tipo de la clase
		persona1 = new Personas(); // //Aquí ya hemos creado un objeto de Persona		
		
		//Crear un objeto con el constructor con parametros
		Personas persona2 = new Personas("Eva",28);

		System.out.println(persona1.getNombre());
		System.out.println(persona1.getEdad());
		System.out.println(persona2.getNombre());
		System.out.println(persona2.getEdad());

		//Para visualizarlo en una única linea:
//		String personas;	
//		personas = persona1.getNombre()+" "+ persona1.getEdad(); 
//		System.out.println(personas);
		
	}
	
}
