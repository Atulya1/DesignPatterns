package example.singleton;

public class DateUtilEagr {
	private static DateUtilEagr instance = new DateUtilEagr();
	private DateUtilEagr() {
		
	}
	public static DateUtilEagr getInstance() {
		return instance;
	}
	
}
