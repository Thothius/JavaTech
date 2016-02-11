package itcollege.excercises;

import java.util.Scanner;


public class DigitPower {

	static int number;

	public static void main(String[] args) {

		System.out.println("Number:");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		System.out.println("Number is: "+number);
		int power = powerNumbers(number);
		System.out.println("Power of numbers: "+power);

	}

	public static int powerNumbers(int nr){
		int power = 1;
		nr = Math.abs(nr);
		String str = String.valueOf(nr);

		for (int i = 0; i < str.length(); i++) {

			int digit = Character.digit(str.charAt(i), 10);
			power *= digit;	
		}
		return power;
	}
}
