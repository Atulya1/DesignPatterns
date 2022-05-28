package example.factoryPerson;

public class PersonStore {
	Person p = null;
	public Person createPerson(String gender) {
		p = PersonFactory.createPerson(gender);
		return p;
	}
	public void wish(String msg) {
		p.wish(msg);
	}

}
