package practise;

import java.util.Scanner;

public class CheckAlphabet {
	

	
	
	static void checkAlpha(char c) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a character to check: ");
		
		if((c>=65 && c<=90) || (c>=97 && c<=122)) {
			System.out.println("Its is an alphabet");
		}
		else{
			System.out.println("Its is not an alphabet");
		}
	}

	public static void main(String[] args) {
		
		char c='*';
		checkAlpha(c);
		
	}

}
