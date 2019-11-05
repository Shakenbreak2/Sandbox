package assignments;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class PI {

	//private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//double pi = Math.PI;

		System.out.println("We are calculating the area of a circle, enter a radius: ");
		double radius = input.nextDouble();
		
		double circle = Math.PI*Math.pow(radius, 2);
		System.out.printf("The area of a circle with radius %f is %f", radius, circle);
		
		input.close();
	}

}
