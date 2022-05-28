package example.factoryPerson;

public class Test {
	
	public static void main(String args[]) {
		PersonStore p = new PersonStore();
		p.createPerson("Male");
		p.wish("Happy New Year");
	}

}
