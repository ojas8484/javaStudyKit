package demoPackage;

public class THIS_SUPER_KEYWORD extends PARENT {
int a =10;
public static void main(String[] args) {
	THIS_SUPER_KEYWORD testKeyword = new THIS_SUPER_KEYWORD();
	testKeyword.key();
}
public void key() {
	int a = 20;
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
}
}
