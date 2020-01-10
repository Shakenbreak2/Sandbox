package com.perscholas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentScores {
static List<Integer> scores= new ArrayList<Integer>();

static Scanner in = new Scanner(System.in);
static int sum;
static double avg;

	/*Using a constructor to initialize 
	 * the values of sum and avg.
	 * */
	public StudentScores() {
		sum = 0;
		avg = 0.0;
	}
	
	/*Input the number of students to use as a counter for inputing into array
	 * then call the @StudentScores method to enter the scores into array
	 * close the scanner object
	 * loop to get the sum of all elements in scores array
	 * find the average score by dividing sum by array size
	 * display sum and avg*/
	public static void main(String[] args) {
		
		//input array size
		System.out.println("please enter the number of students");
		
		//method for inputing elements into array
		 StudentScores(in.nextInt());
		
		 //close scanner
		 in.close();
		 
		 //find sum
		 for(int i: scores)
			 sum+=i; 
		 
		 //find avg
		 avg=(double)sum/scores.size();
		 
		 //display results
		 System.out.printf("class sum of the scores is %d, class avg is %.2f", sum, avg);
	}

	//method that is used for inputing elements into scores array
	private static void StudentScores(int size) {
		// add elements to the array
		
		for(int i=0; i<size;i++) {
			System.out.println("now enter score for student: "+(i+1));
			scores.add(in.nextInt());
		}
	}

}
