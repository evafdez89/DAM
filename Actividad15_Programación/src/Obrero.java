
public class Obrero extends Empleado {
	
	//Se definen los atributos
	private int trienios;
	private char turno; //  tendrá uno de los valores D, M, T o N, que suponen turnos de día, mañana, tarde o noche.
	
	//Se definen los constructores
	public Obrero () {                     //Constructor sin parametros
		this.trienios = 2;
		this.turno = 'N';
	}
	
	public Obrero(String nombre,byte edad, char sexo, String dni, boolean bCasado, String idpersonal, 
			float sueldo, int trienios, char turno) { //Constructor con todos los parametros de la subclase y de la clase que hereda
		super (nombre, edad, sexo, dni, bCasado, idpersonal, sueldo);  // Se incluye en "Super" los parametros de la clase padre.
		this.trienios = trienios;
		this.turno = turno;
	}
	
	//Se definen los métodos de la superclase, que son obligatorios pues son metodos no definidos en la superclase
	public float calcularAntiguedadMensual() {  //3% por trienio
		int porcentaje;
		porcentaje = 3*this.trienios/100;
		return porcentaje;
	}
	
	public float calcularComplementosMensuales() {  //Si el turno es de noche devuelve la centésima parte de multiplicar sueldo por 3. 
		if (this.turno == 'D') { //Si el turno es de noche
			int calculo = (int) (this.getsueldo()*3);  //Se multiplica el sueldo x 3.
			return calculo/100; //El resultado de la multiplicación de divide entre 100 para obtener la centesima parte.
		}
			else {
				return 0;  //Si el turno no es de noche se devuelve el valor 0.
			}	
	}
	
	public String toString() {    //Este metodo es sobreescrito
		return ("Objetos de la clase:" + this.getClass() + ". "+"El nombre del empleado es "+this.getNombre());
	}
}