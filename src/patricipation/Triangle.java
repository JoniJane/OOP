package patricipation;

public class Triangle extends Shape {

	public Triangle () {
		
	}
	public Triangle(Color color, int pos) {
		super(color, pos);
	}
	public void draw() {
		System.out.print(" ".repeat(pos));
		if(color==Color.BLACK) {
			System.out.println("∆");
			System.out.println(" ".repeat(pos));
		}
		else {
			System.err.println("∆");
			System.err.println(" ".repeat(pos));
		}
	}

}
