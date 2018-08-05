package week1.coding.challenge;
import java.util.Scanner;

public class SortingNumber {
	static Scanner objRef = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the sequence of Number : ");
		int num = objRef.nextInt();
		System.out.println("Enter the Number One By One : ");
		int arrNum[] = new int[num];
		int temp = 0;
		for(int i=0;i<num;i++) {
			arrNum[i] = objRef.nextInt();			
		}
		ascendingOrder(num, arrNum, temp );		
		decendingOrder(num, arrNum, temp);
	}

	public static void  ascendingOrder(int num, int[] arrNum, int temp) {
		// TODO Auto-generated method stub

		System.out.println("Sorted Array in Ascending Order : ");

		for(int i = 0; i<arrNum.length ;i++) {

			for(int j = i+1; j<arrNum.length ;j++) {

				if(arrNum[i] >= arrNum[j]){
					temp = arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = temp;									
				}				
			}
			System.out.print(" "+arrNum[i]);
			
		}
		System.out.println("\n");
		System.out.println("The Lowest No in the Array : "+arrNum[0]);
		System.out.println("The Biggest No in the Array : "+arrNum[arrNum.length-1]);
	}

	public static void decendingOrder(int num, int[] arrNum, int temp) {
		// TODO Auto-generated method stub

		System.out.println("Sorted Array in descending Order : ");

		for(int i = 0; i<arrNum.length ;i++) {

			for(int j = i+1; j<arrNum.length ;j++) {

				if(arrNum[i] <= arrNum[j]){
					temp = arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = temp;									
				}				
			}
			System.out.print(" "+arrNum[i]);
		}
	}
}

