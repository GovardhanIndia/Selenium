package week7day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String compName = "google";
		int count = 1;
		dupNumber();
		Set<Character> unique = new LinkedHashSet<Character>();
		char[] charArray = compName.toCharArray();
		for(char c : charArray) {
			unique.add(c);
		}		
		System.out.println(unique);

		List<Character> list = new ArrayList<Character>();

		for(char c: charArray) {
			if(!list.contains(c))
				list.add(c);
		}
		System.out.println(list);
		
		for(int i=0;i<compName.length();i++) {
			for(int j=i+1;j<compName.length();j++) {
			
				if(charArray[i] == charArray[j]) {
					
				}
			}
			System.out.println(charArray[i]+" Appears "+count);
			count = 1;
		}
		
		
	}
	
	public static void dupNumber() {
		int num[] = {1, 3, 3, 7, 8, 8, 9};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int n : num) {
			if(!list.contains(n)) {
				list.add(n);
			}
		}
		System.out.println(list);
	}

}