package example.singleton;

public class Logger implements Cloneable{
	
	private static Logger instance;
	private Logger() {
		
	}
	
	public static Logger getInstance() {
		synchronized(Logger.class) { 
			if(instance == null) {
				instance = new Logger();
			}
		}
	return instance;
	}
	
	public static String displayLog(String log) {
		return log;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
