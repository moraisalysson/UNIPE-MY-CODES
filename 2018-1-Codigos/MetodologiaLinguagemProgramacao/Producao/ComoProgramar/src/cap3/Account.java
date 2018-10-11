package cap3;

public class Account {
	private double balance;
	
	public Account(double initialBalance)  {
		if(initialBalance > 0.0) 
			this.balance = initialBalance;
	}
	
	public void credit(double amount) {
		if(amount < 0.0)
			this.displayMsgNegativeValue();
		
		else
			this.balance = this.balance + amount;
		
	}
	
	public void debit(double amount) {
		if(amount < 0.0)
			this.displayMsgNegativeValue();
		
		else if( amount > this.getBalance() )
			this.displayMsgInsuficienteBalance();
	
		else
			this.balance = this.balance - amount;
	}
	
	public void displayMsgInsuficienteBalance() {
		System.out.printf("Debit amount exceed account balance.\n\n");
	}
	
	public void displayMsgNegativeValue() {
		System.out.printf("Negative value it's not accepted.\n\n");
	}
	
	public double getBalance() {
		return this.balance;
	}
	
}
