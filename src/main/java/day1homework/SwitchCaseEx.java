package day1homework;

import java.util.Scanner;

public class SwitchCaseEx extends AbExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 5;


		switch(day) {

			case 1: {
				System.out.println("Sunday");
			}	
			
			
			
			case 2:{
				System.out.println("Monday");
				
			}	
			
			case 3:{
				System.out.println("Tuesday");

			}
			
			case 4:{
				System.out.println("Wednesday");

			}
			
			case 5:{
				System.out.println("Thursday");
				break;
			}
			
			case 6:{
				System.out.println("Friday");
				
			}
			
			case 7:{
				System.out.println("Saturday");

			}
			default: {
				System.out.println("Day is not Present");

			}				
		}
		
	}

	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addtion() {
		// TODO Auto-generated method stub
		
	}
}


