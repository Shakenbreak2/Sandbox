package assignments;

import java.util.Scanner;

public class Sums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
		System.out.println("Please enter 2 numbers");
		int num1= input.nextInt();
		int num2=input.nextInt();
		
			if(num1+num2>10) {
			break;
			}
		System.out.println(num1+num2);
		}
		input.close();
	}

}
