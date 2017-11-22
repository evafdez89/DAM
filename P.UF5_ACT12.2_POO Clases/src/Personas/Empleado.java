package Personas;

public class Empleado extends Persona{  // Se hace una subclase de la clase Persona
		private String idpersonal;
		private float sueldo;
		
		//Constructores
		public Empleado() {   //Constructor sin parametros, con valores predefinidos.
			this.idpersonal="001";
			this.sueldo=1000;
			}
		
		public Empleado(String idpersonal, float sueldo, String nombre,
				byte edad, char sexo, String dni, boolean bCasado ) { //Constructor con todos los parametros, de la clase principal y la subclase. 
			super (nombre, edad, sexo, dni, bCasado);  // Se incluye en "Super" los parametros de la clase padre.
			this.idpersonal = idpersonal;
			this.sueldo = sueldo;
		}
		
		public Empleado (String idpersonal, float sueldo) {  //Constructor con los parametros de la subclase
			this.idpersonal = idpersonal;
			this.sueldo= sueldo;
		}
		
	// Los metodos get y set
		public String getidpersonal() {
			return idpersonal;
		}
		
		public float getsueldo() {
			return sueldo;
		}
		
		public String setidpersonal() {
			return idpersonal;
		}
		
		public float setsueldo() {
			return sueldo;
		}

		
	//Método toString - Se sobreescribe
		public String toString() {
			return ("Persona con nombre " + this.setNombre() + " de " + this.setEdad() + " años, de sexo  "
					+ this.setsexo() + " y DNI " + this.setdni() + "." + " Es el empleado con ID: " + this.idpersonal 
					+", y sueldo de: " +  this.sueldo +"€." );
		} 
		
	//Función pintar - Se sobreescribe
		public void pintar() {
			System.out.println("La persona con nombre " + this.setNombre() + " de edad "+ this.setEdad() + " , de sexo "+ this.setsexo() + " y DNI: " 
		+ this.setdni() + " , tiene como estado civil: "+ this.setbCasado() + ". Es el empleado con ID: " +
		this.idpersonal +", y tiene un sueldo de: " + this.sueldo + "€.");
		}
		
	
/*		//método equals para saber si dos objetos, uno de persona y otro de empleado tienen el mismo valor en la variable sueldo. Se sobreescribe
		public boolean equals (sueldo Empleado) {
			if (Empleado.getsueldo == Persona.sueldo)
				return (true);
			else
				return (false); 
		}	*/
}	
		