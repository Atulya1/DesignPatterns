package example.facade;

public class Facade {
	private Circle circle;
	private Rectangle rectangle;
	private Square square;
	
	Facade() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void circle() {
		circle.draw();
	}
	public void rectangle() {
		rectangle.draw();
	}
	public void square() {
		square.draw();
	}
	

}
