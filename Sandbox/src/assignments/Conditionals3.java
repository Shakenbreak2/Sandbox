package assignments;

import java.util.Scanner;

public class Conditionals3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conditionals3 act = new Conditionals3();
		act.seasons();

	}

//	4. Season from Month and Day
//
//	The year is divided into four seasons: spring, summer, fall and winter. While the
//	exact dates that the seasons change vary a little bit from year to year because of the
//	way that the calendar is constructed, we will use the following dates for this exercise:
//
//	Season | First day
//	Spring | March 20
//	Summer | June 21
//	Fall   | September 22
//	Winter | December 21
//
//	Create a program that reads a month and day from the user. The user will enter
//	the name of the month as a string, followed by the day within the month as an
//	integer. Then your program should display the season associated with the date that
//	was entered.
	private void seasons() {
		//create scanner and assign it as IN variable
		Scanner in = new Scanner(System.in);
		
		//prompts user for a month
		System.out.println("Welcome, we will check what season a day is on. " + "\nPlease enter a Month");
		String month = in.next().toLowerCase().trim();

		int day = 0;//initialize day variable
		
		//loops until user inputs a valid day
		 do{
			System.out.println("Now enter a day of the month");
			day = in.nextInt();
		}while (day < 0 || day > 31);
		 
		 //check season the month and day fall under.
		switch (month) {
		case "january":System.out.println("Season is winter");break;
		case "febuary":System.out.println("Season is winter");break;
		case "march":
			if (day >= 20)
				System.out.println("Season is spring");
			else
				System.out.println("Season is winter");break;
		case "april":System.out.println("Season is spring");break;
		case "may":System.out.println("Season is spring");break;
		case "june":
			if (day >= 21)
				System.out.println("Season is summer");
			else
				System.out.println("Season is spring");break;
		case "july":System.out.println("Season is summer");break;
		case "august":System.out.println("Season is summer");break;
		case "september":
			if (day >= 22)
				System.out.println("Season is autumn");
			else
				System.out.println("Season is summer");break;
		case "october":System.out.println("Season is autumn");break;
		case "november":System.out.println("Season is autumn");break;
		case "december":
			if (day >= 21)
				System.out.println("Season is winter");
			else
				System.out.println("Season is autumn");break;
		default:System.out.printf("you did not read and enter a month");
		}
		in.close();
	}

}
