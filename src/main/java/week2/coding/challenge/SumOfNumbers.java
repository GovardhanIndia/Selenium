package week2.coding.challenge;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objScan = new Scanner(System.in);
		System.out.println("Enter the Numbers to Sum");
		int num = objScan.nextInt();
		int n1[] = new int[num];
		int temp = 0;
		System.out.println("Enter the Numbers one by one");
		
		for(int i = 0;i<num;i++) {
			n1[i] = objScan.nextInt();
		}
		
		for(int j=0;j<num-1;j++) {
			temp = n1[j]+n1[j+1];		
			n1[j+1] = temp;		
		}
		System.out.println("The Sum of Numbers = "+temp);
	}
}
