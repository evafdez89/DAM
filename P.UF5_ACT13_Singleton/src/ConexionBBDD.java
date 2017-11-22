
public class ConexionBBDD {
	    private static String driver; // org.apache.derby.jdbc.ClientDriver	    
	    private static String url; // jbdc:derby://localhost:1527/tienda
	    private static String usuario; // juanaadmin
	    private static String clave; // rt789ac
	    private static ConexionBBDD instance = null;   //Variable est�tica que almacenar� la conexi�n y la inicializaremos a null

	    // Constructor privado, solo se puede utilizar por un metodo publico de la clase, si no hay ninguna instancia creada de dicha clase.
	    private ConexionBBDD(String driver, String url, String usuario, String clave) {
	        this.driver = driver;
	        this.url = url;
	        this.usuario = usuario;
	        this.clave = clave;
	    }

	    //Se crea un m�todo Static, para que cree el objeto por primera vez, una vez creado ya no se podran crear mas objetos.
	    public static ConexionBBDD getInstance(String driver, String url, String usuario, String clave) {   
	        if (instance == null){
	            instance = new ConexionBBDD(driver, url, usuario, clave);
	            System.out.println("Conexi�n creada con �xito"); // Mensaje que nos ayuda a debuggear el comportamiento
	        }
	        else{
	            System.out.println("No se puede iniciar la conexi�n porque ya existe otra conexi�n activa."); // Mensaje que nos ayuda a
	            																							  // debuggear el comportamiento
	            }
	        
	        return instance;
	    }

		@Override
		public String toString() {
			return "ConexionBBDD: DRIVER: " + driver +" URL: "+ url + "USUARIO " + usuario + " CLAVE: " + clave ;
		}
	    
	}


