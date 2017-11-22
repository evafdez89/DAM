import java.util.Scanner;

/*Ejercicio PLANTEADO. 
Desarrollar un programa en java que permita cargar por medio de arrays 3 nombres de empleados, sus edades y sus sueldos respectivos 
utilizando vectores paralelos. Luego de realizar la carga por teclado de todos los datos, mostrar los siguientes valores:

Imprimir la suma total de los sueldos.
Imprimir el nombre del empleado con mayor sueldo.
Imprimir el nombre del empleado más joven.
Imprimir la edad del empleado con menor sueldo.
Imprimir la suma de los sueldos del empleado más joven y del empleado más viejo.
*/

public class empleados {

	public static void main(String[] args) {
		
		//Definición de variables de carga de empleados
		Scanner teclado = new Scanner(System.in);  //Defino variable para entrada por teclado
		String[] nombre = new String[3];   // Defino variable array de tipo cadena
		int[] edad = new int[3];           // Defino variable array de tipo número
		int[] sueldo = new int[3];         // Defino variable array de tipo numeros con decimales
		
		//Variables para obtener los datos solicitados
		int suma = 0;                      // Variable de tipo entero para acumular la suma de los sueldos
	//	int mayorsueldo=sueldo[0];         // Variable que obtiene el valor del primer indice del array sueldo
		int posicionmayorsueldo=0;         // Indice del que mayor sueldo tiene
	//	int masjoven=edad[0];              // Indica el valor del mas joven
		int posicionmasjoven=0;            // Indice del mas joven
	//	int menorsueldo = sueldo[0];       // Indica el que menor sueldo tiene
		int posicionmenorsueldo = 0;       // Indice del menor sueldo
	//	int masviejo=edad[0];              // Indica el mas viejo
		int posicionmasviejo = 0;          // Indice del mas viejo
		int sumajovenyviejo = 0;           // Variable para sumar los sueldos del joven y el viejo
		
		
		//Bucle para cargar los datos de 3 empleados.
		for ( int i=0 ; i<nombre.length; i++) 
		{
		   System.out.print("Ingrese el nombre del empleado: ");
           nombre[i] = teclado.next();
           System.out.print("Ingrese la edad del empleado: ");
           edad[i] = teclado.nextInt();
           System.out.print("Ingrese el sueldo anual del empleado: ");
           sueldo[i] = teclado.nextInt();
	    }
        
	  //Imprimir suma total de los sueldos.
		System.out.print("El coste total de los sueldos es: ");
		int mayorsueldo=sueldo[0];
 	    for (int i=0; i< sueldo.length; i++){   //Bucle para obtener todos los sueldos y sumarlos
	    	suma = suma + sueldo[i];    // La suma de los sueldos se acumula en la variable suma
		}
 	      System.out.println(suma);  // Se imprime el resultado

 	      
      //Imprimir el nombre del empleado con mayor sueldo   . 
		System.out.println("El empleado que tiene mayor sueldo es: ");
 	    
		for(int cont=0;cont<sueldo.length;cont++) {  //Bucle para recorrer el array y comparar el sueldo
            if (sueldo[cont]>mayorsueldo) {   // Si el sueldo es mayor que el valor de la variable "mayor"...
                mayorsueldo=sueldo[cont];     //variable mayor obtiene el valor de la posición del array leido.
                posicionmayorsueldo=cont;              // la variable "posición" obtiene el valor del indice del array leido.
            }
        }
        System.out.println(nombre[posicionmayorsueldo]);   //Se muestra el indice del array nombre que corresponde a la variable posicion.

 	   
 
 	  //Imprimir el nombre del empleado mas joven. 
 	      System.out.println("El empleado mas joven es: ");
 	      int masjoven=edad[0];   
 	      for (int cont=0; cont<edad.length;cont++) {  //Bucle que recorre el array de edad
 	      	  if (edad[cont]<masjoven) {  // Si el indice leido es mas pequeño que el indice de la variable "masjoven"....
 	    	      masjoven = edad[cont];   //La variable "masjoven" se actualiza cogiendo el indice leido
 	    		  posicionmasjoven = cont;  // la variable "posicionmasjoven" se actualiza con la posición del indice leido
 	    	      
 	    	  }
 	      }
 	      System.out.println(nombre[posicionmasjoven]);   // Se muestra el indice que contiene "posicionmasjoven" del array nombre.
 	      
 	      
    //Imprimir la edad del empleado con menor sueldo. 
 	      System.out.print("El empleado con menor sueldo es: ");
 	      {
 	    	  int menorsueldo = sueldo[0]; 
 	    	  for(int cont=0; cont<sueldo.length;cont++) {	  
 	    		  if (sueldo[cont] < menorsueldo) {
 	     			  menorsueldo=sueldo[cont];
 	    			  posicionmenorsueldo = cont;
 	    		  }
 	    	  }
 	    	System.out.println(nombre[posicionmenorsueldo]);  
 	      }
 	      
 	  //Imprimir la suma de los sueldos del empleado más joven y del empleado más viejo. 
 	      System.out.println("La suma de sueldo del empleado mas joven y mas viejo es: ");
 	     int masviejo=edad[0];  
 	      for (int cont=0; cont<nombre.length; cont++) {  //bucle para obtener el mas viejo
 	       	  if (edad[cont]>masviejo) {
 	       		 masviejo=edad[cont];
 	    		 posicionmasviejo = cont;
 	    	  }
 	      }
 	      
 	      sumajovenyviejo = sueldo[posicionmasviejo] + sueldo[posicionmasjoven];  //Aprovecho la variable que ya teniamos con el mas joven
 	      System.out.println(sumajovenyviejo);
 	      teclado.close();
}
}