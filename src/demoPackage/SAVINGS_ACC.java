package demoPackage;

public class SAVINGS_ACC implements BANKING_COMMON_FEATURES{

	public void cashDeposit() {
		System.out.println("Amount Credited in your Savings account: $30000 /-");
		
	}

	public void cashWithdrawal() {
		System.out.println("$60 withdrawn from your salary account.");		
	}

	public void moneyTransfere() {
		System.out.println("$100 debited towards mobile recharge.");
		
	}
	
	public void savingsAccountFeature(){
		System.out.println("Feature available only at Savings Account");
	}


}
