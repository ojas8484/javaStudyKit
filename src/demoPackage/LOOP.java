package demoPackage;

public class LOOP {
	
	public static void main(String[] args) {
	String a = "This is a loop";
	int b;
	String ptrn = "*******";
	String reverseString = "";

	
	for (b=1 ; b<= 5; b++) {
		System.out.println(b);
	}

	
	for (int i=0 ; i<=3; i++) {
		System.out.println(a);
	}
	System.out.println("-------------------------------");
	
	System.out.println("REversed Numbers : ");
	
	for (int c = 5; c >= 0 ; c--) {
		System.out.println(c);
		
	}
	System.out.println("-------------------------------");
	
	System.out.println("Even Numbers are : ");
	for (int i = 2;  i <=10 ; i=(i+2))
	{
		System.out.println(i);
	}
	System.out.println("-------------------------------");
	
	System.out.println("Odd Numbers are : ");
	for (int i = 3;  i <=10 ; i=(i+2))
	{
		System.out.println(i);
	}
	
	for (int i = ptrn.length(); i > 0; i --) {
		System.out.println(ptrn.substring(0,i));
	}
	for (int f = 0;f<a.length();  f++) {
		reverseString = a.charAt(f) + reverseString;
	}
	System.out.println("Reversed String : " +reverseString);
	String test = "Swaroop";
	System.out.println(test.charAt(0));
	System.out.println("_________________________WHILE LOOP__________________________");
	int r = 1;
	while(r <=10) {
		System.out.println(r);
		r++;
	}
	
	int x = 8;
	while (x >= 2) {
		System.out.println(x);
		x = (x-2);
	}
	int i = 1;
	do {
		System.out.println(i);
		i++;
	}
	while(i <=10);
	
	
	for(int n = 1;n<=100;n++) {
		if(n!=0 && n!=1) {
			if(n%n != 0 && n%2==0 ) {
				System.out.println(n);
			}
		}
		
	}
	
	
	}
	


}
