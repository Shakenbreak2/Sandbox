package assignments;

import java.util.Scanner;

public class CalculateSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Hello enter 2 numbers: ");
		int num1 = input.nextInt();

		int num2 = input.nextInt();

		double num3 = (double) num1 + (double) num2;
		double muli = (double) num1 * (double) num2;

		System.out.printf("The sum of %d and %d is %d", num1, num2, num3);
		System.out.printf("the multiplication of %d and %d is %f", num1, num2, muli);
		System.out.printf("the average of %d and %d is %f", num1, num2, num3 / 2);

		input.close();
	}

}
