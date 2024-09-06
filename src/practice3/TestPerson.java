package practice3;

import java.util.Vector;

public class TestPerson {

	public static void main(String[] args) {
		Vector<Person> v = new Vector<>();
		
		Person p1 = new Student("Zhanel", "Talgar", "IS", 2, 0);
		Person p2 = new Staff("Amanzhol", "Talgar", "SITE",10000000);
		
		v.add(p1);
		v.add(p2);
		
		for(Person p : v) {
			System.out.println(p.toString());
		}
	}

}
