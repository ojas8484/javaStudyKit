package demoPackage;

public class CHILD_B extends PARENT {
	
	public static void main(String[] args) {
		CHILD_B b = new CHILD_B();
		b.childB();
		b.parentMethod();
	}
	public void childB() {
		System.out.println("Child B");
	}
}
