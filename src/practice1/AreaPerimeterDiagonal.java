package practice1;

import java.util.Scanner;

public class AreaPerimeterDiagonal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length: ");
		
		double length = input.nextDouble();
		
		double area = length * length;
		double perimeter = length * 4;
		double diagonal = Math.sqrt(2) * length;
		
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("The length of diagonal: " + diagonal);
		
		input.close();
	}

}
