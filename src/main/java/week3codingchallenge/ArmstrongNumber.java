package week3codingchallenge;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100, num2 = 99999, i=0;
		double n2 = 0;
		int temp[]  = new int[5];
		int tempNo = 0;
		
		System.out.println("The Armstrong Number fromm 100 to 10000 : ");
		
		for(int j = num1;j<=num2;j++) {
			tempNo = j;
			
			while(tempNo>0) {
				temp[i] = tempNo%10;		
				tempNo = tempNo/10;
				i++;			
			}
			
			//n2 = (temp[2]*temp[2]*temp[2])+(temp[1]*temp[1]*temp[1])+(temp[0]*temp[0]*temp[0]);
			
			for(int incr=i-1;incr>=0;incr--) {
				/*if(i==3)	
					n2 = n2+(Math.pow(temp[i-1],3))+(Math.pow(temp[i-2],3))+(Math.pow(temp[i-3],3));
				else if(i==4)
					n2 = (Math.pow(temp[i-1],3))+(Math.pow(temp[i-2],3))+(Math.pow(temp[i-3],3))+(Math.pow(temp[i-4],3));
				else if(i==5)
					n2 = (Math.pow(temp[i-1],3))+(Math.pow(temp[i-2],3))+(Math.pow(temp[i-3],3))+(Math.pow(temp[i-4],3))+(Math.pow(temp[i-5],3));*/
				if(i==3)
					n2=n2+(Math.pow(temp[incr],3));
				else if(i==4)
					n2=n2+(Math.pow(temp[incr],4));
				else if(i==5)
					n2=n2+(Math.pow(temp[incr],5));
			}	
			if (j==n2) {
				System.out.print(" "+n2);
			}
			i=0;			
			n2=0;
		}		
	}	
}
