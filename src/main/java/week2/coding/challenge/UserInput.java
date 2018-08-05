package week2.coding.challenge;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objScan = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Enter the Value for Two Number : ");
		num1 = objScan.nextInt();
		num2 = objScan.nextInt();
		
		objScan.nextLine();
		
		System.out.print("Enter the Arithmetic Operation that you want to perfrom - ");
		String arithmeticVal = objScan.nextLine();
		arithmeticVal = arithmeticVal.toUpperCase();
		System.out.println(arithmeticVal);
		
		if(arithmeticVal.equals("ADD")) {
			System.out.println("The Additon of two numbers : "+ (num1+num2));
		}
		else if(arithmeticVal.equals("SUBTRACT")) {
			System.out.println("The Subtraction of two numbers : "+ (num1-num2));
		}
		else if(arithmeticVal.equals("MULTIPLY")) {
			System.out.println("The Multiplication of two numbers : "+ (num1*num2));
		}
		else if(arithmeticVal.equals("DIVISION")) {
			float divide = (float)num1/num2;
			
			System.out.println("The DIVISION of two numbers : "+ divide);
		}
	}

	
}
