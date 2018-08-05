package week8day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName = "Tata Consultancy Services";
		companyName = companyName.replace(" " , "");
		companyName = companyName.toLowerCase();
		
		char[] charArray = companyName.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char eachChar : charArray) {
			if(map.containsKey(eachChar)) {
				map.put(eachChar, map.get(eachChar)+1);
			}else {
				map.put(eachChar, 1);
			}
		}
		
	
		
		System.out.println(map);
		
		
		
	}

}
