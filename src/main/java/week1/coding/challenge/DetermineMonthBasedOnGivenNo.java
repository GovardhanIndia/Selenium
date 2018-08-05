package week1.coding.challenge;
import java.util.Scanner;

public class DetermineMonthBasedOnGivenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objRef = new Scanner(System.in);
		int monthNo, monthIndex, dayIndex;
		String month[][] = { 
				{"Jan", "31" }, {"Feb", "28"}, {"Mar", "31"}, {"Apr", "30"}, 
				{"May", "31"}, {"Jun", "30"}, {"Jul", "31"}, {"Aug", "31"}, 
				{"Sep", "30"}, {"Oct", "31"}, {"Nov", "30"}, {"Dec", "31"}
		};


		System.out.println("Enter the Month No - ");
		monthNo = objRef.nextInt();
		monthIndex = monthNo - 1;
		
		System.out.println("Entered Month is "+month[monthIndex][0]);
		System.out.println("Total Number of Days in the month " + month[monthIndex][1]);
		
		

	}

}
