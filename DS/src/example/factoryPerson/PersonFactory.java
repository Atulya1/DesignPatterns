package example.factoryPerson;

public class PersonFactory {
	
	public static Person createPerson(String gender) {
		Person p = null;
		if(gender.equals("Male")) {
			p = new Male();
		} else if(gender.equals("Female")) {
			p = new Female();
		}
		return p;
	}

}
