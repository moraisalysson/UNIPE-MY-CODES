package cap08;

public class SavingAccount {
	private static double annualInterestRate;
	private double savingsBalance;
	
	public void calcMonthlyInterest() {
		this.setSavingsBalance( 
				this.getSavingsBalance() + (this.getSavingsBalance() * annualInterestRate) / 12
				);
	}
	
	public static void modifyInterestRate(double newRate) {
		SavingAccount.annualInterestRate = newRate/100;
	}
	
	public static double annualInterestRate() {
		return SavingAccount.annualInterestRate;
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	
	
}
