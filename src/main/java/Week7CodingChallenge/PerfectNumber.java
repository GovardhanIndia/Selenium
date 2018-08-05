package Week7CodingChallenge;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, number, sum = 0, perfNum = 0;
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter any number : ");
		number = scan.nextInt();
		for(i=1;i<number;i++) {
			if(number%i==0) {
				sum = sum+i;
			}
		}
		if((sum+number)%2==0) {
			perfNum = (sum+number)/2;
		}
		
		
		if(sum==number && perfNum==number)  {
			System.out.println("It is a perfect number");
		}else {
			System.out.println("It is not a perfect number");
		}
			

	}

}
