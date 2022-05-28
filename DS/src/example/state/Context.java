package example.state;

public class Context {
	
	private Interface state;
	
	Context(){
		state = null;
	}

	public Interface getState() {
		return state;
	}

	public void setState(Interface state) {
		this.state = state;
	}
	

}
