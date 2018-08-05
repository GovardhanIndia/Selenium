package day1homework;

public class LearningMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOne = 14;
		int numberTwo = 25;
		int add;
		
		float divide;
		int large;
		
		add = addition(numberOne, numberTwo);
		System.out.println("Addition - " + add);
		
		subtract(add, numberTwo);
		divide = division(add);
		//System.out.println("Division = "+divide);
		large = largestNumber(numberOne, numberTwo);
		//System.out.println("large - "+large);

	}

	public static int addition(int n1, int n2) {
		// TODO Auto-generated method stub
		
		System.out.println("The Sum of Two Numbers - "+ (n1+n2));
		int sum = n1+n2;
		return sum;
	}
	
	 static void subtract(int n1, int n2){
		 int sub = n2-n1;
		 System.out.println("The Subtraction - "+sub);
	 }
	 
	 static float division(int num){
		
		 float div = num/4f;
		 System.out.println("The Division of Two Numbers - " +div);
		 return div;
		 
	 }
	 
	 static int largestNumber(int n1, int n2) {
		 if (n1 > n2) {
			 System.out.println("The largest Number - " +n1);
			 return n1;
		 }
		 else {
			 System.out.println("The largest Number - " +n2);
			 return n2;
		 }
			 
		 
	 }
	 
	 
	 
	

}
