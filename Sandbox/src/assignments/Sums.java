package assignments;

import java.util.Scanner;

public class Sums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers");
		int num1= input.nextInt();
		int num2=input.nextInt();
		
		System.out.println(num1+num2);
		
		input.close();
	}

}
