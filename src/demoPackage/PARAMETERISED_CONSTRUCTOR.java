package demoPackage;

public class PARAMETERISED_CONSTRUCTOR {
	int a ;
	int b ;
	
PARAMETERISED_CONSTRUCTOR(int num1, int num2) {
    a= num1;
    b = num2;
	}
public static void main(String[] args) {
	PARAMETERISED_CONSTRUCTOR testCallMethod = new PARAMETERISED_CONSTRUCTOR(45,50);
	testCallMethod.add();
	testCallMethod.sub();
	PARAMETERISED_CONSTRUCTOR calltwoConstructor = new PARAMETERISED_CONSTRUCTOR(100, 250);
	calltwoConstructor.add();
	calltwoConstructor.sub();
}

public void add() {
	int c = a+b;
	System.out.println(c);
}

public void sub() {
	int c = b-a;
	System.out.println(c);
}

}
