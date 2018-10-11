package cap3;

import java.util.Scanner;

public class AccountTest {

	private static Scanner input;

	public static void main(String[] args) {
		Account account1 = new Account(50.00);
		Account account2 = new Account(-7.53);
		
		System.out.printf("account1 = %.2f\n", account1.getBalance());
		System.out.printf("account2 = %.2f\n", account2.getBalance());

		input = new Scanner(System.in);
		double depositAmount, withdrawAmount;
		
		System.out.print("Enter deposit amount for account1: "	);
		depositAmount = input.nextDouble();
		
		System.out.printf("\nadding %.2f to account1\n\n", depositAmount);
		
		account1.credit(depositAmount);
	
		System.out.printf("account1 balance: %.2f\n", account1.getBalance());
		System.out.printf("account2 balance: %.2f\n", account2.getBalance());
//----		
		
		System.out.print("Enter deposit amount for account2: "	);
		depositAmount = input.nextDouble();
		
		System.out.printf("\nadding %.2f to account2\n\n", depositAmount);
		
		account2.credit(depositAmount);
	
		System.out.printf("account1 balance: %.2f\n", account1.getBalance());
		System.out.printf("account2 balance: %.2f\n", account2.getBalance());
//----		

		System.out.print("Enter withdraw amount for account1: "	);
		withdrawAmount = input.nextDouble();
		
		System.out.printf("\nwithdraw %.2f to account1\n\n", withdrawAmount);
		
		account1.debit(withdrawAmount);
	
		System.out.printf("account1 balance: %.2f\n", account1.getBalance());
		System.out.printf("account2 balance: %.2f\n", account2.getBalance());
//----		

		System.out.print("Enter withdraw amount for account2: "	);
		withdrawAmount = input.nextDouble();
		
		System.out.printf("\nwithdraw %.2f to account2\n\n", withdrawAmount);
		
		account2.debit(withdrawAmount);
	
		System.out.printf("account1 balance: %.2f\n", account1.getBalance());
		System.out.printf("account2 balance: %.2f\n", account2.getBalance());		
		
	}

}
