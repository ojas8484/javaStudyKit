package demoPackage;


final public class MODIFIERS extends ABSTRACT{
	public static void main(String[] args) {
	final int constant = 84;
	final String constantString = "Test";
	final double constantDouble = 9.5d;
	System.out.println(constant);
	System.out.println(constantString);
	System.out.println(constantDouble);
	MODIFIERS testModifiers = new MODIFIERS();
	testModifiers.restrictedMethod();
	testModifiers.incompleteMethod();
	testModifiers.testAbstract();
}
	public void restrictedMethod() {
		System.out.println("You canot overide this method due to FINAL keyword used at class");
	}
	
	public void incompleteMethod() {
		System.out.println("Incomplete Method from abstract class completed in this complete class.");
	}
	public void testAbstract() {
		System.out.println("you need to complete every abstract method to achieve inheritence i complete class. ");
	}

}
