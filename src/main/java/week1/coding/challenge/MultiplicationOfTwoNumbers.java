package week1.coding.challenge;
import java.util.Scanner;

public class MultiplicationOfTwoNumbers {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objRef = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter the Number 1 :");
		num1 = objRef.nextInt();
		System.out.println("Enter the Number 2 : ");
		num2 = objRef.nextInt();
		System.out.println("The Multiplication Table for " + num1 +" till the number " +num2);
		
		int count = 1;
		
		
		while(count<=num2) {
			int mul;
			mul = num1 * count;
			System.out.println(num1 + "*" + count + "=" +mul );
			count++;
			
			if(count>num2)
				break;
		}

	}

}

