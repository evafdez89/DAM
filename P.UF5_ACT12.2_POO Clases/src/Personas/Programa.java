package Personas;

public class Programa {

	public static void main(String[] args) {
		//Se crean dos objetos persona con los dos constructores creados.
		Persona persona1 = new Persona(); 
		Persona persona2 = new Persona("Eva", (byte) 28 , 'F', "52010045L", false);

		//Se crean tres objetos de la clase empleados, utilizando cada uno de los constructores
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado("002", 1500F, "Eva", (byte) 33, 'M', "3467584M" ,true);
		Empleado empleado3 = new Empleado("123",1500F);
		
		
		//Visualiza los objetos creados con función System.out.println y los metodos get.
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getEdad());
		
		System.out.println(persona2.getNombre());
		System.out.println(persona2.getEdad());
		
		System.out.println(empleado1.getNombre());
		System.out.println(empleado1.getEdad());
		
		System.out.println(empleado2.getNombre());
		System.out.println(empleado2.getEdad());
		
		System.out.println(empleado3.getEdad());
		System.out.println(empleado3.getNombre());

		
		//Visualiza los datos de los objetos creados haciendo uso de toString
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(empleado1);
		System.out.println(empleado2);
		System.out.println(empleado3);
		
		//Visualiza los datos de los objetos creados haciendo uso de la función pintar
		persona1.pintar();
		persona2.pintar();
		empleado1.pintar();
		empleado2.pintar();
		empleado3.pintar();

		
		
		//Se hace uso de equals para realizar una comparación sobre un parametro entre dos objetos persona
		if (persona1.equals(persona2))
			System.out.println("Las dos personas tienen el mismo estado civil");
			else
				System.out.println("Las dos personas no tienen el mismo estado civil");	
		
		//Se hace uso de equals para realizar una comparación sobre un parametro entre un objeto de la clase persona y otro de la clase empleado
		if (persona1.equals(empleado2.getbCasado()))
			System.out.println("Las dos personas tienen el mismo estado civil");
			else
				System.out.println("Las dos personas no tienen el mismo estado civil");	
		
		
        //Se hace uso de equals para realizar una comparación sobre un parametro entre un objeto persona y un objeto empleado	
		System.out.println ("¿El nombre de las dos personas son iguales?" + persona2.getNombre().equals(empleado2.getNombre() ) );  //Compara el valor de un parametro en común entre objetos de distinta clase
		


		//Para visualizarlo en una única linea:
//		String personas;	
//		personas = persona1.getNombre()+" "+ persona1.getEdad(); 
//		System.out.println(personas);

		
	}
	
}
