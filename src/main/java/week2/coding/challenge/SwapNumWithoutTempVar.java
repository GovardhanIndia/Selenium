package week2.coding.challenge;

import java.util.Scanner;

public class SwapNumWithoutTempVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		int n1, n2;
		System.out.println("Enter Two Numbers");
		n1 = obj.nextInt();
		n2 = obj.nextInt();
		
		n2 = n1+n2;
		n1 = n2-n1;
		n2 = n2-n1;
		
		System.out.println("After Swapping n1 = "+n1+" n2 = "+n2);
				
		
	}

}
