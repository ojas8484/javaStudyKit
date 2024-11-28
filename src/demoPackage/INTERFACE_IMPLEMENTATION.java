package demoPackage;

public class INTERFACE_IMPLEMENTATION implements PolymorphDemo,POLYMORPH_DEMO2{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int c = a + b ;
		System.out.println("Addition : " + c);
	}

	@Override
	public void substract() {
		// TODO Auto-generated method stub
		int c = a - b ;
		System.out.println("Substraction : " + c);
	}

	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		int c = a * b ;
		System.out.println("Multiplication : " + c);
	}

	@Override
	public void divide() {
		// TODO Auto-generated method stub
		int c = a / b ;
		System.out.println("Division : " + c);
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Multiple inheritence achieved");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("Diamond problem solved");
	}
	public static void main(String[] args) {
		INTERFACE_IMPLEMENTATION invokeImplementation = new INTERFACE_IMPLEMENTATION();
		invokeImplementation.add();
		invokeImplementation.substract();
		invokeImplementation.multiply();
		invokeImplementation.divide();
		invokeImplementation.test();
		invokeImplementation.test2();
		PolymorphDemo.common();
	}



}
