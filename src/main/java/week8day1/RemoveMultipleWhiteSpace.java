package week8day1;

public class RemoveMultipleWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "This is     a   good  example";
		System.out.println(name.replaceAll("\\s+", " "));
	
	}

}
