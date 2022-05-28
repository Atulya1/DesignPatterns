package example.state;

public class StatePatternMain {
	public static void main(String[] args) {
		Context context = new Context();
		Start start = new Start();
		start.doSomething(context);
		
		Stop stop = new Stop();
		stop.doSomething(context);
	}
}
