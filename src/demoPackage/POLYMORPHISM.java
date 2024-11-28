package demoPackage;

public class POLYMORPHISM {

	public static void main(String[] args) {
		POLYMORPHISM invokePolymorphism = new POLYMORPHISM();
		METHOD_OVERLOADING instanceMethod_OVERLOADING = new METHOD_OVERLOADING();
		METHOD_OVERIDING overRide = new METHOD_OVERIDING();
		invokePolymorphism.methodOverloading("Swaroop");
		invokePolymorphism.methodOverloading("Swaroop", "Aparadh");
		invokePolymorphism.methodOverloading("Swaroop", "Ojas", "Aparadh");
		instanceMethod_OVERLOADING.add(1, 2);
		instanceMethod_OVERLOADING.add(1,2,3);
		instanceMethod_OVERLOADING.add(1, 2, 3, 4);
		invokePolymorphism.a(1);
		invokePolymorphism.b(10, 50);
		overRide.a(5);
		overRide.b(10,50);
		
	}
	
	public void methodOverloading(String a  ) {
		String name = a;
		System.out.println("Name : " + name );
	}
	
	public void methodOverloading(String a , String b ) {
		String name = a;
		String surname = b;
		System.out.println("FullName : " + name +" "+ surname);
	}
	public void methodOverloading(String a ,String c, String b ) {
		String name = a;
		String surname = b;
		String middlename = c;
		System.out.println("FullName : " + name +" "+ middlename +" "+ surname);
	}
	public void a(int num1) {
		int a = num1;
		System.out.println(a);
	}
	public void b(int num1,int num2) {
		int a = num1;
		int b = num2;
		System.out.println(a + b);
	}
	
}
