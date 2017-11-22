
public class Programa {
	
		public static void main(String[] args) {
		//Se llama al m�todo getInstance varias veces para comprobar su funcionamiento
		ConexionBBDD ref1 = ConexionBBDD.getInstance("org.apache.derby.jdbc.ClientDriver", "jbdc:derby://localhost:1527/tienda",
													"jose82", "dam12");  // Se crea una conexi�n 
		ConexionBBDD ref2 = ConexionBBDD.getInstance("driver2", "url2", "usuario2", "clave2");  //Se crea una segunda conexi�n
		ConexionBBDD ref3 = ConexionBBDD.getInstance("driver3", "url3", "usuario3", "clave3");  //Se crea una tercera conexion
		
		// Utilizamos el toString() para conocer los detalles de la conexi�n.
		System.out.println(ref1); 
		System.out.println(ref2); 
		System.out.println(ref3);	
		}
}
