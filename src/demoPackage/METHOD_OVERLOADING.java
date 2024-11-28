package demoPackage;


public class METHOD_OVERLOADING {

public void add(int a ,int b) {
	int numOne = a;
	int numTwo = b;
	int result = numOne+numTwo;
	System.out.println("Addition :"+ result);
}
public void add(int a ,int b , int c) {
	int numOne = a;
	int numTwo = b;
	int numThree = c;
	int result = numOne+numTwo+numThree;
	System.out.println("Addition :"+ result);
}
public void add(int a ,int b , int c,int d) {
	int numOne = a;
	int numTwo = b;
	int numThree = c;
	int numFour = d;
	int result = numOne+numTwo+numThree+numFour;
	System.out.println("Addition :"+ result);
}
	
}
