package week6CodingChallenge;

import java.util.Scanner;

public class LongestPositiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, temp, temp1 = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value to be stored in an array");
		num = obj.nextInt();
		
		int arr[] = new int[num];
		int arrSeq[] = new int[num];
		System.out.println("Enter the Number One By One : ");
		for(int i = 0;i<num;i++) {
			arr[i] = obj.nextInt();
		}
		System.out.println("After Sorting");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>=arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+1 == arr[j]) {
					
					
				}
			}
		}
	}
}
