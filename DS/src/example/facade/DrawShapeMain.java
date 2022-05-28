package example.facade;

public class DrawShapeMain {
	public static void main(String[] args) {
		Facade shapeMaker = new Facade();
		shapeMaker.circle();
		shapeMaker.rectangle();
		shapeMaker.square();
	}
	

}
