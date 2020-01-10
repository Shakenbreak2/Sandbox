package assignments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CafeContinue {

//public variables	
	static Scanner input = new Scanner(System.in);
	static int coffee, tea, sandwiches, orderCount;
	static double coffeeCost, teaCost, sandCost;
	static List<Integer> orderC = new ArrayList<Integer>();
	static LinkedList<Integer> orderT = new LinkedList<Integer>();
	static List<Integer> orderS = new ArrayList<Integer>();
	static List<Double> cost = new ArrayList<Double>();
	static List<String> name = new ArrayList<String>();
	static boolean quit = false;

//==============
//this is a constructor, it only initializes the declared variables from above
	public CafeContinue() {
		coffee = 0;
		tea = 0;
		sandwiches = 0;
		orderCount = 0;
		coffeeCost = 0;
		teaCost = 0;
		sandCost = 0;
	}

	/* here I am resetting the initial values of the counters to be used again */
	private static void resetValues() {
		coffee = 0;
		tea = 0;
		sandwiches = 0;

		coffeeCost = 0;
		teaCost = 0;
		sandCost = 0;
		quit = false;
	}

//main method	
	public static void main(String[] args) {

		String order;

		/*
		 * this is the first while loop it displays: order, print, quit this is the
		 * first menu that you get
		 */
		do {
			// prompt user to input String for action to do
			System.out.println("What do you wish to do:" + "\norder" + "\nprint" + "\nquit");

			order = input.next().toLowerCase().trim();

			// the switch-case here executes the action
			// corrilating from the input from above
			switch (order) {
			/*
			 * this option gets a name from user and inputs it into name arraylist
			 * 
			 * @resetValues :resets the values from the declarations to be used again
			 * 
			 * @order :set in a while loop to continue performing until user wants to exit
			 */
			case "order": {

				// orderCount is used to keep track of how many orders were made
				orderCount += 1;
				System.out.println("name for your order: ");
				name.add(input.next());
				
				//resets declared values
				resetValues();
				// ordering loop
				do {
					quit = order(quit);

					// performs ordering and returns a boolean to either quit ordering or order
					// again
				} while (quit==false);
				break;
			}

			/*
			 * print takes the values stored in the arrays arranged by person who ordered,
			 * then the amount of items that person ordered
			 */
			case "print": {

				// output final order

				for (int i = 0; i < orderCount; i++) {
					System.out.printf("Name: %s - coffee(s): %d - tea(s): %d - sandwiches: %d - total: %.2f",
							name.get(i), orderC.get(i), orderT.get(i), orderS.get(i), cost.get(i));
					System.out.println();
				}
				break;

			}
			// quits program
			case "quit": {
				// closing scanner
				input.close();
//				exit = true;
				break;
			}
			// loops back to beginning if user did not put one of the set values
			default:
				System.out.println("not valid option");
			}
		} while (order == "quit");

	}

//order loop
	private static boolean order(boolean quit) {
		String menu;

		System.out.println("Welcome to my cafe please choose from our menu." + "\n1)coffee $1.50/e" + "\n2)tea $1.50/e"
				+ "\n3)sandwiches $2.50/e" + "\nq)quit");

		menu = input.next().toLowerCase().trim();

		/*@coffee : method gets order for coffee
		 * @tea : method gets order for tea
		 * @sandwiches : method gets order for sandwiches
		 * adds total number of coffee, tea, sandwiches into their
		 * appropriate array. 
		 * calculate total cost into cost array*/
		switch (menu) {
		case "1":
			coffee();
			break;
		case "2":
			tea();
			break;
		case "3":
			sandwiches();
			break;
		case "q":
			orderC.add(coffee);
			orderT.add(tea);
			orderS.add(sandwiches);
			// calculate total cost
			cost.add((coffeeCost + teaCost + sandCost));
			quit = true;
			break;
		default:
			System.out.println("enter a valid option.");
		}
		return quit;
	}

//add coffee	
	private static void coffee() {
		System.out.println("how many coffees do you want?");
		int amount = input.nextInt();// enter amount of coffee wanted
		coffee += amount;// add the amount to total coffee
		coffeeCost += (amount * 1.5);// add to total cost of coffee order
		System.out.printf("you ordered %d coffee(s)\n", coffee);
		// return coffee;
	}

//add tea	
	private static void tea() {
		System.out.println("how many teas do you want?");
		int amount = input.nextInt();
		tea += amount;
		teaCost += (amount * 1.5);
		System.out.printf("you ordered %d tea(s)\n", tea);
		// return tea;
	}

//add sandwiches	
	private static void sandwiches() {
		System.out.println("how many sandwiches do you want?");
		int amount = input.nextInt();
		sandwiches += amount;
		sandCost += (amount * 2.5);
		System.out.printf("you ordered %d sandwiche(s)\n", sandwiches);
		// return sandwiches;
	}

}
