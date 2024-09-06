package practice6;

public class Cat implements CanHavePizza {
    
    public void eatPizza() {
        System.out.println("\nCat enjoys eating Pizza");
    }
    public String toString() {
		return "The cat ate pizza for free";
    }
}