package com.telefonica.listasconjuntos;
import java.util.*;
public class ListasConjuntos 
{
	public static void muestra(Collection<String> c)
	{
		String lista[]={"uno","dos","tres","cuatro","tres"};
		
		for(int i=0;i<lista.length;i++)
			c.add(lista[i]);
		
		Iterator<String> it=c.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		System.out.println("-------------------------");
	}
	
	public static void main(String[] args)
	{
		Collection<String> c;
		c=new ArrayList<String>();
		muestra(c);
		c=new LinkedList<String>();
		muestra(c);
		c= new HashSet<String>();
		muestra(c);
		c= new TreeSet<String>();
		muestra(c);
	}
}
