package test.sandbox;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassExercise {
	static String item_name;
	static double item_price;
	static int item_quanity;
	static Map<String, Integer> cart = new HashMap<String, Integer>();
	static Scanner input = new Scanner(System.in);
	static boolean quit;
	
//constructor
	public ClassExercise() {
		item_name = "";
		item_price = 0.0;
		item_quanity = 0;
		quit=false;
	}

//main method
	public static void main(String[] args) {

		String menu = "";
		do{
			System.out.println("Welcome to my cafe please choose from our menu." + "\n1)coffee $1.50/e"
					+ "\n2)tea $1.50/e" + "\n3)sandwiches $2.50/e" + "\n4)quit");

			menu = input.next().toLowerCase().trim();

			switch (menu) {
			case "1":
				add("coffee");
				break;
			case "2":
				add("tea");
				break;
			case "3":
				add("sandwiches");
				break;
			case "4":
				System.out.println("thankyou goodbye");
				for(Map.Entry<String, Integer> i: cart.entrySet()) {
					System.out.println(i.getKey()+" = "+i.getValue());
				};
				quit=true;
				break;
			default:
				System.out.println("enter a valid option.");
			}
		}while (quit==false); 

	}

//add to cart method	
	private static void add(String s) {
		System.out.printf("how many %s do you want?",s);
		int amount =0;
		amount = input.nextInt();
		
			if(cart.containsKey(s)) {
				//cart.merge(s, amount, 0);
				amount+=cart.get(s);
				cart.put(s, amount);
			}else
				cart.put(s, amount);
		System.out.println("your order: "+cart.get(s)+" "+s);		
		
	}

}
