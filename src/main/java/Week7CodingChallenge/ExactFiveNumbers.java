package Week7CodingChallenge;

import java.util.Scanner;

public class ExactFiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = obj.nextLine();
		boolean flag = true;
		if(input.length()>5 || input.length()<5) {
			System.out.println("False");
		}else {
			for(int i=0;i<input.length();i++) {
				if(!((int)input.charAt(i)>=48 && (int)input.charAt(i)<=57)) {
					flag = false;
				}
			}
			if(flag == true) {
				System.out.println("True");
			}else
				System.out.println("False");
		}
		
		
		
		
		/*String replaceAll = input.replaceAll("[^0-9]", "");
		
		if(replaceAll.length()==5) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}*/
		obj.close();

	}

}
