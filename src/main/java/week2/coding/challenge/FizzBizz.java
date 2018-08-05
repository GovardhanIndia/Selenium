package week2.coding.challenge;

import java.util.Scanner;

public class FizzBizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		Scanner objScan = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		n1 = objScan.nextInt();
		System.out.println("Enter the Second Number : ");
		n2 = objScan.nextInt();
		
		for(int i=n1;i<=n2;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(" FIZZBIZZ ");
			}
			else if(i%3 == 0) {
				System.out.print(" FIZZ ");
			}
			else if(i%5 == 0) {
				System.out.print(" BIZZ ");
			}
			else
				System.out.print(" "+i);
		}

	}

}
