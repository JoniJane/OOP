package practice1;

import java.util.Scanner;

public class QuadraticRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the parameters: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = b*b - 4*a*c;
		
		if(discriminant < 0) System.out.print("Error");
		else if(discriminant == 0) {
			double root = (- b) / 2*a;
			System.out.print(root);
		}
		else {
			double roots1 = (-b + Math.sqrt(discriminant)) / 2*a;
			double roots2 = (-b - Math.sqrt(discriminant)) / 2*a;
			System.out.print("First roots: " + roots1 + ", Second roots: " + roots2);
		}
		
		input.close();
	}

}
