import java.util.HashMap;

/* Crea una clase colegio que almacene la nacionalidad de los alumnos de un colegio. La clase tendrá los siguientes métodos.
 * 
o	addAlumno(String nacionalidad)
añade la nacionalidad de un nuevo alumno

o	showAll()
Muestra las distintas nacionalidades y el número de alumnos que existen por nacionalidad.

o	pista:
for(String key: nacionalidades.keySet())
System.out.println(key + ” – ” + nacionalidades.get(key));

o	showNacionalidad(String nacionalidad)
Muestra la nacionalidad y el número de alumnos de esa nacionalidad

o	cuantos()
Muestra cuántas nacionalidades diferentes existen en el colegio.

o	borra()
Elimina los datos insertados.

 */
public class Colegio {
	private HashMap<String,Integer> alumno = new HashMap<String,Integer>(); //HashMap es una colección de objetos como los arrays pero sin orden. Ignora los repetidos
	 

	// metodo - añade la nacionalidad de un nuevo alumno
		public void addAlumno(String nac)
		{
			if (alumno.containsKey(nac))  //Comprueba si está la clave especificada. 7.3 pag 16

			{
				int i = alumno.get(nac);  //Da el valor asociado a una clave o null si no se encontró.
				alumno.remove(nac);   //Elimina el par clave-valor que corresponde a la clave.
				i++;
				alumno.put(nac, i);  //añade un nuevo par clave-valor al dicionario
			}
			else
			{
				alumno.put(nac,1);  //añade un nuevo par clave-valor al dicionario
			}
		}	

	}

}
