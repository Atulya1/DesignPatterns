package example.singleton;

public class SingletonClass {
	
	private static SingletonClass SingletonClassObject = new SingletonClass();
	
	private SingletonClass() {
		
	}
	
	public static synchronized SingletonClass getMethod() {
		return SingletonClassObject;
	}
	public static void createDBConnection(String ip, String port) {
		System.out.println("DB connection created with ip = "+ip+" port = "+port);
	}
}
