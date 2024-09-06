package practice3;

public class Dolphin extends Animal {
	double echolocation;//frequency of ultrasonic waves 20-100 кГц
	int amountOfFish;
	{
		color = "blue";
	}
	public Dolphin() {
		
	}
	public Dolphin(String name, String color, int age, double echolocation, int amountOfFish) {
		super(name, color, age);
		this.echolocation = echolocation;
		this.amountOfFish = amountOfFish;
	}
	public String voice() {
		return "Squeals";
	}
	public void socialInteraction() {
		System.out.println("I can high five with my nose");
	}
	public void findFish() {
		if(Math.random() > 0.5) {
			amountOfFish++;
		}	
	}
	public void findFish(int num) {
		for(int i = 0; i < num; ++i) {
			findFish();
		}
	}
	public String eat() {
		return "Fish - nyam";
	}
	public String toString() {
		return super.toString() + ", num of fish caught: " + amountOfFish + "\nfrequency of ultrasonic waves: " + echolocation + "kHz";
	}

}
