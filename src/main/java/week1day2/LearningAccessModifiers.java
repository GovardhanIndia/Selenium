package week1day2;

public class LearningAccessModifiers {
	public String publicName = "Govardhan";
	int defaultAge = 32;
	protected int protectedCompany = 3;
	private float privateHeight;
	
	public void publicAddition() {
		// TODO Auto-generated method stub
		int sum = 5+4;
		System.out.println("The Sum of Two Numbers - " + sum);		
	}
	
	 void defaultSubtract(int n1, int n2){
		 int sub = n2-n1;
		 System.out.println("The Subtraction - "+sub);
	 }
	 
	 protected float protectedDivision(int num){
		
		 float div = num/2f;
		 System.out.println("The Division of Two Numbers - " +div);
		 return div;
		 
	 }
	 
	 private void largestNumber(int n1, int n2) {
		 if (n1 > n2) {
			 System.out.println("The largest Number - " +n1);
			 
		 }
		 else {
			 System.out.println("The largest Number - " +n2);
		 }			 
		 
	 }
	 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}

}
