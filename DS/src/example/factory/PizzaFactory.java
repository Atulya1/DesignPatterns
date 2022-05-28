package example.factory;

public class PizzaFactory {

	public static PizzaInterface order(String type) {
		PizzaInterface p = null;
		if(type.equals("veg")) {
			p = new VegPizza();
		} else if(type.equals("nonveg")) {
			p = new NonVegPizza();
		}
		return p;
	}
}
