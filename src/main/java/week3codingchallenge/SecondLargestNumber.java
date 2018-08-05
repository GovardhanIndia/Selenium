package week3codingchallenge;

import java.util.Scanner;

import week1.coding.challenge.SortingNumber;

public class SecondLargestNumber extends SortingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objRef=new Scanner(System.in);
		System.out.println("Enter the sequence of Number : ");
		int num = objRef.nextInt();
		System.out.println("Enter the Number One By One : ");
		int arrNum[] = new int[num];
		int temp = 0;
		for(int i=0;i<num;i++) {
			arrNum[i] = objRef.nextInt();			
		}
		ascendingOrder(num, arrNum, temp);
		System.out.println("The Second Largest Number in the Array : "+arrNum[(arrNum.length)-2]);
		
	}

}
