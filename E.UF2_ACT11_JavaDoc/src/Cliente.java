/**
 * Actividad 11 de Entornos de Desarrollo
 * 
 * @author Eva Fernandez Fernández
 * @version 1.0.0
 *@
 */
public class Cliente extends Object {
/**
* Parámetros: Se declaran las variables a utilizar por cada cliente.
* @param codigo  
* @param nombre  
* @param apellido
* @param email 
* @param telefono 
* @param nuevo
* @param cifraVentas 
* 
*/
	public int codigo;
	public String nombre;
	public String apellido;
	public String email;
	public long telefono;
	public boolean nuevo;
	public double cifraVentas;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}
/**
 * Representa un cliente.
 * @param codigo 
 * @param nombre
 * @param email  
 */
	public Cliente(int codigo, String nombre, String email) {
		super(); //Object()
		this.codigo = codigo;
		this.nombre = nombre;
		this.email = email;
	}
/**
 * Se dan de alta nuevos clientes, pasando por cada cliente los datos de los parámetros.
 * @param codigo 
 * @param nombre 
 * @param email 
 * @param telefono
 * @param nuevo
 * @param cifraVentas 
 */
	public Cliente (int codigo, String nombre, String email, long telefono, boolean nuevo, double cifraVentas) {
		
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.nuevo = nuevo;
		this.cifraVentas = cifraVentas;
	}

/**
 * devuelve el código del cliente y su nombre.Se hace uso del metodo mostrarDatos.
 * @return mostrarDatos 
 */
	//acciones -> metodos
	public void mostrarDatos() {
		System.out.println("Codigo: " + codigo + " Nombre: "+ nombre + " ... ");
	}

/**
 * devuelve el parametro cifraVentas del cliente. Se hace uso del método verCifraVentas.
 * @return verCifraVentas 
 */
	public double verCifraVentas() {
		return cifraVentas;
	}
/**
 * modifica el teléfono del cliente por uno distinto. Se hace uso del método cambiarTelefono
 * @param nuevoTelefono 
 */
	public void cambiarTelefono(long nuevoTelefono) {
		telefono = nuevoTelefono;
	}
}
