package example.factory;

public class VegPizza implements PizzaInterface{
	public void prepare() {
		System.out.println("Prepare Veg Pizza");
	}
	public void bake() {
		System.out.println("Bake Veg Pizza");
	}
	public void cut() {
		System.out.println("Cut Veg Pizza");
	}
	

}
