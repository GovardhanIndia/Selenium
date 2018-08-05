package week2.coding.challenge;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objRef = new Scanner(System.in);
		int num;
		System.out.println("Enter the Number");
		num = objRef.nextInt();
		
		boolean flag = true;
		
		System.out.println("The Prime Numbers from the given Range of :" + num);
		
		for(int i=2;i<=num;i++) {
			if(i==2 || i==3) {
				flag = true;
			}
			else {
				for(int j=2;j<i-1;j++) {
					if(i%j==0) {
						flag = false;
						break;
					}
					else {
						flag = true;				
					}
				}
			}
			if(flag == true)
				System.out.print(" "+i);
		}
	}

}
