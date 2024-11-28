package demoPackage;

public class CHILD_A extends PARENT{
	public static void main(String[] args) {
		CHILD_A a = new CHILD_A ();
		a.childA();
		a.parentMethod();
	}
public void childA() {
	System.out.println("Child A");
}
}
