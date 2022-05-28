package example.factoryPerson;

public class Male implements Person {

	@Override
	public void wish(String msg) {
		System.out.println("Wishing male "+msg);
	}

}
