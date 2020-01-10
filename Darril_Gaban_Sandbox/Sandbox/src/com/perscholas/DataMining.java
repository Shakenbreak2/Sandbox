package com.perscholas;

import java.util.Scanner;

public class DataMining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the following information so I can sell it for a profit!\n");
		
		System.out.println("Hello moneybag what is your first name? ");
		Scanner input = new Scanner(System.in);
		String fname= input.next();
		
		System.out.println("And your last name? ");
		String lname= input.next();
		
		System.out.println("What grade are you in moneybag?");
		int gradeLevel = input.nextInt();
		
		System.out.println("And your student ID? (ex. 123456)");
		int studentID = input.nextInt();
		
		System.out.println("What is you login name?");
		String login = input.next();
		
		System.out.println("What is your GPA? (0.0-4.0)");
			double gpaNumber = input.nextDouble();
//			if(gpaNumber<0.0 && gpaNumber>4.0) {
//				System.out.println("please enter a number between 0.0-4.0");
//				gpa = new Scanner(System.in);
//			}
		
		
		System.out.println("Your Information: \n"
							+"Login: "+ login+"\n"
							+"ID: "+studentID+"\n"
							+"Name: "+fname+", "+lname+"\n"
							+"GPA: "+gpaNumber+"\n"
							+"Grade: "+gradeLevel);
		
		input.close();
	
		
	}

}
