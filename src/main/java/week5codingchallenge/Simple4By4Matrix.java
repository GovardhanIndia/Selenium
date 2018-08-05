package week5codingchallenge;

import java.util.Scanner;

public class Simple4By4Matrix {
	public static void main(String args[]) {
		int row, col, temp=1;
		Scanner	obj;
		obj = new Scanner(System.in);
		System.out.println("Enter the no of rows for the matrix");
		row = obj.nextInt();
		System.out.println("Enter the no of Columns for the matrix");
		col = obj.nextInt();
		int arr[][] = new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j] = temp;
				System.out.print(arr[i][j]+"  ");
				temp++;
			}
			System.out.println();
		}
		
		for(int i=0; i<arr.length;i++) {
			
		}
	}
}
