package week3codingchallenge;

import java.util.Scanner;

public class FloyadTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of rows for Floid Triangle");
		num = obj.nextInt();
		int temp=1;
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println();
		}
	}
}