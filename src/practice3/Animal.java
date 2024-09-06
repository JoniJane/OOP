package practice3;

public abstract class Animal {
	String name;
	String color;
	int age;
	
	public Animal() {
		
	}
	public Animal(String name, String color, int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public abstract String voice();
	
	public abstract String eat();
	
	public void move() {}
	
	public String toString() {
		return "\n" + name + "'s color: " + color + "\nage: " + age;  
	}
	public final void printToString() {
		System.out.print(this.toString());
	}	
}

