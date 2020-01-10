package com.perscholas;

public class NestedLoopsMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		
		for(int i=1;i<=12;i++) {
			for(int j=1;j<=12;j++) {
				num1=i;
				num2=j;
				System.out.printf("%d * %d = %d \n",num1,num2, num1*num2);
			}
			System.out.println(" ");
		}
		
	}

}
