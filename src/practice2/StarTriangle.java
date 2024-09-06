package practice2;

public class StarTriangle {
	private int width;
	private String newLine;
	
	StarTriangle(int width) {
		this.width = width;
		this.newLine = "";
	}
	public String toString() {
		for(int i = 0; i < width; i++) {
			for(int j = 0; j <= i; j++) {
				newLine += "[*]";
			}
			newLine += "\n";
		}
		return newLine;
	}
}
	


