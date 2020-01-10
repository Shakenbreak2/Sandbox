package com.perscholas;

public class TwoDArray {

	public static void main(String[] args) {
		// declare 2d array, row: 3, column: 5
		int arr[][] = new int[3][5];

		// populate array with random numbers from 0-9
		for (int i = 0; i < arr.length; i++) {// loop row
			for (int j = 0; j < arr[i].length; j++) {// loop column
				arr[i][j] = (int) (Math.random() * 10);// fill array with random number from 0-9
			}
		}

		// print to console arr
		for (int[] x : arr) {// loop row
			for (int y : x) {// loop column
				System.out.print(y + " ");// print value in row & column
			}
			System.out.println();// go to next row
		}
		/**
		 * expected result: 
		 * 0 0 0 0 0 
		 * 0 0 0 0 0 
		 * 0 0 0 0 0
		 */
	}

}
