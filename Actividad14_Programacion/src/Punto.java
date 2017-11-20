public class Punto {
	
	//Se crean dos variables int
	private int x;
	private int y;
	
	//metodos getter:
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	//metodos setter:
	public int setX() {
		return y;
	}
	
	public int setY() {
		return y;
	}	
		
	//Constructores
	public Punto() {   //Constructor sin parametros
		this.x=10;
		this.y=20;
	}
	
	
	public Punto(int x, int y) {   //Constructor con los parámetros
		this.x=x;
		this.y=y;
	} 
	
	public Punto(Punto z) {         //Constructor con otro punto que ya exista. La z es un parametro nuevo incluido para hacerlo posible.
		this.y= z.y;
		this.x=	z.x;
	
	} 
	
	
	//Función pintar	
	public void pintar() {
		System.out.println("Las coordenadas del punto son: " + this.x + " y "+ this.y);
	}
	
	//método toString. Lo sobreescribo
		public String toString() {
			return ("las coordenadas son en eje x: " + this.x + " y en eje y:  " + this.y);
		} 
		
	
	//método equals. Lo sobreescribo, y hace una comparación para conocer si el paametro X es el mismo en ambos puntos.
		public boolean equals(Punto Punto) {
			if (this.x == Punto.x)
				return (true);
			else
				return (false);

        }
	
}



/*Metodos getter y setter creados de forma automatica desde el menu Source 
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	} 
}
*/