package practice3;

import java.util.Vector;

public class AnimalTest {

	public static void main(String[] args) {
		Animal a = new Dolphin("Lulu", "Gray", 3, 80, 2);
		Dolphin d = new Dolphin("Didi", "Blue", 5, 100, 0);
		
		Vector<Animal> zoo = new Vector<Animal>();
		zoo.add(a);
		zoo.add(d);
		
		System.out.println(zoo);
		
		for(Animal newAnimal : zoo) {
			if (newAnimal instanceof Dolphin) {
				System.out.println(newAnimal.voice());
				Dolphin d1 = (Dolphin)newAnimal;
				d1.findFish();	
			}
		}
	}
}