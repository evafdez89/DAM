import java.util.Random;

public class PruebaPunto {

	public static void main(String[] args) {		
		
		//Se crean los puntos con los constructores
		Punto punto1= new Punto(1,2);   //Constructor con parámetros
		Punto punto2 = new Punto();     //Constructor sin parámetros
		Punto punto3 = new Punto(punto1); //Constructor que recibe los parametros de un objeto ya existente.
		
		
		Punto [] arrayObjetos = new Punto[5];  //Se crea el array de la clase Punto, con 5 vectores.	
		Random aleatorios =new Random();  //se genera un objeto de la clase random
		
		for (int i=0; i<arrayObjetos.length; i++) {   		// Bucle que recorre el array.

			int num1 =  aleatorios.nextInt(100 - 1)+1;      //Creo variable num1 donde almaceno un numero aleatorio. los numeros aleatorios sean de 1 a 100. (hasta - desde) + desde
			int num2 = aleatorios. nextInt(100 - 1)+1;      //Creo variable num2 donde almaceno un numero aleatorio. los numeros aleatorios sean de 1 a 100. (hasta - desde) + desde
			arrayObjetos[i] = new Punto(num1, num2);        //En la posición "i" del array se crea un objeto Punto con los valores de num1 y num2

		}
		
		//Visualizar los objetos que contiene el arrayObjetos con un bucle
		for (int i=0; i<arrayObjetos.length ; i++) {			
			int vec = i;
			System.out.println(arrayObjetos[vec]);
		} 
		
		//Visualizar los objetos que contiene el arrayObjetos sin bucle, uno a uno.
		System.out.println(arrayObjetos[0]);
		System.out.println(arrayObjetos[1]);
		System.out.println(arrayObjetos[2]);
		System.out.println(arrayObjetos[3]);
		System.out.println(arrayObjetos[4]); 

		
		//Visualizar los puntos creados con la función pintar
		punto1.pintar();
		punto2.pintar();
		punto3.pintar();
		
		//Visualizar los puntos creados con la función toString
		System.out.println(punto1);
		System.out.println(punto2);
		System.out.println(punto3);
		System.out.println("Las coordenadas son: " + punto1); 

		//Comparación con el método sobreescrito equals
		if (punto1.equals(punto2))
			System.out.println("Tienen el mismo eje X");
			else
				System.out.println("No tienen el mismo eje X");	
		
		//Visualizar por cada objeto un parámetro usando get.
		System.out.println(punto1.getX());
		System.out.println(punto1.getY());
		System.out.println(punto2.getX());
		System.out.println(punto2.getY()); 			


	}

}
