
public class Persona {

	private String nombre;
	private byte edad;
	private char sexo;  
	private String dni;
	private boolean bCasado;

	// Constructores
	public Persona() {   //Este constructor es sin parametros e inicializa las variables con valores ya dados.
		this.nombre = "Anónimo";
		this.edad = 18;
		this.sexo = 'F';
		this.dni = "52010040L";
		this.bCasado = true;			
	}
	
	public Persona(String nombre, byte edad, char sexo, String dni, boolean bCasado) {  //Este constructor debe contener todos los parametros
		this.nombre = nombre;	
		this.edad = edad;
		this.sexo = sexo;
		this.dni = dni;
		this.bCasado = bCasado;
	}

/*	public Persona(String nombre, byte edad, char sexo, String dni, boolean bCasado, String idpersonal, float sueldo) {  //me obliga a crearlo ¿¿??
		
	} */


	//método toString, lo sobreescribo
	public String toString() {
		return ("Objetos de la clase:" + this.getClass() + ". " +"El nombre del empleado es "+this.getNombre());

	} 

	//método equals para saber si dos objetos tienen el mismo valor en la variable bCasado. Se sobreescribe
	public boolean equals (Persona Persona) {
		if (this.bCasado == Persona.bCasado)
			return (true);
		else
			return (false);
	}
	
	
	//Función Pintar
	public void pintar() {
		System.out.println("La persona con nombre " +this.nombre + " de edad "+ this.edad +
				" , de sexo "+ this.sexo + " y DNI: "+ this.dni +" , tiene como estado civil: "+ this.bCasado);
	}
			
	
	//Se crean los metodos getter:
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public char getsexo() {
		return sexo;
	}
	
	public String getdni() {
		return dni;
	}
	
	public boolean getbCasado() {
		return bCasado;
	}

	
	//Se crean los metodos setter:
	public String setNombre() {
		return nombre;
	}
	
	public int setEdad() {
		return edad;
	}
	
	public char setsexo() {
		return sexo;
	}
	
	public String setdni() {
		return dni;
	}

	public boolean setbCasado() {
		return bCasado;
	}
	
}
	
