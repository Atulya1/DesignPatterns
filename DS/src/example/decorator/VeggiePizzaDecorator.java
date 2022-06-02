package example.decorator;

public class VeggiePizzaDecorator extends PizzaDecorator {
	
	VeggiePizzaDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public void bake() {
		super.bake();
		System.out.println("Adding veggie toppings");
	}

}
