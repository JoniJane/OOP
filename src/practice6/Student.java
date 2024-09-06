package practice6;

public class Student implements CanHavePizza{
	int budget;
	int amauntOfPizza;
	int bill;
	
	public Student(int budget, int amauntOfPizza) {
		this.budget = budget;
		this.amauntOfPizza = amauntOfPizza;
		this.bill = amauntOfPizza * 5;
	}
	@Override
	public void eatPizza() {
		System.out.println("Student enjoys eating pizza");
	}
	public void processPayment() {
		if(budget >= bill) {
			System.out.println("The bill has been successfully paid");
		} else {
			System.out.println("The student will wash the dishes");
		} 
	}
	public String toString() {
		return "\nThe budget: "+budget+"\nThe bill: "+bill; 
	}
}
