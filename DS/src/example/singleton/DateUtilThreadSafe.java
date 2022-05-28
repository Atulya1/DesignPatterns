package example.singleton;

public class DateUtilThreadSafe {


	private static DateUtilThreadSafe instance;
	private DateUtilThreadSafe() {
	
	}
//	public static synchronized DateUtilThreadSafe getInstance() { // method level synchronized - thread safe
//		if(instance == null) {
//			instance = new DateUtilThreadSafe();
//		}
//	return instance;
	public static DateUtilThreadSafe getInstance() { // method level synchronized - thread safe
		synchronized(DateUtilThreadSafe.class) { // class level lock over instanciating the instance
			if(instance == null) {
				instance = new DateUtilThreadSafe();
			}
		}
	return instance;
	}

}