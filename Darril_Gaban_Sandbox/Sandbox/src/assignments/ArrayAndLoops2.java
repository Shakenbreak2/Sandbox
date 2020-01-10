package assignments;

public class ArrayAndLoops2 {

	public static void main(String[] args) {
		
				
		
		char[] c= { 'c', 'a', 'k', 'e', ' ', 'p', 'o', 'u', 'n', 'd', ' ', 's', 't', 'e', 'a', 'l' };
		String temp= new String(c);
		String[] s= temp.split(" ");
		
		
		
		for(int i=0, j=s.length-1;i<j;i++,j--) {
			String k=s[i];
			s[i]=s[j];
			s[j]=k;
			
		}
//		for(int i=c.length-1,j=0;j<c.length;i--,j++) {
//			if(c[i]==' ') {
//				k=j;
//				s=c.toString();
//			}
			
			
			
		
		
		
//		reverseWords(c);
		 // prints: "steal pound cake"
	}
	
	static void reverseWords(char[] c) {
		
		
	}

}
