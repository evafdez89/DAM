// Se crea la clase abstracta animal
abstract class Animal {
	private String comunica;
	
	//Se crea el constructor sin parametros
	public Animal() {		
	}
	
	//Se crea el metodo abstracto comunicar
	public abstract void comunicar() ;
		
	//Se crean los métodos no abstractos, getter y setter.
	public String getComunica() {
		return comunica;
	}
	
	public void setComunica(String comunica) {
		this.comunica = comunica;
	} 
}
