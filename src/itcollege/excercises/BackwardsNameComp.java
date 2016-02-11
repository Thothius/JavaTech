package itcollege.excercises;

import java.util.Comparator;

public class BackwardsNameComp implements Comparator<String> {
	
	
	private String reverser(String input){
	
		StringBuilder rev = new StringBuilder(input);
		rev.reverse();
		System.out.println(rev);
		return rev.toString();
	}
	@Override
	
	public int compare(String name1, String name2) {
		
		reverser(name1);
		reverser(name2);
		return name1.compareTo(name2);
	}
	}

