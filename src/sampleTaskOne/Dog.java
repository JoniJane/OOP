package sampleTaskOne;

public class Dog {
	private String name;
	double velocity;
	
	public Dog() {
		
	}
	public Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public String move() {
		return name + " is moving";
	}
	public String move(double velocity) {
		return this.move() + " with the velocity " + velocity;
	}
	
}
