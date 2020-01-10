package com.perscholas;

import java.util.Scanner;

public class TicTac {
static char[][] board=new char[3][3];


	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		boolean winCondition=false;
		char[] c= {'a','b','c','d'};
		String s="";
		
		
		
		System.out.println(s);
		
		
		
//		while(winCondition==false) {
//			System.out.println("player 1 play");
//			if(winCon(board)) {
//				winCondition=true;
//			}else {
//				winCondition=false;
//			}
//			
//			
//			
//		}
	}
	
//	static boolean winCon(char[][] board2[][]) {
//		int x=0;
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				if(board2[i][j] =='x') {
//					x++;
//					if(x=3) {
//						return true;
//					}
//				}
//			}
//		}
//		
//		return false;
//	}

}
