package assignments;

import java.util.Scanner;

public class Fibonacci {
static Scanner in=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("1)for adding \n2)for star pyrimid \n3) hi/low number");
		int menu=in.nextInt();
		
		switch(menu) {
		case 1:addFibo();break;
		case 2:starPyrimid();break;
		case 3:hiLow();break;
		default:break;
		}
		System.out.println("Thank you");
	}
	
	static void hiLow() {
		int target = (int)(Math.random()*100);
		int guess=0, tries=0;
		System.out.println("What is your guess of what the number is");
		while(guess!=target) {
			
			guess=in.nextInt();
			if(guess<target)
				System.out.println("to low");
			else
				System.out.println("to high");
			tries++;
		}
		System.out.println("Congratulations you got it, it took you "+tries+" times.");
	}
	
	static void addFibo() {
		System.out.println("how many times do you want to loop");
		int max = in.nextInt(); 
		
		for(int i=1; i<=max;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	static void starPyrimid() {
		System.out.println("how many times do you want to loop");
		int max =in.nextInt();
		
		
		//loop for the number of rows
		for(int i=1;i<=max;i++) {
			//loop for the number of spaces before the star
			for(int x=max; x >= i; x--) {
				System.out.print(" ");
			}
			//loop for the number of stars in the row
			for(int j=1; j <= i; j++) {
				System.out.print("* ");
			}
			//for new line after each row
			System.out.println();
		}
	}
}
