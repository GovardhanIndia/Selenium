package day1homework;

public class InheritenceExample {
	public int parentPublicEmpNo = 1275244;
	String parentDefaultName = "Govardhan";
	protected float parentProtectedHeight = 5.6f;
	private int parentPrivateAccNo = 546789;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am in Parent Class");
		
	}
	public void parentPublicAddition() {
		// TODO Auto-generated method stub
		int sum = 5+4;
		System.out.println("The Sum of Two Numbers - " + sum);		
	}
	
	 void parentDefaultSubtract(int n1, int n2){
		 int sub = n2-n1;
		 System.out.println("The Subtraction - "+sub);
	 }
	 
	 protected float parentProtectedDivision(int num){
		
		 float div = num/2f;
		 System.out.println("The Division of Two Numbers - " +div);
		 return div;
		 
	 }
	 
	 private void parentPrivateLargestNumber(int n1, int n2) {
		 if (n1 > n2) {
			 System.out.println("The largest Number - " +n1);
			 
		 }
		 else {
			 System.out.println("The largest Number - " +n2);
		 }			 
		 
	 }
}
