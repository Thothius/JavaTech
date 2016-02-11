package itcollege.excercises;

import java.util.Scanner;

// Write a program that lets user input a number (i.e 123) and returns 
//the sum of the number's digits on base 10 (1 + 2 + 3). In Java, you receive 
//the number written to console with a scanner.

//You might make use of methods String.valueOf(), Integer.parseInt(), and String.charAt(i). 
//The latter is not a static method, meaning it can be used for a specified String, for instance: 
//"123".charAt(2).



public class Loops {
	
	static int number;
	
	public static void main(String[] args) {
		
		System.out.println("Number:");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		sumNumbers(number);
		
	}
	
	
	public static void sumNumbers(int nr){
		
		String.valueOf(nr);
		System.out.println(nr);
	
		
	}
	

}
