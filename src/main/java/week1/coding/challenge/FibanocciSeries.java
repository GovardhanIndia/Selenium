  package week1.coding.challenge;

public class FibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 143;
		int fib = 0;
		int temp = 0; 
		int j=0;
		
		
		for(int i = 0;fib<=n;i++) {		
			if(i<=1) {				
				fib = i+j;				
			}else{
				temp = j+fib;
				j = fib;
				fib = temp;
			}	
			if(temp<=n)
				System.out.print(temp + " , ");
				
/*			if(fib>=n) {
				break;
			}
*/				
		}
		

	}

}
