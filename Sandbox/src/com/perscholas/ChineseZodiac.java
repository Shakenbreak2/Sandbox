package com.perscholas;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a year:");
		int year = input.nextInt();
		
		int zodiac = year % 12;
		
		ChineseZodiac zodiac1 = new ChineseZodiac();
		
		System.out.println("which option do you wish to use? 1, 2, 3");
		int choose = input.nextInt();
		switch(choose){
			case 1:zodiac1.ifElse(zodiac);break;
			case 2:zodiac1.switchCase(zodiac);break;
			case 3:zodiac1.arrayH(zodiac);break;
		}
		input.close();
	}
	
	private void ifElse(int j)
	{
		if(j==0) {
			System.out.println("The zodiac of this year is: monkey");
		}else if(j==1) {
			System.out.println("The zodiac of this year is: rooster");
		}else if(j==2) {
			System.out.println("The zodiac of this year is: dog");
		}else if(j==3) {
			System.out.println("The zodiac of this year is: pig");
		}else if(j==4) {
			System.out.println("The zodiac of this year is: rat");
		}else if(j==5) {
			System.out.println("The zodiac of this year is: ox");
		}else if(j==6) {
			System.out.println("The zodiac of this year is: tiger");
		}else if(j==7) {
			System.out.println("The zodiac of this year is: rabbit");
		}else if(j==8) {
			System.out.println("The zodiac of this year is: dragon");
		}else if(j==9) {
			System.out.println("The zodiac of this year is: snake");
		}else if(j==10) {
			System.out.println("The zodiac of this year is: horse");
		}else if(j==11) {
			System.out.println("The zodiac of this year is: sheep");
		}
	}
	private void switchCase(int i)
	{
		switch(i) {
		case 0:System.out.println("The zodiac of this year is: monkey");break;
		case 1:System.out.println("The zodiac of this year is: roster");break;
		case 2:System.out.println("The zodiac of this year is: dog");break;
		case 3:System.out.println("The zodiac of this year is: pig");break;
		case 4:System.out.println("The zodiac of this year is: rat");break;
		case 5:System.out.println("The zodiac of this year is: ox");break;
		case 6:System.out.println("The zodiac of this year is: tiger");break;
		case 7:System.out.println("The zodiac of this year is: rabbit");break;
		case 8:System.out.println("The zodiac of this year is: dragon");break;
		case 9:System.out.println("The zodiac of this year is: snake");break;
		case 10:System.out.println("The zodiac of this year is: horse");break;
		case 11:System.out.println("The zodiac of this year is: sheep");break;
		}
	}
	
	private void arrayH(int year) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
//        int year = input.nextInt();
        input.close();
        String[] zodiac = {"Monkey","Rooster","Dog","Pig","Rat","Ox", "Tiger","Rabbit","Dragon", "Snake", "Horse", "Sheep"};      
        System.out.println(zodiac[year]);

	}

}
