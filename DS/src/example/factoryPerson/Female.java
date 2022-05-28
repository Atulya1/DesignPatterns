package example.factoryPerson;

public class Female implements Person {
	
	@Override
	public void wish(String msg) {
		System.out.println("Wishing female "+msg);
	}

}
