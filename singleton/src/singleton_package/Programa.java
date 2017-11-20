package singleton_package;

public class Programa {
	
		public static void main(String[] args) {
		//Se llama al método getInstance varias veces para comprobar su funcionamiento
		Singleton ref1_singleton = Singleton.getInstance();
		Singleton ref2_singleton = Singleton.getInstance();
		Singleton ref3_singleton = Singleton.getInstance();
		
		//Verificamos el contenido de los objetos creados
		System.out.println(ref1_singleton);
		System.out.println(ref2_singleton);
		System.out.println(ref3_singleton);
		
		// Verificamos que son el mismo objeto y no se han creado adicionales nuevos. 
		System.out.println(ref1_singleton.equals(ref2_singleton));
		System.out.println(ref1_singleton.equals(ref3_singleton));
		System.out.println(ref2_singleton.equals(ref3_singleton));
	}
}
