package demoPackage;

public class IMPEMENTATION_INTERFACE_TWO implements POLYMORPH_DEMO2{

	@Override
	public void test() {
		System.out.println("not a default");
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("not a default");
	}
public void methodTobeCalledSpecifically() {
System.out.println("default method");	
};
	public static void main(String[] args) {
	 IMPEMENTATION_INTERFACE_TWO invokeImpementation_INTERFACE_TWO = new IMPEMENTATION_INTERFACE_TWO();
	 invokeImpementation_INTERFACE_TWO.test();
	 invokeImpementation_INTERFACE_TWO.test2();
	 invokeImpementation_INTERFACE_TWO.methodTobeCalledSpecifically();
	}

}
