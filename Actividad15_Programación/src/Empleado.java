
abstract class Empleado extends Persona{  // Se hace una subclase de la clase Persona, y se convierte a abstracta.
		private String idpersonal;
		private float sueldo;
		
		//Constructores
		public Empleado() {   //Constructor sin parametros, con valores predefinidos.
			this.idpersonal="001";
			this.sueldo=1000;
			}
		
		public Empleado(String nombre, byte edad, char sexo, String dni, boolean bCasado, String idpersonal, float sueldo) { //Constructor con todos los parametros, de la clase principal y la subclase. 
			super (nombre, edad, sexo, dni, bCasado);  // Se incluye en "Super" los parametros de la clase padre.
			this.idpersonal = idpersonal;
			this.sueldo = sueldo;
		}

		
		public Empleado (String idpersonal, float sueldo) {  //Constructor con los parametros de la subclase
			this.idpersonal = idpersonal;
			this.sueldo= sueldo;
		}
	
		//Se incluyen los metodos solicitados en la Actividad15 punto2. Hay que incluir al inicio de ambos metodos la palabra abstract, pues seran metodos abstractos
		abstract float calcularAntiguedadMensual();
		abstract float calcularComplementosMensuales();
		
		
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
			return ("Objetos de la clase:" + this.getClass() + ". " +"El nombre del empleado es. "+this.getNombre());

		} 
		
	//Función pintar - Se sobreescribe
		public void pintar() {
			System.out.println("Persona con nombre " + this.setNombre() + " de edad "+ this.setEdad() + " , de sexo "+ this.setsexo() + " y DNI: " 
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
		