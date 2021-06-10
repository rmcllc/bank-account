package com.ryan.bankaccount;

public class BankAccount {
	private String AccountNumber;
	private double CheckingBalance = 0.0d;
	private double SavingsBalance = 0.0d;
	private static int numberOfAccounts = 0;
	private static double totalMoney = 0.0d;
	
	public BankAccount() {
		BankAccount.numberOfAccounts++;
		this.newAccountNumber();
	}
	
	public double depositChecking(double amt) {
		setCheckingBalance(amt);
		setTotalMoney(amt);
		return amt;
	}
	
	public double withdrawChecking(double amt) {
		double withdrawAmt = amt * -1;
		setCheckingBalance(withdrawAmt);
		setTotalMoney(withdrawAmt);
		return amt;
	}
	
	public double depositSavings(double amt) {
		setSavingsBalance(amt);
		setTotalMoney(amt);
		return amt;
	}
	
	public Integer newAccountNumber() {
		int min = 1000000000;
		int max = 1499999999;
		int num = (int) (Math.random() * (max-min) + min);
		String str = String.valueOf(num);
		this.setAccountNumber(str);
		return num;
	}
		

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	public double getCheckingBalance() {
		return this.CheckingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		CheckingBalance = this.CheckingBalance + checkingBalance;
	}

	public double getSavingsBalance() {
		return this.SavingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		SavingsBalance = this.SavingsBalance + savingsBalance;
	}

	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public static void setNumberOfAccounts(int numberOfAccounts) {
		BankAccount.numberOfAccounts = numberOfAccounts;
	}

	public static double getTotalMoney() {
		return totalMoney;
	}

	public static void setTotalMoney(double totalMoney) {
		BankAccount.totalMoney = BankAccount.totalMoney + totalMoney;
	}
	
	
	
	
}