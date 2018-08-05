package week1day2;

public class FirstTwentyNumDivBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		int count = 1;
		
		while(num<=1000){
			int div = num%5;
			
			if (div == 0) {
				System.out.println("The Number Divided by 5 :" +num);
				count = count+1;
			}
			if (count == 20) 
				break;
			
			num = num+1;
		}

	}

}