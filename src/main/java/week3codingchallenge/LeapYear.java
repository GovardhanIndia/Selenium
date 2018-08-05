package week3codingchallenge;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter how many years you want to find  : ");
		num = obj.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter the Number One by One : ");
		for(int i = 0; i<arr.length;i++) {
			arr[i] = obj.nextInt();
		}
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]%100 == 0) {
				if(arr[i]%400 == 0)
					System.out.println("Given Number is leap Year - "+arr[i]);
				else
					System.out.println("Given Number is not leap Year - "+arr[i]);
			}
			else if(arr[i]%4 == 0)
				System.out.println("Given number is leap year - "+arr[i] );
			else
				System.out.println("Given number is not a leap year - "+arr[i] );
		}
		
		
	}

}
