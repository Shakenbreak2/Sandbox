package assignments;

import java.util.Scanner;

public class CommaSeperatedValues {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a word and end it with ','");
		
		String in=scan.nextLine();
		//String newS= in.replaceAll(",","");//place word without comma into array
		
		String[] s = in.split(", ");//turns string sentence into array of words
		
			scan.close();
		
		//display array
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}

//	//removes , from the input string
//	static String removeComma(String st) {
//		String string = st.replaceAll(",", " ");
//
//		return string;
//	}

}
