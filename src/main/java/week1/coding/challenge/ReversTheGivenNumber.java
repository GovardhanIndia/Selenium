package week1.coding.challenge;
import java.util.Scanner;

public class ReversTheGivenNumber {
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner objNew = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = objNew.nextInt();	
		int count = 0;
		int temp = num;
		
		while(temp>0) {
			temp = temp/10;
			count++;
		}
		
		int[] newNum = new int[count];
		int i = 0;
		
		while(num>0) {
			newNum[i] = num%10;
			num = num/10;
			i++;
		}
		
		for(int actualNum: newNum) {
			System.out.print(actualNum);
		}
	}

}
