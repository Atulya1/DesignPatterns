package example.singleton;

public class TestSingleton {
	public static void main(String args[]) {
		DateUtil dateutil = DateUtil.getInstance();
		DateUtil dateutil2 = DateUtil.getInstance();
		System.out.println(dateutil.getInstance() == dateutil2.getInstance());
		
		DateUtilEagr dateUtilEagr = DateUtilEagr.getInstance();
		DateUtilEagr dateUtilEagr1 = DateUtilEagr.getInstance();
		System.out.println(dateUtilEagr == dateUtilEagr1);
		
		
		SingletonClass singletonClass = SingletonClass.getMethod();
		singletonClass.createDBConnection("10.10.10.9", "44");
		
	}
}
