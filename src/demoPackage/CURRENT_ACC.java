package demoPackage;

public class CURRENT_ACC implements BANKING_COMMON_FEATURES{

	public void cashDeposit() {
		System.out.println("Amount Credited in your Savings account: $100000 /-");
		
	}

	public void cashWithdrawal() {
		System.out.println("$1230 withdrawn from your salary account.");		
	}

	public void moneyTransfere() {
		System.out.println("$560 debited towards Gas Station.");
		
	}
	
	public void currentAccountFeature(){
		System.out.println("Feature available only at Current Account.");
	}


}
