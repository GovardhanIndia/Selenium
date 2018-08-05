package day1homework;

public class InheritenceChildClass extends InheritenceExample {
	public int childPublicEmpNo = 677933;
	String childDefaultName = "Balaji";
	protected float childProtectedHeight = 5.6f;
	private int childPrivateAccNo = 567890;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am child class Main");

	}
	public void childPublicAddition() {
		// TODO Auto-generated method stub
		int sum = 5+4;
		System.out.println("The Sum of Two Numbers in child- " + sum);		
	}
	
	 void childDefaultSubtract(int n1, int n2){
		 int sub = n2-n1;
		 System.out.println("The Subtraction in child- "+sub);
	 }
	 
	 protected float childProtectedDivision(int num){
		
		 float div = num/2f;
		 System.out.println("The Division of Two Numbers in child- " +div);
		 return div;
		 
	 }
	 
	 private void childPrivateLargestNumber(int n1, int n2) {
		 if (n1 > n2) {
			 System.out.println("The largest Number - " +n1);
			 
		 }
		 else {
			 System.out.println("The largest Number - " +n2);
		 }			 
		 
	 }
}
