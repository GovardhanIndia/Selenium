package week1.coding.challenge;
import java.util.Scanner;


public class GivenNumberOddOrEven {

	static Scanner objRef = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer;
		System.out.println("Enter the Number");

		int num = objRef.nextInt();
		answer = numberIsOddOrEven(num);
		System.out.println(answer);
		

	}

	static String numberIsOddOrEven(int no) {

		if (no%2 == 0) 
			return "Number is Even";
		else
			return "Number is Odd";
	}
}
