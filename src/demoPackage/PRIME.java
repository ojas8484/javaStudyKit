package demoPackage;

public class PRIME {
	public static void main(String[] args) {
		prmNum();
	}

	public static void prmNum() {
		for (int i =1 ; i<=100 ; i++) 
		{
			
			if(i == 2) {
				System.out.println(i);
			}
			else if (i >2 && i%2 != 0) {
System.out.println(i);
			}
		}
		
	}
}
