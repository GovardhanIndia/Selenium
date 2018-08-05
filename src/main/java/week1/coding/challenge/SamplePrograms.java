package week1.coding.challenge;

import java.util.Scanner;

public class SamplePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range of numbers : ");
		n = scan.nextInt();
		
		
		for(int i=2;i<n;i++) {
			if(n==2) {
				System.out.print(i+" ");
			}
			
			else if(!(n%i==0)) {
				System.out.print(i+" ");
				
			}
		}
	}

}
