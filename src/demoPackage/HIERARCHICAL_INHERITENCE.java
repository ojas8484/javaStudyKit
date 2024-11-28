package demoPackage;

public class HIERARCHICAL_INHERITENCE {
public static void main(String[] args) {
	CHILD_A a = new CHILD_A();
	CHILD_B b = new CHILD_B();
	CHILD_C c = new CHILD_C();
	a.parentMethod();
	a.childA();
	b.parentMethod();
	b.childB();
	c.parentMethod();
	c.childC();
}
}
