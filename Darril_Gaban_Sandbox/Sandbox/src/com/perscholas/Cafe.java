package com.perscholas;

import java.util.Scanner;

public class Cafe {
//public variables	
	static Scanner input = new Scanner(System.in);
	static int coffee = 0, tea = 0, sandwiches = 0; 
	static double cost=0.00,coffeeCost = 0,teaCost = 0,sandCost = 0;
	 
//==============
//main method	
	public static void main(String[] args) {
		
		boolean quit=false;
		
		//ordering loop
		do {
		quit=order(quit);
		//performs ordering and returns a 
		//boolean to either quit ordering or order again
		}while(quit==false);
		
		//calculate total cost
		cost = coffeeCost+teaCost+sandCost;
		//closing scanner
		input.close();
		//output final order
		System.out.printf("Here is your order. "
				+ "\n%d coffees - $%.2f,\n%d teas - $%.2f,\n%d sandwiches - $%.2f \n"
				+ "your total is %.2f",coffee,coffeeCost,tea,teaCost,sandwiches,sandCost,cost);
	}

//order loop
	static boolean order(boolean quit) {
		String menu;
		
		System.out.println("Welcome to my cafe please choose from our menu."
				+ "\n1)coffee $1.50/e"
				+ "\n2)tea $1.50/e"
				+ "\n3)sandwiches $2.50/e"
				+ "\nq)quit");
		
		menu = input.next().toLowerCase().trim();
		
		switch(menu) {
		case "1":coffee();break;
		case "2":tea();break;
		case "3":sandwiches();break;
		case "q":quit=true;break;
		default: System.out.println("enter a valid option.");
		}
		return quit;
	}

//add coffee	
	static void coffee() {
		System.out.println("how many coffees do you want?");
		int amount=input.nextInt();//enter amount of coffee wanted
		coffee+=amount;//add the amount to total coffee
		coffeeCost+=(amount*1.5);//add to total cost of coffee order
		System.out.printf("you ordered %d coffee(s)\n",coffee);
		//return coffee;
	}
	
//add tea	
	static void tea() {
		System.out.println("how many teas do you want?");
		int amount=input.nextInt();
		tea+=amount;
		teaCost+=(amount*1.5);
		System.out.printf("you ordered %d tea(s)\n",tea);
		//return tea;
	}
	
//add sandwiches	
	static void sandwiches() {
		System.out.println("how many sandwiches do you want?");
		int amount=input.nextInt();
		sandwiches+=amount;
		sandCost+=(amount*2.5);
		System.out.printf("you ordered %d sandwiche(s)\n",sandwiches);
		//return sandwiches;
	}

}
