package assignments;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		boolean t = false;
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Which program do you wish to run?"
				+ "\n1)Cats"
				+ "\n2)Legal Problems"
				+ "\n3)Cars or Buses"
				+ "\n4)Legal Case"
				+ "\n5)Day of the Week"
				+ "\n6)Space Weight");
		
		while(t==false) {
			int x = input2.nextInt();
			IfStatement statement =new IfStatement();
				switch(x) {
				case 1:statement.cats();t=true;break;
				case 2:statement.legalProblem();t=true;break;
				case 3:statement.carsOrBuses();t=true;break;
				case 4:statement.legalCase();t=true;break;
				case 5:statement.dayOfTheWeek();t=true;break;
				case 6:statement.spaceWeight();t=true;break;
					default:System.out.println("Choose again");
				}
		}
		input2.close();
	}
	
	private void cats() {
		
		int people=1, cats=1, dogs = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many people, cats, and dogs are there.");
		people = input.nextInt();
		cats = input.nextInt();
		dogs = input.nextInt();
	
		input.close();
		if(people<cats) {
			System.out.println("Too many cats! The world is doomed!");
		}else if(people>cats) {
			System.out.println("Too few cats! The world is saved for another day!");
		}else {
			System.out.println("Everything is in balance, as all things should be");
		}
		if(people<dogs) {
			System.out.println("The world is drooled on!");
		}else if(people>dogs) {
			System.out.println("The world is dry!");
		}else {
			System.out.println("Everything is in balance, as all things should be");
		}
		
	}
	
	private void legalProblem() {
		Scanner input = new Scanner(System.in);
		System.out.println("Hello what is your name?");
		String name = input.next().trim();
		System.out.printf("how old are you %s?", name);
		int age = input.nextInt();
		input.close();
			if(age<16){
				System.out.println("You cannot drive, ");
			}
			if(age<18) {
				System.out.println("You cannot vote, ");
			}
			if(age<25) {
				System.out.println("You cannot rent a car ");
			}
			if(25<age) {
				System.out.printf("You can do anything legal.", name);
			}
			
	}
	
	private void carsOrBuses() {
		int people=12, cars=16, buses=18;
		
		if(people<cars) {
			System.out.println("We should take the cars");
		}else if(people>cars) {
			System.out.println("We should not take the cars");
		}else {
			System.out.println("We cannot decide");
			
		}
		
		if(cars<buses) {
			System.out.println("There are too many buses");
		}else if(cars>buses) {
			System.out.println("We should take the buses");
		}else {
			System.out.println("Still can't decide");
			
		}
		
		if(people<buses) {
			System.out.println("Alright lets just take the buses");
		}else {
			System.out.println("Lets just take the cars");
		}
	}
	
	private void legalCase() {
		Scanner input = new Scanner(System.in);
		System.out.println("Hello what is your name?");
		String name = input.next().trim();
		System.out.printf("how old are you %s?", name);
		int age = input.nextInt();
		
		input.close();
		
			if(age<16)
				System.out.printf("You cannot drive, %s", name);
			else if(16<=age && age<18) 
				System.out.printf("You cannot vote, %s", name);
			else if(18<=age && age<25) 
				System.out.printf("You cannot rent a car %s.", name);
			else if(25<age) 
				System.out.printf("You can do anything legal.", name);
			
			
	}
	
	private void dayOfTheWeek() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an interger from 1-7.");
		int num=input.nextInt();
		
		input.close();
		if(num==1) {
			System.out.println("day is Sunday");
		}else if(num==2) {
			System.out.println("day is Monday");
		}else if(num==3) {
			System.out.println("day is Tuesday");
		}else if(num==4) {
			System.out.println("day is Wensday");
		}else if(num==5) {
			System.out.println("day is Thursday");
		}else if(num==6) {
			System.out.println("day is Friday");
		}else if(num==7) {
			System.out.println("day is Saturday");
		}else {
			System.out.println("number out of bounds");
		}
	}
	
	private void spaceWeight() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your weight on Earth. (kg)");
		double mass = input.nextDouble();
		
		double weightVenus = mass * .78,
				weightMars = mass * .39,
				weightJupiter = mass * 2.65,
				weightSaturn = mass * 1.17,
				weightUranus = mass * 1.05,
				weightNeptune = mass * 1.23;
		
		System.out.println("I have your weight on the following planets."
				+ "\n1)Venus"
				+ "\n2)Mars"
				+ "\n3)Jupiter"
				+ "\n4)Saturn"
				+ "\n5)Uranus"
				+ "\n6)Neptune"
				+ "\nWhich planet are you visiting");
		
		int choice = input.nextInt();
		input.close();
		
		switch(choice) {
		case 1:System.out.printf("Your weight on Venus is: %f",weightVenus);break;
		case 2:System.out.printf("Your weight on Mars is: %f",weightMars);break;
		case 3:System.out.printf("Your weight on Jupiter is: %f",weightJupiter);break;
		case 4:System.out.printf("Your weight on Saturn is: %f",weightSaturn);break;
		case 5:System.out.printf("Your weight on Uranus is: %f",weightUranus);break;
		case 6:System.out.printf("Your weight on Neptune is: %f",weightNeptune);break;
		default:System.out.printf("choice not within bounds");break;
		}
		
	}
}
