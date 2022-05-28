package example.factory;

public class NonVegPizza implements PizzaInterface{
	
	public void prepare() {
		System.out.println("Prepare NonVeg Pizza");
	}
	public void bake() {
		System.out.println("Bake NonVeg Pizza");
	}
	public void cut() {
		System.out.println("Cut NonVeg Pizza");
	}
	

}
