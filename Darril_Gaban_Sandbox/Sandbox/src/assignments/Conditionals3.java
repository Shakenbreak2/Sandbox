package assignments;

import java.util.Scanner;

public class Conditionals3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1) shapes \n2)months Names and their days \n3)triangles \n4)seasons");
		int in=input.nextInt();
		
		switch(in) {
		case 1:shapes();break;
		case 2:monthNametoDays();break;
		case 3:triangles();break;
		case 4:seasons();break;
		}
		
		input.close();
	}
//	1. Name that shape
//	Write a program that determines the name of a shape from its number of sides. Read
//	the number of sides from the user and then report the appropriate name as part of
//	a meaningful message. Your program should support shapes with anywhere from 3
//	up to (and including) 10 sides. If a number of sides outside of this range is entered
//	then your program should display an appropriate error message.
//
//	3 Sides = Triangle
//	4 Sides = Quadrilateral
//	5 Sides = Pentagon
//	6 Sides = Hexagon
//	7 Sides = Heptagon
//	8 Sides = Octagon
//	9 Sides = Nonagon
//	10 Sides = Decagon

	private static void shapes() {
		Scanner input = new Scanner(System.in);
		int sides = input.nextInt();
		
		switch(sides) {
		case 3: System.out.println("Triangle");
		case 4: System.out.println("Quadrilateral");
		case 5: System.out.println("Pentagon");
		case 6: System.out.println("Hexagon");
		case 7: System.out.println("Heptagon");
		case 8: System.out.println("Octagon");
		case 9: System.out.println("Nonagon");
		case 10: System.out.println("Decagon");
		default: System.out.println("Not valid input for this program");
		}
	}
//	2. Month Name to Number of Days
//
//	The length of a month varies from 28 to 31 days. In this exercise you will create
//	a program that reads the name of a month from the user as a string. Then your
//	program should display the number of days in that month. Display "28 or 29 days"
//	for February so that leap years are addressed.
	private static void monthNametoDays() {
		Scanner input = new Scanner(System.in);
		String month=input.next();
		switch(month) {
		case "January":System.out.println("There are 31 days");
		case "Febuary":System.out.println("There are 28 or 29 days");
		case "March":System.out.println("There are 31 days");
		case "April":System.out.println("There are 30 days");
		case "May":System.out.println("There are 31 days");
		case "June":System.out.println("There are 30 days");
		case "July":System.out.println("There are 31 days");
		case "August":System.out.println("There are 31 days");
		case "September":System.out.println("There are 30 days");
		case "October":System.out.println("There are 31 days");
		case "Novemver":System.out.println("There are 30 days");
		case "December":System.out.println("There are 31 days");
		}
	}
//	3. Name that Triangle
//
//	A triangle can be classified based on the lengths of its sides as equilateral, isosceles
//	or scalene. All 3 sides of an equilateral triangle have the same length. An isosceles
//	triangle has two sides that are the same length, and a third side that is a different
//	length. If all of the sides have different lengths then the triangle is scalene.
//
//	Write a program that reads the lengths of 3 sides of a triangle from the user.
//	Display a message indicating the type of the triangle.
//
//	All sides are equal = Equilateral Triangle
//	2 Sides are equal = Isosceles Triangle
//	No sides are equal = Scalene
	private static void triangles() {
		Scanner input = new Scanner(System.in);
		int side1 = input.nextInt(), side2=input.nextInt(), side3=input.nextInt();
		
		if(side1==side2&&side1==side3)
				System.out.println("triangle is equilateral");
		else if(side1==side2||side1==side3||side2==side3)
			System.out.println("triagle is Isosceles");
		else
			System.out.println("triangle is scalene");
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
	private static void seasons() {
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
