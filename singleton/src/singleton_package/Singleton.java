package singleton_package;

public class Singleton {
    private static String driver; // org.apache.derby.jdbc.ClientDriver	    
    private static String url; // jbdc:derby://localhost:1527/tienda
    private static String usuario; // juanaadmin
    private static String clave; // rt789ac
  //  private static ConexionBBDD instance = null;
    
    protected Singleton(String driver, String url, String usuario, String clave) {
        this.driver = driver;
        this.url = url;
        this.usuario = usuario;
        this.clave = clave;
    }
    
    private static class SingletonHolder{
    	private final static Singleton INSTANCE = new Singleton(driver, url, usuario, clave);
    }
    
    public static Singleton getInstance() {
    	return SingletonHolder.INSTANCE;
    }

	@Override
	public String toString() {
		return "Singleton [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
    
    
}
