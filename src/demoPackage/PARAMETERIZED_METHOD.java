package demoPackage;


public class PARAMETERIZED_METHOD {

	public static void main(String[] args) {
	
		add(10, 20);
		add(100,200);
		add(200, 400);
		substract(4,5);
		substract(50, 40);
		PARAMETERIZED_METHOD invokerMethod = new PARAMETERIZED_METHOD();
		invokerMethod.multiply(10, 44);
		METHOD_TWO.classCall();
		fullname("Swaroop", "Aparadh");
		fullname("Ojas", "Aparadh");
		trueFalse(false);
		trueFalse(true);
		percentage(23.2, 40.5);
		
	}
	public static void add(int a ,int b) {
		
		int firstNumber = a;
		int secondNumber = b;
		int Result = firstNumber + secondNumber;
		System.out.println("Addition of two numbers is : " + Result);
		
	}
	public static void substract(int a , int b) {
		int firstNumber = a;
		int secondNumber = b;
		if (firstNumber > secondNumber) {
			int result = (firstNumber - secondNumber);	
			System.out.println("Substraction of two numbers is : " + result);
		}
		else {
			System.out.println("Please enter first number greater than second number.");
		}

		
	}
	public void multiply(int a, int b) {
		int firstNumber = a;
		int secondNumner = b;
		int result = firstNumber * secondNumner;
		System.out.println("The multiplication of two numbers is : " + result);
	}
	
	public static void fullname (String a ,String b) {
		String firstName = a;
		String secondNameString = b;
		System.out.println("Full name of the student is : " + firstName+" "+secondNameString);
	} 
	public static void trueFalse( boolean a) {
		
		System.out.println("Your entered " + a + " value");
	} 
	public static void percentage(double a , double b ) {
		double result = (a/b)* 100;

		System.out.println("Percentage of two numbers is : " + result + " %");
		
	}
}
