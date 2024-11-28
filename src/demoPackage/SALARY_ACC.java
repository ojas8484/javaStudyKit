package demoPackage;

public class SALARY_ACC implements BANKING_COMMON_FEATURES{

	public void cashDeposit() {
		System.out.println("Salary Credited in your account: $250000 /-");
		
	}

	public void cashWithdrawal() {
		System.out.println("$250 withdrawn from your salary account.");		
	}

	public void moneyTransfere() {
		System.out.println("$1000 debited towards loan emi.");
		
	}
	
	public void salaryAccountFeature(){
		System.out.println("Feature available only at Salary Account");
	}

}
