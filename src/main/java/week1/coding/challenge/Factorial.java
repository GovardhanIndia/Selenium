package week1.coding.challenge;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TObDO Auto-generated method stub
		
		Scanner objNew = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = objNew.nextInt();
		int fact = num;
		
		for(int i=num;i>1;i--) {			
			fact = fact*(i-1);
			
		}
		System.out.println("The factorial of "+num+" : "+fact);

	}

}
