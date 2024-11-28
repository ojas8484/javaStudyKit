package demoPackage;

public class CONDITIONAL_STATEMENT {
public static void main(String[] args) {
	boolean a = true;
	int b = 40;
	int subOne = 75;
	int subTwo = 35;
	int c = 100;
	int d = 35;
	if (a == true) {
		System.out.println("Conditional Call");
	}
	else {
		System.out.println("Condition not called");
	}
	if (b >= 45) {
		System.out.println("Passed");
	}
	else {
		System.out.println("Failed");
	}

	 
	 if (c > 0) {
		 System.out.println("Postiive Number");
	 }
	 else {System.out.println("Negative Number");
	 }
	 
	 	
	 if (subOne >= 35 || subTwo >= 35) {
		System.out.println("Both conditions met");
	}
	 else if (subOne >= 35 && subTwo >= 35) {
		System.out.println("One conditions met");
	} 
	 else {
		 System.out.println("No condition met");
	 }
	 if (c >= 75) {
		 System.out.println("Distiction");
	 }
	 else if(c >= 65) {
		 System.out.println("First class");
	 }
	 else if (c >= 60) {
		 System.out.println("Second class");
		
	}
	 else if (c >= 55) {
		System.out.println("Third class");
	}
	 else if (c >= 45) {
		System.out.println("Pass class");
	}
	 else {
		 System.out.println("Failed");
	 }
	 
	 if (d >= 0) 
	 {
		 System.out.println("you are in cut ofF area ! ");
		 if(d == 100  ) {
			 System.out.println("PerfectScore !!!!");
		 }
		 else if (d >= 75 ) {
			System.out.println("Distinction !!!!!");
		}
		 else if(d >= 65) {
			 System.out.println("First class");
		 }
		 else if (d >= 60) {
			 System.out.println("Second class");
			
		}
		 else if (d >= 55) {
			System.out.println("Third class");
		}
		 else if (d >= 45) {
			System.out.println("Pass class");
		}
		 else if (d < 45) {
			System.out.println("Passed but not elligible");
		}
		 
	 }
	 else 
	 {
		 System.out.println("Marks obtained are negative an you are not eligible");
	 }
	 
	 
	 switch (c) {
	 case 35:
		 System.out.println("Pass");
		 break;
	 case 45:
		 System.out.println("Third Class");
		 break;	 
	 case 55:
		 System.out.println("Second Class");
		 break;
	 case 65:
		 System.out.println("First Class");
		 break;
	 case 75:
		 System.out.println("Distinction Class");
		 break;	 
	default:
		System.out.println("Failed");
	 
	 }
	 
}
}
