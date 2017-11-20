import java.util.Random;
public class Programa {

	public static void main(String[] args) {
		Animal [] animales = new Animal[5];  // Se crea un array de objetos con 5 vectores, de la clase Animal.
		Random aleatorios =new Random();  //se genera un objeto de la clase random
				
		for (int i=0; i<animales.length; i++) {  //Bucle que recorre el array	
			boolean animal =  aleatorios.nextBoolean();      //Creo variable animal donde almaceno un valor "true" o "false" aleatorio mediante nextBoolean.
			 if (animal == true)    //Si el valor aleatorio es "True"
				 animales[i] = new Gato();        //Creo en el vector correspondiente del array un objeto de tipo gato
			 else   //Si el valor es "false"
				 animales[i] = new Perro();   //Creo en el vector correspondiente del array un objeto de tipo perro.
		} 
		//Visualizar los objetos que contiene el arrayObjetos con un bucle
		for (int i=0; i<animales.length ; i++) {			
			int vec = i;
			System.out.println("Se crea un objeto de clase " + animales[vec]);
		} 
		
		//Para averiguar de que tipo de objetos se trata cada uno con "instanceof".
		for (Animal ani: animales) {
			if  (ani instanceof Perro)
			System.out.println(ani.getClass() + " es un perro");
			else
				System.out.println(ani.getClass() + " es un gato");
		}
			
		//Visualizamos los objetos creados en el array mediante la función comunicar
		animales[0].comunicar();
		animales[1].comunicar();
		animales[2].comunicar();
		animales[3].comunicar();
		animales[4].comunicar();
		
		

	}

}
