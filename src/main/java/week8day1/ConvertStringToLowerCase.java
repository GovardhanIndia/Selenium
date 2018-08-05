package week8day1;

class ConvertStringToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name = "This is a Test";
			char[] charArray = name.toCharArray();
			for(int i = 0; i<name.length();i++) {
				if(charArray[i]>=65 && charArray[i]<=90) {
					charArray[i] = (char) (charArray[i]+32);
				}
				System.out.print(charArray[i]);
			}
			
	}

}
