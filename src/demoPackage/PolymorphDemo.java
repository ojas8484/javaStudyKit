package demoPackage;

public interface PolymorphDemo {
 int a =100;
 int b =50;
 void add();
 void substract();
 void multiply ();
 void divide();
 public static void common() {
	 int sqOne = a*a;
	 int sqTwo = b*b;
	 int result = sqOne * sqTwo;
	 System.out.println("Product Multiples : " + result);
	 priv();
 };
 
 private static void priv() {
	 System.out.println("Method  used commonly in interface.");
 }
}
