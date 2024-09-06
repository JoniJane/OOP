package patricipation;

public abstract class Shape {
	int pos;
	Color color;
	public Shape() {
		
	}
	public Shape(Color color, int pos) {
		this.color = color;
		this.pos= pos;
	}
	abstract void draw();
	
}
