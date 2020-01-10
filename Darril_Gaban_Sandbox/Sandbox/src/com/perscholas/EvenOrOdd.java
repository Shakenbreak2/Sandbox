package com.perscholas;

public class EvenOrOdd {

	public static void main(String[] args) {
		int number;
		number = (int)( Math.random()*100);
		System.out.println(number);
		
		
		switch(number%2) {
		case 0:System.out.println("number is even");break;
		case 1:System.out.println("number is odd");break;
		}
		
		if(number%2 == 0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}
	}

}
