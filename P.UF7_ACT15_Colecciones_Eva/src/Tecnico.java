
public class Tecnico extends Empleado {
	//Se crean los atributos
	private float complemento;
	private byte quinquenios;

	//Se crean los constructores
	public Tecnico() {   			//Constructor sin parametros
		this.complemento = complemento;
		this.quinquenios = quinquenios;
	}
	
	public Tecnico(String nombre,byte edad, char sexo, String dni, boolean bCasado,  //Constructor con parametros
			String idpersonal, float sueldo, float complemento, byte quinquenios) {
		super (nombre, edad, sexo, dni, bCasado,idpersonal, sueldo);
		this.complemento = complemento;
		this.quinquenios = quinquenios;
	}
	
	//Se definen los métodos de la superclase, que sonobligatorios pues son metodos no definidos en la superclase
	public float calcularAntiguedadMensual() {  //5% por quinquenio
		int porcentaje;
		porcentaje = 5*this.quinquenios/100;
		return porcentaje;
	}
	
	public float calcularComplementosMensuales() {  //La centésima parte de multiplicar sueldo por complemento. La centesima parte de un numero es el resultado de dividir un numero entre 100
		int calculo = (int) (this.getsueldo()*this.complemento);  //Se multiplica el sueldo por el complemento y se almacena en una variable.
		return calculo/100;        //El resultado del anterior calculo se divide entre 100 para obtener la centesima parte.
	}
	
	public String toString() {    //Este metodo es sobreescrito
		return ("Objetos de la clase:" + this.getClass() + ". " +"El nombre del empleado es "+this.getNombre());
	}
}
