package week1day2;

public class PrintAllEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int evenNo = 2; evenNo<=100; evenNo++) {
			if((evenNo%2) == 0) {
				System.out.println("The Number :"+evenNo+ " is an Even No");				
			}
		}
	}

}
