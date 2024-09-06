package practice6;

public class Tester {
	public static void main(String[] args) {
		Student s = new Student(100, 5);
		Cat c = new Cat();
		
		System.out.println(s.toString());
		
		Restaurant r = new Restaurant();
		r.servePizza(s);
		r.servePizza(c);
		System.out.println(c.toString());
	}

}
