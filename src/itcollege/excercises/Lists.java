package itcollege.excercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Lists {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.addAll(Arrays.asList("Aldous 1","Bert 3","Xavier 5","Eddy 4","Alfonso 2"));
		
		
		
		Collections.sort(names, new BackwardsNameComp());
		
		for(String name:names){
			System.out.println(name);
		}
		
	}
	
	

}
