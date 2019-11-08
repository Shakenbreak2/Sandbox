package assignments;

import java.util.Scanner;

public class AllAboutMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Darril", eyes, teeth, hair;
		int age, height;
		double cm;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		name=input.next();
		System.out.println("What is your eye color?");
		eyes=input.next();
		System.out.println("What color are your teeth?");
		teeth=input.next();
		System.out.println("What color is your hair?");
		hair=input.next();
		System.out.println("How old are you?");
		age=input.nextInt();
		System.out.println("How tall are you in inches?");
		height=input.nextInt();
		
		cm=(double)height*2.54;
		
		
		System.out.printf("Let's talk about %s.\r\n" + 
				"They're %d inches tall.\r\n" + 
				"That would be %f centimeters. \r\n" +
				"They're %d years old.\r\n" + 
				"Huh, that's older than I expected...\r\n" + 
				"They have %s eyes and %s hair.\r\n" + 
				"Their teeth are usually %s, but it depends on the coffee.\r\n" + 
				"Alright, this is pretty boring. Let's stop talking about %s.\r\n", name,height,cm,age,eyes,hair,teeth,name);
		System.out.println("Let's talk about "+name+".\r\n" + 
				"They're "+height+" inches tall.\r\n" + 
				"That would be "+cm+" centimeters. \r\n" +
				"They're "+age+" years old.\r\n" + 
				"Huh, that's older than I expected...\r\n" + 
				"They have "+eyes+" eyes and "+hair+" hair.\r\n" + 
				"Their teeth are usually "+teeth+", but it depends on the coffee.\r\n" + 
				"Alright, this is pretty boring. Let's stop talking about "+name+".\r\n");
		
		input.close();
	}

}
