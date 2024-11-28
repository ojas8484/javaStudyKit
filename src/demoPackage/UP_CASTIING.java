package demoPackage;

public class UP_CASTIING {
public static void main(String[] args) {
	PARENT_CASTING nocast = new PARENT_CASTING();
	PARENT_CASTING upcast = new CASTING();
	nocast.a();
	nocast.b();
	nocast.c();
	upcast.a();
	upcast.b();
	upcast.c();
}
}

