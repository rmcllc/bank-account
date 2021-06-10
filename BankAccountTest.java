package com.ryan.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount newAccount = new BankAccount();
		newAccount.depositSavings(24.02);
		newAccount.depositSavings(210.00);
		System.out.println("The Savings Account Balance is: " + newAccount.getSavingsBalance());
		
		BankAccount newAccount1 = new BankAccount();
		System.out.println("Your deposit of " + newAccount1.depositChecking(2400.49) + " has processed. Your new balance is " + newAccount1.getCheckingBalance());
		System.out.println("The Checking Account Balance is: " + newAccount1.getCheckingBalance());
		System.out.println("Your deposit of " + newAccount1.depositChecking(8451.13) + " has processed. Your new balance is " + newAccount1.getCheckingBalance());
		System.out.println("The Checking Account Balance is: " + newAccount1.getCheckingBalance());
		System.out.println("You've withdrawn " + newAccount1.withdrawChecking(100.00) + " from your checking account. Your new balance is " + newAccount1.getCheckingBalance());
		
		BankAccount newAccount2 = new BankAccount();
		System.out.println("The account number is: " + newAccount2.getAccountNumber());
		
		System.out.println("Number of accounts: " + BankAccount.getNumberOfAccounts());
		System.out.println("Total of accounts: " + BankAccount.getTotalMoney());
		
	}

}
