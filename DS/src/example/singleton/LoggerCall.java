package example.singleton;

public class LoggerCall {
	public static void main(String args[]) {
		Logger logger = Logger.getInstance();
		System.out.println(logger.displayLog("This log"));
	}

}
