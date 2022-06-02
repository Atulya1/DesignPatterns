package example.decorator;

public class Test {
	
	public static void main(String args[]) {
		Pizza pizza1 = new BasePizza();
		pizza1.bake();
		System.out.println("--------------------");
		
		
		Pizza pizza2 = new VeggiePizzaDecorator(new BasePizza());
		pizza2.bake();
		System.out.println("--------------------");
		
		
		Pizza pizza3 = new CheesePizzaDecorator(new VeggiePizzaDecorator(new BasePizza()));
		pizza3.bake();
	}

}
