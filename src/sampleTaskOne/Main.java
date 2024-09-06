package sampleTaskOne;

public class Main {

	public static void main(String[] args) {
		Dog myDog = new Dog("Tete");
	
		System.out.println(myDog.getName());
		
		myDog.move(10);
		System.out.print(myDog.move(10));
//		myDog.move(10);
				
	}

}
