package practice1;

import java.util.Scanner;

public class PrintMyName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Your name: ");
		
		String name = input.nextLine();
		
		System.out.print("+");
		
		for(int i = 0; i < name.length(); ++i) {
			System.out.print("-");
		}
		
		System.out.println("+");
		
		System.out.println("|" + name + "|");
		
		System.out.print("+");
		
		for(int i = 0; i < name.length(); ++i) {
			System.out.print("-");
		}
		
		System.out.print("+");
		
		input.close();
	}

}

