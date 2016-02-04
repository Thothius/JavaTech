import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


//input: "hello"
//output:
//#   # ##### #     #      ###
//#   # #     #     #     #   #
//##### ####  #     #     #   #
//#   # #     #     #     #   #
//#   # ##### ##### #####  ###


public class Excercise1 {
	
	static String word;
	
	public static void main(String[] args) {
		
		inputWord();
		wordEater(word);
	}
	
	// Gets the word, breaks it down and prints the word in large characters
	public static void wordEater (String word) {
		
		//ArrayList charList = new ArrayList();
		char[] charArray = word.toCharArray();
		for (int i = 0; i < word.length(); i++) {
		System.out.println(charArray[i]);
		}
		System.out.println(word);
	}
	
	public static String inputWord() {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a word: ");
		word = reader.nextLine();
		return word;
	}

	public static void replaceChar() {
		
		
		String bigLetters[] = new String[]
						{ "#   #"
				        + "#   #" 
				        + "#####" 
				        + "#   #" 
				        + "#   #",
				         "#####"
				        +"#    "
				        +"#####"
				        +"#    "
				        +"#####"
						};
		}
	}

