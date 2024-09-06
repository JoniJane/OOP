package patricipation;

public class Circle extends Shape {
	Circle() {
		
	}
	public Circle(Color color, int pos) {
		super(color, pos);
	}

	public void draw() {
		if(color==Color.BLACK) {
			System.out.println("o");
			System.out.println(" ".repeat(pos));
		}
		else {
			System.err.println("o");
			System.err.println(" ".repeat(pos));
		}
	}

}
