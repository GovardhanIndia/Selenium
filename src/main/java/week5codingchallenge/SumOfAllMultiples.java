package week5codingchallenge;

import java.util.Scanner;

public class SumOfAllMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sum = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		num = obj.nextInt();
		
		System.out.print("For "+num+" multiples of 3 and 5 are ");
		
		for(int i = 3; i<num;i++) {
			if(i%3 == 0) {
				 sum = sum+i;
				 System.out.print(i+ " ");
			}
			else if(i%5 == 0) {
				sum = sum + i;
				System.out.print(i+ " ");
			}
			
		}
		System.out.print(" Their sum = "+sum);
	}

}
