package demoPackage;

public class LOOP_AssignmentOne {
	public static void main(String[] args) {
		tableOfSeven();
		square();
		evenOdd();
		
	}
		public static void tableOfSeven() 
		{
			System.out.println("Table of Seven is as follows : ");
			int i = 1;
			int a = 7;
			for ( i = 1;i <= 10; i++ ) 
			{
			int result = a*i;
			System.out.println(result);
			}
			System.out.println("_______________________________________");
			
		}
		public static void square() 
		{
			System.out.println("Square of 1 to 5 is as follows : ");
			int a = 1;
			while(a <=5) 
			{
				int result = a*a;
				a++;
				System.out.println(result);
			}
			System.out.println("_______________________________________");
		}
		
	 public static void evenOdd() {
		for (int i=0 ; i<=100 ; i++ ) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
		 
	 }
}
