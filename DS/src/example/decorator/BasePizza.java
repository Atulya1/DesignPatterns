package example.decorator;

// concrete class
public class BasePizza implements Pizza{

	@Override
	public void bake() {
		System.out.println("Baking a base pizza");	
	}

}
