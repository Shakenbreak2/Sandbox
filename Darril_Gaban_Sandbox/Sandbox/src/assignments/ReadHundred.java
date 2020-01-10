package assignments;

public class ReadHundred {

	public static void main(String[] args) {
//		Generate/read one hundred numbers, compute their average,
//		and find out how many numbers are above the average. 

		int[] numbers= new int[100];
		int sum=0,avg=100,aboveAvg=0;
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=(int)(Math.random()*100);
			System.out.print(numbers[i]+" ");
			sum+=numbers[i];
			avg=sum/numbers.length;
		}
		
		System.out.println();
		for(int i=0;i<100;i++) {
			if(numbers[i]>avg) {
				System.out.print(numbers[i]+", ");
				aboveAvg+=1;
			}
		}
		System.out.println();
		System.out.println("avg: "+avg+" numbers above avg: "+aboveAvg);
	}

}
