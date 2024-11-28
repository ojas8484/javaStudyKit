package demoPackage;

public class GENERALISTION {
public static void main(String[] args) {
	SAVINGS_ACC savingsacc = new SAVINGS_ACC();
	SALARY_ACC salary_ACC = new SALARY_ACC();
	CURRENT_ACC current_ACC = new CURRENT_ACC();
	savingsacc.cashDeposit();
	savingsacc.cashWithdrawal();
	savingsacc.moneyTransfere();
	savingsacc.savingsAccountFeature();
	salary_ACC.cashDeposit();
	salary_ACC.cashWithdrawal();
	salary_ACC.moneyTransfere();
	salary_ACC.salaryAccountFeature();
	current_ACC.cashDeposit();
	current_ACC.cashWithdrawal();
	current_ACC.moneyTransfere();
	current_ACC.currentAccountFeature();
}
}
