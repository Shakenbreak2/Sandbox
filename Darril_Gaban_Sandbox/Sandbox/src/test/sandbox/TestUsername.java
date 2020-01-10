package test.sandbox;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class TestUsername {

	private static List<String> usernames = new ArrayList<String>();
	private static String name = "", newName = "";

	static Scanner input = new Scanner(System.in);

	static int i = 1, j=1;

	public static void main(String[] args) {

		boolean again = true;
		/**
		 * Create the username portion of a registration system that requires all
		 * usernames are unique. If a new user requests a name that is already used, an
		 * integer should be added to the end of the username to make it unique. The
		 * numbering begins with 1 and is incremented by 1 for each new instance per
		 * username.
		 * 
		 * As an example, if username requests were for [bob, alice, bob, alice, bob,
		 * alice], the system should assign usernames [bob, alice, bob1, alice1, bob2,
		 * alice2].
		 * 
		 * Given a list of username requests in the order given, process all requests
		 * and return an array of the usernames as assigned by the function.
		 * 
		 * Constraints
		 * 
		 * At least use one Data Structure from Java Collections or Map username
		 * contains only lowercase English letters in the range ascii[a-z].
		 * 
		 */

		do {

			System.out.println("hello enter your username, ");
			name = input.next().toLowerCase().trim();
			
			
			if (!usernames.contains(name)) {
				usernames.add(name);
				i=1;
			} else {
				
				
				System.out.println(name+" already used, trying "+name+i);
				if(check(name,i)) {
				usernames.add(newName);
				}

				
			}

			System.out.println(usernames);
			System.out.println("do you wish to enter another. yes, no");
			String f = input.next().toLowerCase().trim();
			switch(f) {
			case "yes":again=true;break;
			case "no":again=false;break;
			default:again=false;break;
			}

		} while (again == true);
		System.out.println("goodbye");

	}

	private static boolean check(String string, int j) {
		String name2 = string.concat(Integer.toString(j));
		if (!usernames.contains(name2)) {
			newName=name2;
			return true;
			
		} else if(usernames.contains(name2)){
			System.out.println("username already used trying: " + string+ ++j); 
			return check(string, j);
		}else
		return true;

	}
//==============================================================
	/**
	 * We use different compression techniques in order to reduce the size of the
	 * messages sent over the web. An algorithm is designed to compress a given
	 * string by describing the total number of consecutive occurrences of each
	 * character next to it. For example, consider the string "alaasass", we can
	 * group the consecutive occurrence of each character:
	 * 
	 * 'a' occurs one time. 'l' occurs one time. 'a' occurs two times consecutively.
	 * 's' occurs one time. 'a' occurs one time. 's' occurs two times consecutively.
	 * 
	 * If a character only occurs once, it is added to the compressed string. If it
	 * occurs consecutive times, the character is added to the string followed by an
	 * integer representing the number of consecutive occurrences. Thus the
	 * compressed form of the string is "ala2sas2".
	 * 
	 * Constraints
	 * 
	 * At least use one Data Structure from Java Collections or Map Sample input:
	 * abc baaccc Sample output: abc 3 abc 3 baaccc 6 ba2c3 5
	 * 
	 * Store and display each input string and it's length and output string and
	 * it's length after the operation. Explanation: None of the characters repeats
	 * consecutively so the string is already in compressed form.
	 * 
	 * 
	 */

	private String string, newString;
	private static char[] chop;
	private static ArrayList<String> map = new ArrayList<String>();
	// LinkedHashMap<String, Integer>();;
	private static  LinkedHashMap<String, Integer> uniqueword = new LinkedHashMap<String, Integer>();

//=====================================================	

//======================================================
	public String getter(String string) {
		return this.string;
	}

	public void setter(String string) {
		this.string = string.toLowerCase().trim();
	}
//===============================================

	public void arrayChop() {
		
		chop = string.toCharArray();
		char s1=chop[0];
		int counter=1;
		int index=0;
		System.out.println(string);
		
		
		for(int i=1;i<chop.length;i++) {
			
			if(s1==chop[i]) {
				counter++;
			}else if(s1!=chop[i]){
				if(counter == 1) {
					map.add(Character.toString(s1));
				}else if(counter >1) {
					uniqueword.put(Character.toString(s1), counter);
				}
				
				
				System.out.println(s1+" "+counter);
				s1=chop[i];
				counter=1;
						
			}else {
				continue;
			}
			
		}

//			for (int k = 0; k < string.length(); k++) {
//				int counter = 1;
//
//				char jw = string.charAt(k);
//				
//				
//				if (!uniqueword.containsKey(chop[k])) {
//					uniqueword.put(chop[k], 1);
//
//				} else {
//					if (!uniqueword.containsKey(chop[k])) {
//						uniqueword.put(chop[k], 1);
//					} else if (uniqueword.containsKey(chop[k])) {
//						//counter = uniqueword.get(k).get(jw);
//						uniqueword.put(chop[k], ++counter);
//					}
//
//				}
//				
//			}
			

		//}
		System.out.println(uniqueword);

	}

	public String getNewString() {
		
		newString = uniqueword.toString();


		return newString;

	}

	
	
	
	
	
}
