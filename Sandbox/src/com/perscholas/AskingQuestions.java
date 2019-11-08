package com.perscholas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AskingQuestions {
	
private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String name;
		int age;
		double wage;
		
		System.out.println("Hello. What's your name?");
		Scanner nameIn=new Scanner(System.in);
		name = nameIn.next();
		
		System.out.println("Hi "+name+"! How old are you?");
		Scanner ageIn=new Scanner(System.in);
		age=ageIn.nextInt();
		
		System.out.println("So you're "+age+", eh? That's not old at all! \n"
							+ "How much do you make, "+name+"?");
		Scanner wageIn=new Scanner(System.in);
		wage=wageIn.nextDouble();
		System.out.println("$"+df2.format(wage)+"! That's really good for your "+age+"!");
	
		
		nameIn.close();
		ageIn.close();
		wageIn.close();
	}

}
