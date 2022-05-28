package example.factory;

public class PizzaStore {
	public static void main(String args[]) {
	PizzaInterface p = PizzaFactory.order("nonveg");
	p.prepare();
	p.bake();
	p.cut();
	}
}
 