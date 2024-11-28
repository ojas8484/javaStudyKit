package demoPackage;
import demoPackageTwo.TEST;
public class METHOD {
	public static void main(String args[])
	{
		System.out.println("Main");
		demMethod();
		test();
		add();
		METHOD_TWO.classCall();
		
		TEST instanceForCall = new TEST();
		instanceForCall.classCallFromOthePackage();
		
		NONSTATIC instanceForCallTwo =  new NONSTATIC();
		instanceForCallTwo.nonStaticMethod();
		
		METHOD instanceForCallThree = new METHOD();
		instanceForCallThree.nonStatic();
		
		
	}
	public static void demMethod() {
		System.out.println("demo  Method is called");
	}
	
	public static String test() {
		
		String a = "Test for metnod calling";
		System.out.println(a);
		return a;
	}
	public static void add() {
		int a ;
		int b ; 
		int c ;
		a = 1;
		b = 4;
		c = a+b;
		System.out.println(c);
		
	}
	public void nonStatic() {
		
		System.out.println("nonstatic method from same class");
		
	}
	

}
