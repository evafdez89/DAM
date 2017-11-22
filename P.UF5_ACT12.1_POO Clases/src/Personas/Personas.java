package Personas;

public class Personas {

	private String nombre;
	private int edad;

	//Se crean los metodos getter:
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	//Se crean los metodos setter:
	public String setNombre() {
		return nombre;
	}
	
	public int setEdad() {
		return edad;
	}
	
	// Se crean los constructores
	public Personas() {
		this.nombre = "Anónimo";
		this.edad = 18;
	}
	
	public Personas(String Nombre, int Edad) {
		this.nombre = Nombre;	
		this.edad = Edad;
	}
	
}

