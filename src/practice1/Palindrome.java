package practice1;

import java.util.Scanner;

public class Palindrome {

	public static boolean isPalindrome(String s) {
		for(int i = 0; i <= s.length(); ++i) {
			if (s.charAt(i) != s.charAt(s.length()-i-1)) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		String s = in.nextLine();
		if(isPalindrome(s)) {
			   System.out.println("YES!");
			  } else {
			   System.out.println("NO!");
			  }
			  
			  in.close();
	}

}
