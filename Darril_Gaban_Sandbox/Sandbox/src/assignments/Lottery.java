package assignments;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		/*make array of random numbers
		 * prompt user for array of input numbers
		 * make if-else statement for 4 conditions
		 * 1. user matches array exactly
		 * 2. user matches array not exactly
		 * 3. user has a number that matches a number in array
		 * 4. user does not match any number in array*/
		
		//initialize arrays
		int[] user = new int[4];
		int[] lottery = new int[4];
		
		//populate array lottery with random values from 0-9
		for(int i=0; i<4; i++) {
			lottery[i]=(int) (Math.random()*10);
				
			System.out.print(lottery[i]+" ");
		}
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt user to input 8 numbers from 0-9 into user array
		System.out.println("\nWelcome to the lottery, enter 4 numbers from the range of 0-9");
		for(int j=0; j<4; j++) {
			user[j]= (int)input.nextInt();
		}
		
		input.close();
		//compare arrays
		if(user[0]==lottery[0]&&user[1]==lottery[1]&&user[2]==lottery[2]&&user[3]==lottery[3])
			System.out.println("You won the $10,000 Jackpot");
		else if((user[0]==lottery[0]||user[0]==lottery[1]||user[0]==lottery[2]||user[0]==lottery[3])&&
				(user[1]==lottery[0]||user[1]==lottery[1]||user[1]==lottery[2]||user[1]==lottery[3])&&
				(user[2]==lottery[0]||user[2]==lottery[1]||user[2]==lottery[2]||user[2]==lottery[3])&&
				(user[3]==lottery[0]||user[3]==lottery[1]||user[3]==lottery[2]||user[3]==lottery[3]))
			System.out.println("You won the $5,000 lottery");
		else if((user[0]==lottery[0]||user[0]==lottery[1]||user[0]==lottery[2]||user[0]==lottery[3])||
				(user[1]==lottery[0]||user[1]==lottery[1]||user[1]==lottery[2]||user[1]==lottery[3])||
				(user[2]==lottery[0]||user[2]==lottery[1]||user[2]==lottery[2]||user[2]==lottery[3])||
				(user[3]==lottery[0]||user[3]==lottery[1]||user[3]==lottery[2]||user[3]==lottery[3]))
			System.out.println("You got at least 1 number correct, you won $1,000");
		else
			System.out.println("You did not win this time, try again next time.");
		
		//if array elements match spot for spot output $10,000
		//if array elements just match, output $5,000
		//if at least 1 element match in arrays, output $1,000
		//if no elements match, output you didn't win
	}
	
//	private boolean compare(int array[], int array2[]) {
//		boolean yes=false;
//		
//		
//		return yes;
//	}

}
