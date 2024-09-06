package patricipation;

import java.util.Vector;

public class ShapeTest {

	public static void main(String[] args) {
		Vector<Shape> shapes = new Vector<Shape>();
		shapes.add(new Circle(Color.RED, 3));
		shapes.add(new Circle(Color.BLACK, 13));
		shapes.add(new Rectangle(Color.BLACK, 12));
		shapes.add(new Rectangle(Color.RED, 2));
		shapes.add(new Circle(Color.RED, 5));
		shapes.add(new Triangle(Color.BLACK, 6));
		shapes.add(new Triangle(Color.RED, 9));
		
		
		for(Shape s: shapes) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			s.draw();
		}
		//System.out.println("");
	}

}
