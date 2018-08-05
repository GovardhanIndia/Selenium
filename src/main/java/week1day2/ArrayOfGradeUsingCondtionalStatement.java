package week1day2;

public class ArrayOfGradeUsingCondtionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] student1Grade = {'S', 'A', 'B', 'C', 'F'};
		char[] student2Grade = {'A', 'B', 'D', 'E', 'S'};
		System.out.println("The Grade of Student 1 - ");
		
		for(int i = 0; i<=4;i++) {
			System.out.println(student1Grade[i]);			
		}
		System.out.println("The Grade of Student 2 - ");
		
		for(int i = 0; i<=4;i++) {
			System.out.println(student2Grade[i]);			
		}
	}
}
