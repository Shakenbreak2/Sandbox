package assignments;

import java.util.Scanner;

public class Conditional2 {
static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//Conditional2 m= new Conditional2();
		
		
		boolean f=false;
		while(f==false) {
			System.out.println("Which program do you wish to run?"
				+ "\n1) Positive and Negative"
				+ "\n2) Greatest Number"
				+ "\n3) Zero, Positive, Negative"
				+ "\n4) Vowel and Consonant"
				+ "\n5) Exit");
			
			int menu=input.nextInt();
			switch(menu) {
			case 1:positiveNegative();f=false;break;
			case 2:greatestNumber();f=false;break;
			case 3:numbers();f=false;break;
			case 4:vowel();f=false;break;
			case 5:f=true;break;
			default:f=false;
			}
			
		}
		input.close();
	}

	/*
	 * 1. Write a Java program to get a number from the user and print whether it is
	 * positive or negative.
	 */
	private static void positiveNegative() {

//		Scanner input = new Scanner(System.in);

		System.out.println("enter a number, positive or negative.");
		int number = input.nextInt();

		if (number>0)
			System.out.printf("%d is positive", number);
		else
			System.out.printf("%d is negative", number);
//	input.close();
	
	}

	// 2. Take three numbers from the user and print the greatest number
	private static void greatestNumber() {
		int[] num = new int[3];
		int n = 3, high = num[0];
//		Scanner input = new Scanner(System.in);
		System.out.println("please enter 3 numbers");
		for (int i = 0; i < n; i++)
			num[i] = input.nextInt();

		for (int j = 0; j < n; j++) {
			if (high < num[j])
				high = num[j];
		}
		System.out.println(high);
//		input.close();
	}

	/*
	 * Write a Java program that reads a double (number with decimal places) and
	 * prints "zero" if the number is zero. Otherwise, print "positive" or
	 * "negative". Add "small" if the absolute value of the number is less than 1,
	 * or "large" if it exceeds 1,000,000
	 */
	private static void numbers() {
		double num;
//		Scanner input = new Scanner(System.in);
		System.out.println("input a number, can be negative or positive");
		num = input.nextDouble();

//		input.close();
		if (num < 0) {
			if (num > -1)
				System.out.printf("number is small negative");
			else if (num < -1000000)
				System.out.printf("number is large negative");
			else
				System.out.println("number is negative");
		} else if (num > 0) {
			if (num < 1)
				System.out.println("number is small positive");
			else if (num > 1000000)
				System.out.println("number is large positive");
			else
				System.out.println("number is positive");
		} else
			System.out.println("number is zero");
	}

	/*
	 * 4. Write a Java program that takes the user to provide a single character
	 * from the alphabet. Print Vowel or Consonant, depending on the user input. If
	 * the user input is a string of length > 1, print an error message.
	 */
	private static void vowel() {
//		Scanner input = new Scanner(System.in);
		System.out.println("enter a letter of the alphabet");
		String string = input.next();
		char[] c = string.toCharArray();
		
//		input.close();
		if(c.length>1) {
			System.out.println("error to many characters");
		}else {
			if(c[0]=='a'||c[0]=='e'||c[0]=='i'||c[0]=='o'||c[0]=='u') {
				System.out.println("character is a vowel");
			}else
				System.out.println("character is a consonant");
			
		}
		
	}
}
