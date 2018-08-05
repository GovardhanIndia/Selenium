package week3codingchallenge;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatedNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of Elements you wanted in the array");
		num = obj.nextInt();
		int a[] = new int[num];
		int temp, count = 1;
		
		System.out.println("Enter the number one by One");
		
		for (int i=0;i<a.length;i++) {
			a[i] = obj.nextInt();
		}
		
		System.out.println("The Duplicated Numbers are : ");
		Arrays.sort(a);
		String repeatedNum = "";
		
		for (int i = 0; i < a.length -1 ; i++) {
			if(a[i] == a[i+1]){
				if (!repeatedNum.equals(a[i]+" ")) {
					repeatedNum = a[i] +" ";
					System.out.print(repeatedNum);
				}
			}
		}		
	}
}


