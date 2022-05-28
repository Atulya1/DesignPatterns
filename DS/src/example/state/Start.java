package example.state;

public class Start implements Interface {
	public void doSomething(Context context) {
		 System.out.println("Game has started");
		 context.setState(this);
	}
}
