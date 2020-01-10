package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WorkGrading {

	//create Scanner object
	static Scanner in = new Scanner(System.in);

	// Create grading system
	private static HashMap<String, Integer> aTable = new HashMap<String, Integer>();
	private static HashMap<String, Integer> bTable = new HashMap<String, Integer>();
	private static HashMap<String, Integer> cTable = new HashMap<String, Integer>();
	private static HashMap<String, Integer> dTable = new HashMap<String, Integer>();
	private static HashMap<String, Integer> fTable = new HashMap<String, Integer>();

	// student and grade maps
	private static HashMap<String, ArrayList<Integer>> studentTable = new HashMap<String, ArrayList<Integer>>();
	private static HashMap<String, Integer> gradeTable = new HashMap<String, Integer>();
	
//=============End of Declarations=================
	
	public static void main(String[] args) {
		//declare name, grade, and loop condition
		String name = "";
		int grade;
		int enter = 1;

		//loop to enter students and all their scores
		do {
			//prompt for student name and score
			System.out.println("enter student first name.");
			name = in.next();
			System.out.println("enter student score:");
			grade = in.nextInt();

			//enter student name and their score into table
			addStudent(name, grade);

			//prompt if want to enter another student and score
			System.out.println("enter another score? (1=yes, 2=no");
			enter = in.nextInt();

		} while (enter == 1);

		//print student table
		System.out.println(studentTable);

		//get avg score for each student and put that into new hashmap gradeTable
		for (HashMap.Entry<String, ArrayList<Integer>> map : studentTable.entrySet()) {

			calcGrade(map.getKey(), map.getValue());

		}
		
		//print gradeTable
		System.out.println(gradeTable);

		//sort each entry of gradeTable into different tables of their own grade averages.
		sortStudent(gradeTable);

		//print out all grade tables.
		System.out.println("A list: " + aTable);

		System.out.println("B list: " + bTable);

		System.out.println("C list: " + cTable);

		System.out.println("D list: " + dTable);

		System.out.println("F list: " + fTable);

	}

//============End Main Method===============

	private static void addStudent(String name, int grade) {

		ArrayList<Integer> newGrade = studentTable.get(name);
		
		//if newGrade name is null, add new entry
		if (newGrade == null) {
			newGrade = new ArrayList<Integer>();
			newGrade.add(grade);
			studentTable.put(name, newGrade);
		} else { //else if newGrade entry has entry, attach entry
			if (!newGrade.contains(grade))
				newGrade.add(grade);
		}

	}

//============End addStudent===================

	private static void calcGrade(String name, ArrayList<Integer> arrayList) {
		int sum = 0; //intialize sum
		for (Integer i : arrayList) {
			//get sum of all the grades of student
			sum += i;
		}
		//find avg of the student grade
		int avg = sum / arrayList.size();

		//put avg into new HashMap: gradeTable with new entry of student name
		gradeTable.put(name, avg);
	}

//==============End calcGrade==================	

	private static void sortStudent(Map<String, Integer> map) {
		
		//loop through Map: gradeTable and sort each score 
		//into different tables of different score averages
		for (Map.Entry<String, Integer> i : map.entrySet()) {

			if (i.getValue() >= 90) {
				System.out.println(i.getKey() + " class score: " + i.getValue() + " grade: A");
				aTable.put(i.getKey(), i.getValue());
			} else if (i.getValue() >= 80 && i.getValue() < 90) {
				System.out.println(i.getKey() + " class score: " + i.getValue() + " grade: B");
				bTable.put(i.getKey(), i.getValue());
			} else if (i.getValue() >= 70 && i.getValue() < 80) {
				System.out.println(i.getKey() + " class score: " + i.getValue() + " grade: C");
				cTable.put(i.getKey(), i.getValue());
			} else if (i.getValue() >= 60 && i.getValue() < 70) {
				System.out.println(i.getKey() + " class score: " + i.getValue() + " grade: D");
				dTable.put(i.getKey(), i.getValue());
			} else if (i.getValue() >= 00 && i.getValue() < 60) {
				System.out.println(i.getKey() + " class score: " + i.getValue() + " grade: F");
				fTable.put(i.getKey(), i.getValue());
			}
		}
	}
	
//============End sortStudent===============	
	
}
