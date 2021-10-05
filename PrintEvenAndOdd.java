package practise;

import java.util.Scanner;
public class PrintEvenAndOdd{
	
	
	
	
	static void Even(int num1,int num2) {
		int r,i;
		System.out.println("Display the even numbers between "+num1+" and "+num2+" are :");
		for(i=num1; i<=num2; i++){ 
			r=i%2; 
			if(r==0) 
				System.out.println(i);
		}
		
	}
	
	static void Odd(int num1,int num2) {
		int r,i;
		System.out.println("Display the odd numbers between "+num1+" and "+num2+" are :");
		for(i=num1; i<=num2; i++){ 
			r=i%2; 
			if(r==1) {
				System.out.println(i);
			}
		}
		
	}
	
	public static void main (String args[]){
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the first number for the range: ");
		int num1=scan.nextInt();
		System.out.print("Enter the second number for the range: ");
		int num2=scan.nextInt();
		Even(num1,num2);
		
		Odd(num1,num2);
	}
}
