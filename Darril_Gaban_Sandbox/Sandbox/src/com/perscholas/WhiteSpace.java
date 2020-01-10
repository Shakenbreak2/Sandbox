package com.perscholas;

import java.util.Scanner;

public class WhiteSpace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean f=false;
		while(f==false) {
			String s=input.nextLine();
			if(s.contains(" ")) {
				System.out.println(s);
				break;
			}else
				continue;
		}
	}

}
