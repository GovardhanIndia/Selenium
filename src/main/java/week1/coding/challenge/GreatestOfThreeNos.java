package week1.coding.challenge;
import java.util.Scanner;

public class GreatestOfThreeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		Scanner objRef = new Scanner(System.in);
		System.out.println("Enter the First Number : " );
		num1 = objRef.nextInt();
		System.out.println("Enter the Second Number : " );
		num2 = objRef.nextInt();
		System.out.println("Enter the Third Number : " );
		num3 = objRef.nextInt();

		if(num1 > num2) {
			if(num1 > num3) 
				System.out.println("The First Number is Greatest : "+num1);
			else
				System.out.println("The Third Number is Greatest : "+num3);
		}
		else if(num2 > num3) 
			System.out.println("The Second Number is Greatest : "+num2);

		else 
			System.out.println("The Third Number is Greatest : "+num3);
	}
}


