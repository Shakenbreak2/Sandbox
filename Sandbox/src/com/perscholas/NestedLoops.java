package com.perscholas;

public class NestedLoops {

	public static void main(String[] args) {
		int n=20;
		int[] array=new int[n];
		for(int x=0;x<n;x++) {
			array[x]=(int)(Math.random()*100);
			System.out.print(array[x]+" ");
		}
		for (int i = 0; i < n; i++) {
	        int min = array[i];
	        int minId = i;
	        for (int j = i+1; j < n; j++) {
	            if (array[j] < min) {
	                min = array[j];
	                minId = j;
	            }
	        }
	        // swapping
	        int temp = array[i];
	        array[i] = min;
	        array[minId] = temp;
	    }
		System.out.println("");
		for(int z=0;z<n;z++)
			System.out.print(array[z]+" ");
	}

}
