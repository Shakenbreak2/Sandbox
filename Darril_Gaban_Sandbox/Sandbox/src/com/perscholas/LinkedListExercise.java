package com.perscholas;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bookNum;
		LinkedList<String> book = new LinkedList<String>();
//		LinkedList<String> bookAuthor = new LinkedList<String>();
//		LinkedList<Integer> isbn = new LinkedList<Integer>();
		
		
		System.out.println("How many books are there");
		bookNum= Integer.parseInt(input.next());// input string -convert-> int, enter into bookNum

		//loop input into book list
		for(int i=0;i<bookNum;i++) {
			System.out.println("what is the book tile");
			book.add(input.nextLine().trim());
			System.out.println("Who is the book author");
			book.add(input.nextLine().trim());
			System.out.println("What is the book ISBN");
			book.add(input.next());
		}

		//output
		for(int i=0;i<book.size(); i+=3) {
			System.out.println("title: "+book.get(i)+" author: "+book.get(i+1)+" ISBN: "+book.get(i+2));
		}
		
		input.close();
	}

}
