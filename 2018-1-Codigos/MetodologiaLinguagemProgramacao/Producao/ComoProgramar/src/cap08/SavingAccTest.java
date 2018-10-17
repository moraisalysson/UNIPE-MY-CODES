package cap08;

public class SavingAccTest {
	public static void main(String[] args) {
		SavingAccount saver1 = new SavingAccount();
		SavingAccount saver2 = new SavingAccount();
		
		//depósito inicial
		saver1.setSavingsBalance(2000);
		saver2.setSavingsBalance(3000);
		
		System.out.println(saver1.getSavingsBalance());
		System.out.println(saver2.getSavingsBalance());
		
		//taxa de 4%
		SavingAccount.modifyInterestRate(4);
		saver1.calcMonthlyInterest();
		saver2.calcMonthlyInterest();
		
		System.out.println(saver1.getSavingsBalance());
		System.out.println(saver2.getSavingsBalance());
		
		//taxa de 5%
		SavingAccount.modifyInterestRate(5);
		saver1.calcMonthlyInterest();
		saver2.calcMonthlyInterest();
		
		System.out.println(saver1.getSavingsBalance());
		System.out.println(saver2.getSavingsBalance());
		
	}
}
