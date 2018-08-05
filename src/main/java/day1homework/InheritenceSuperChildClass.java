package day1homework;

public class InheritenceSuperChildClass extends InheritenceChildClass{
	public int superChildPublicEmpNo;
	String superChildDefaultName;
	protected float superChildProtectedHeight;
	private int superChildPrivateAccNo;
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritenceChildClass objRef = new InheritenceChildClass();
		System.out.println("Parent name - "+objRef.parentDefaultName);
		System.out.println("Parent Emp No - "+objRef.parentPublicEmpNo);
		System.out.println("Parent Height - "+objRef.parentProtectedHeight);
		objRef.parentPublicAddition();
		objRef.parentDefaultSubtract(5, 10);
		objRef.parentProtectedDivision(15);
		
		System.out.println("Child Emp No - "+objRef.childPublicEmpNo);
		System.out.println("Child Height - "+objRef.childProtectedHeight);
		
		objRef.main(args);
		InheritenceExample.main(args);
		objRef.parentDefaultSubtract(5, 10);
		objRef.parentProtectedDivision(15);
	}
	public void superChildPublicAddition() {
		// TODO Auto-generated method stub
		int sum = 5+4;
		
		System.out.println("The Sum of Two Numbers - " + sum);		
	}

	void superChildDefaultSubtract(int n1, int n2){
		int sub = n2-n1;
		System.out.println("The Subtraction - "+sub);
	}

	protected float superChildProtectedDivision(int num){

		float div = num/2f;
		System.out.println("The Division of Two Numbers - " +div);
		return div;

	}

	private void superChildPrivateLargestNumber(int n1, int n2) {
		if (n1 > n2) {
			System.out.println("The largest Number - " +n1);

		}
		else {
			System.out.println("The largest Number - " +n2);
		}			 

	}
}
