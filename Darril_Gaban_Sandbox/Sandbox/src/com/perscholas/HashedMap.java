package com.perscholas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashedMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		print(map);
		
		map.put("vish", 10);
		map.put("sasha", 20);
		map.put("vaibhav", 30);
		print(map);
		System.out.println(map.size());
		if(map.containsKey("vish")) {
			Integer a = map.get("vish");
			System.out.println("value for key \"vish\" is:- "+a);
			String s="hello";
			
		}
//		Scanner input = new Scanner(System.in);
//		int num = -1;
//		String str = "";
//
//		while (num != 0) {
//			System.out.println("Enter the number of Emp: ");
//			num = input.nextInt();
//			System.out.println("Enter the name of Emp: ");
//			str = input.next();
//
//			Employee.put(num, str);
//		}

	}
	public static void print(HashMap<String, Integer> map) {
		if(map.isEmpty()) {
			System.out.println("map is empty");
		}else
			System.out.println(map);
		map.put("hhh", 4444);
	}
}
