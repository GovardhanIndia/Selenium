package week5codingchallenge;

import java.util.Scanner;

public class LargestNumberInTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit, num, temp, count=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		num = obj.nextInt();
		temp = num;
		System.out.println("Enter the Digit that is present in the number : ");
		digit = obj.nextInt();
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		
		temp=num;
		
		int arr[] = new int[count];
		for(int i=0;i<count;i++) {
			arr[i] = temp%10;
			temp=temp/10;
		}
		
		if(digit==arr[0]) {
			System.out.println("The Higest Number : "+(num-1));
		}
		else if(digit==arr[1]) {
			temp = num - (arr[0]+1); 
			System.out.println("The highest Numer : "+ temp);
		}
		else if(digit==arr[2]) {
			
			String newVal = arr[1]+""+arr[0];
			temp = Integer.parseInt(newVal);
			temp = num-(temp+1);
			System.out.println("The highest Numer : "+ temp);
		}
				
		
	}

}
