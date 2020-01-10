package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ExamAverages {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Double> exam1=new ArrayList<Double>();
		ArrayList<Double> exam2=new ArrayList<Double>();
		double sum=0.0 ,sum2 =0.0, avg1, avg2, avg3;
		
		for(int i=0;i<5;i++) {
			System.out.println("Exam 1 test: "+(i+1));
			exam1.add(input.nextDouble());
		}
		for(int j=0;j<5;j++) {
			System.out.println("Exam 2 test: "+(j+1));
			exam2.add(input.nextDouble());
		}
		
		for(int k=0;k<5;k++) {
			sum+=exam1.get(k);
			sum2+=exam2.get(k);
		}
		avg1=sum/5;
		avg2=sum2/5;
		avg3=(sum+sum2)/10;
		System.out.println("class average for exam 1 is: "+avg1);
		System.out.println("class average for exam 2 is: "+avg2);
		System.out.println("class average for total exam scores is: "+avg3);

		input.close();
	}
	


}
