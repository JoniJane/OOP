package patricipation;

public class Rectangle extends Shape {

	public Rectangle () {
		
	}
	public Rectangle(Color color, int pos) {
		super(color, pos);
	}
	public void draw() {
		if(color==Color.BLACK) {
			System.out.println("▭");
			System.out.println(" ".repeat(pos));
		}
		else {
			System.err.println("▭");
			System.err.println(" ".repeat(pos));
		}
	}

}
