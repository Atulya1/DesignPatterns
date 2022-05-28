package example.state;

public class Stop implements Interface {
	
	public void doSomething(Context context) {
		 System.out.println("Game has stopped");
		 context.setState(this);
	}

}
