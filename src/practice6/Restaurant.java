package practice6;

public class Restaurant {
	boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();
        if (eater instanceof Student) {
            System.out.println("\nProcessing payments for the person.....");
            ((Student) eater).processPayment(); 
            return true; 
        }
		return false;
       
    }
}
