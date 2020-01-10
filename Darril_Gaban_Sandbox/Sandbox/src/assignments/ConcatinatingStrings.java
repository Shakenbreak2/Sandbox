package assignments;

import java.util.Scanner;

public class ConcatinatingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type in a sentence");
		String s =input.nextLine();
		System.out.println("Now type in another sentence");
		String s2 = input.nextLine();
		
		String s3 =s.concat(s2);
		System.out.println(s3);
		
		input.close();
	}

}
