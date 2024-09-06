package practice1;

public class NewBalance {

	public static void main(String[] args) {
		
		double initialBalance = 100.0;
		System.out.println("Initial Balance: " + initialBalance);
        double interest = 0.01; 
        System.out.println("Interest: " + (100 * interest) + "%");

        double newBalance = initialBalance * (1 + interest);
        System.out.println("New Balance: " + newBalance);
	}
}

