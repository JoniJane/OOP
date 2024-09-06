package practice2;

import java.util.Scanner;

public class MainStarTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		
		StarTriangle small = new StarTriangle(i);
		System.out.println(small.toString());
		
		input.close();
	}
}
