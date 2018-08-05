package week8day1;

public class ExtractFirst7Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "The revenue of TCS is $890076543214 annually";
		String integerValues = value.replaceAll("[^0-9]", "");
		System.out.println("The First Seven numbers in the value = "+integerValues.substring(0, 7));

	}

}
