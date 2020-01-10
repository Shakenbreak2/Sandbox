package test.sandbox;
import java.util.Scanner;


public class Array3D {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
    //  int total = 0;
        
        //prompt user for inputs
        System.out.println("Please enter the number of classes");
        int clsNo = input.nextInt();
        System.out.println("Please enter the number of student");
        int studNo = input.nextInt();
        System.out.println("Please enter the number of scores for each student");
        int scoreNo = input.nextInt();
        
        //arrays
        int cls[] = new int[clsNo];
        String studname[][] = new String[clsNo][studNo];
        int studscore[][][] = new int[clsNo][studNo][scoreNo];
        
        //enter elements for arrays
        for (int t = 0; t < clsNo; t++) {
            System.out.println("Please provide the class name");
            cls[t] = input.nextInt();
            for (int r = 0; r < studNo; r++) {
                System.out.println("Please provide the student name of class: "+cls[t]);
                studname[t][r] = input.next();
                for (int c = 0; c < scoreNo; c++) {
                    System.out.println("Please provide the score #"+(c+1)+" for "+studname[t][r]);
                    studscore[t][r][c] = input.nextInt();
                }
            }
        }
        
        //output results
        for (int t = 0; t < cls.length; t++) {
        	System.out.print("class: "+cls[t]+"\n");
            for (int r = 0; r < studname[t].length; r++) {
            	System.out.print(" student: " + studname[t][r]);
                for (int c = 0; c < studscore[t][r].length; c++) {
                    System.out.print(" Score: " + studscore[t][r][c]);
                }
                System.out.println();
            }
            
            System.out.println();
        }
        input.close();
    }
}
