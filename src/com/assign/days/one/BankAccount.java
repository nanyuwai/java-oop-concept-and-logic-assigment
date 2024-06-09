package com.assign.days.one;

public class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		super();
		this.balance = initialBalance;
	}

	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0) {
			if (this.balance >= amount) {
				this.balance -= amount;
			} else {
				System.out.println("Insufficient funds for withdrawal.");
			}
		} else {
			System.out.println("Withdrawal amount must be positive.");
		}
	}
	
	 public static void main(String[] args) {
		 BankAccount account =new BankAccount(10000.0);
		 System.out.println("Opening balance  :: $" +account.getBalance());
		 System.out.println("////////////////////////////");
		 System.out.println("Depositing  :: $1000.0");
		 account.deposit(1000.0);
		 System.out.println("New Balance :: $"+account.getBalance());
		 System.out.println("////////////////////////////");
		 System.out.println("Withdrawing  :: $2000.0");
		 account.withdraw(2000.0);
		 System.out.println("New Balance :: $"+account.getBalance());
	 }
}
