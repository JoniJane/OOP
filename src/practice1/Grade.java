package practice1;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		
		double number = input.nextDouble();
		
		if (number >= 0 && number <= 100) {
			if(number>=95) System.out.print("A");
			else if(number>=90) System.out.print("A-");
			else if(number>=90) System.out.print("A-");
			else if(number>=85) System.out.print("B+");
			else if(number>=80) System.out.print("B");
			else if(number>=75) System.out.print("B-");
			else if(number>=70) System.out.print("C+");
			else if(number>=65) System.out.print("C");
			else if(number>=60) System.out.print("C-");
			else if(number>=55) System.out.print("D+");
			else if(number>=50) System.out.print("D");
			else System.out.print("F");
		}
		else System.out.print("Please enter a number between 0-100");
		
		input.close();
		}
	
	}


