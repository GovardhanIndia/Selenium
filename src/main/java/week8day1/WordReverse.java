package week8day1;

public class WordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "My Name is Govardhan";
		String[] splitName = name.split(" ");
		
		for(String eachString: splitName) {
			char[] charArray = eachString.toCharArray();
			
			for(int i=(charArray.length-1);i>=0;i--) {
				System.out.print(charArray[i]);
			}
			System.out.print(" ");
			
		}
	}

}
