/* Ejercicio realizado en clase. Sali a la pizarra para hacerlo yo misma. 
 * Lo que hace es introducir 5 notas, y como resultado final te indica 
 * cuantos han aprobado y cuantos han suspendido.
 */

import java.util.Scanner;
public class AprobadosYSuspensos {
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);  //Definimos la variable teclado
        int x;  //Variable que sirve de contador
        int nota; 
        int aprobado = 0;
        int suspenso = 0;
        x = 0;    
        while (x<5)       //Mientras x sea menor de 5..
        {	
        	System.out.println("Ingrese la nota");
        	nota = teclado.nextInt();  //Almacena lo tecleado
        	 if (nota >= 5)
        	    aprobado = aprobado +1;
        	 else
        	     suspenso = suspenso +1;
        	x = x+1;  //Contador 	
        }
        System.out.println(aprobado);
        System.out.println(suspenso);
        teclado.close();
	}

}


