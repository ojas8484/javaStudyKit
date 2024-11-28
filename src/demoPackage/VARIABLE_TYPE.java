package demoPackage;

public class VARIABLE_TYPE {
	
	static int a =10;
	int c =11;
	public void callforLocalVariabel (){
		int b = 12;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
	
	System.out.println(a);
	System.out.println("_________________________");
	VARIABLE_TYPE call = new VARIABLE_TYPE();
	call.callforLocalVariabel();
	System.out.println("___________________");
	System.out.println(VARIABLE_DEMO.globalVariable);
	System.out.println(call.c);
}
}
