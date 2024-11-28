package demoPackage;


public class CONSTUCTOR {
	int a;
	int b;
	CONSTUCTOR(){
		a = 10;
		b = 20;
	}
	
	public static void main(String[] args) {
		CONSTUCTOR inst = new CONSTUCTOR();
		inst.test();
		inst.testTwo();
	}
	
	public  void test() {
		System.out.println(a);
	}
	
	public void testTwo () 
	{
		System.out.println(b);
	}
}
