package week1.coding.challenge;

public class FirstAndThirdLargestNumber extends SortingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the sequence of Number : ");
		int num = objRef.nextInt();
		System.out.println("Enter the Number One By One : ");
		int arrNum[] = new int[num];
		int temp = 0;
		for(int i=0;i<num;i++) {
			arrNum[i] = objRef.nextInt();			
		}
		SortingNumber.decendingOrder(num, arrNum, temp);
		System.out.println("\n");
		
		for(int i=0;i<arrNum.length;i++) {
			for(int j=i+1;j<arrNum.length;j++) {
				
			}
		}
		System.out.println("First Largest Number - "+arrNum[0]);
		System.out.println("First Largest Number - "+arrNum[2]);
	}

}
