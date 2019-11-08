/* Copyright (C) 2019  Darril Gaban

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * */

package com.perscholas;

import java.util.Scanner;

public class ComputingTaxes {

	public static void main(String[] args) {
		/* program prompts the use for their taxable status.
		 * gets input for status.
		 * assign status to a number.
		 * prompt for yearly income.
		 * get input for income.
		 * calculate tax by tax bracket. 10%, 15%, 25%, 28%, 33%, 35%
		 * output the taxes
		 * */
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		//declare and initalize variables
		int tax = 0;
		double income = 0.00;
		boolean check = false;
		
		//error check, loop till user enters valid input
		while(check == false) {
			// prompt user to enter what tax status they use.
			System.out.println("Are you filing as a"
					+ "\nSingle"
					+ "\nMarried filing jointly"
					+ "\nMarried filing seperately"
					+ "\nHead of household");
	
			String taxStatus = input.nextLine().toLowerCase().trim();
			
	
			//convert user input into int variable to be use later (not best way to do this)
			switch (taxStatus) {
			case "single":
				tax = 1;
				check =true;
				break;
			case "married filing jointly":
				tax = 2;
				check = true;
				break;
			case "married filing seperatly":
				tax = 3;
				check =true;
				break;
			case "head of household":
				tax = 4;
				check =true;
				break;
			default:
				System.out.println("not a correct tax status.\n");
				check = false;
			}
		}
		

		
		//loop until user enters a valid number
		while(income == 0.00){
			//prompt user of their yearly income
			System.out.println("What is your yearly income.");
	
			income = input.nextDouble();
				if(income >0.00) {
					System.out.println("you entered: $"+income);
					break;
				}else
					continue;
		}
		
		//close the scanner object 
		input.close();

		//calculate the user's tax by tax status and rate bracket.
		if (tax == 1) {//tax bracket for single status
			//check income for different ranges.
			if (income >= 0.00 && income < 8351.00) {
				income *= .10;
			} else if (income >= 9351.00 && income < 33951.00) {
				income *= .15;
			} else if (income >= 33951.00 && income < 82251.00) {
				income *= .25;
			} else if (income >= 82251.00 && income < 171551.00) {
				income *= .28;
			} else if (income >= 171551.00 && income < 372950.00) {
				income *= .33;
			} else {
				income *= .35;
			}

		} else if (tax == 2) {//tax bracket for married filed jointly status
			if (income >= 0.00 && income < 16701.00) {
				income *= .10;
			} else if (income >= 16701.00 && income < 67901.00) {
				income *= .15;
			} else if (income >= 67901.00 && income < 137051.00) {
				income *= .25;
			} else if (income >= 137051.00 && income < 208851.00) {
				income *= .28;
			} else if (income >= 208851.00 && income < 372951.00) {
				income *= .33;
			} else {
				income *= .35;
			}
		} else if (tax == 3) {//married filed seperately
			if (income >= 0.00 && income < 8351.00) {
				income *= .10;
			} else if (income >= 8351.00 && income < 33951.00) {
				income *= .15;
			} else if (income >= 33951.00 && income < 68526.00) {
				income *= .25;
			} else if (income >= 68526.00 && income < 104426.00) {
				income *= .28;
			} else if (income >= 104426.00 && income < 186476.00) {
				income *= .33;
			} else {
				income *= .35;
			}
		} else if (tax == 4) {//head of household
			if (income >= 0.00 && income < 11951.00) {
				income *= .10;
			} else if (income >= 11951.00 && income < 45501.00) {
				income *= .15;
			} else if (income >= 45501.00 && income < 117451.00) {
				income *= .25;
			} else if (income >= 117451.00 && income < 190201.00) {
				income *= .28;
			} else if (income >= 190201.00 && income < 372951.00) {
				income *= .33;
			} else {
				income *= .35;
			}
		}
		
		//print to console taxes due.
		System.out.printf("Your taxes due for the year is: %f", income);
		

	}

}
