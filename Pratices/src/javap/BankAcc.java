package javap;

import java.util.Scanner;

public class BankAcc {
//	Perform deposit and withdraw operations.
	Scanner s = new Scanner(System.in);
	int accountNo = 123;
	int balance = 50000;
	String accountHolderName = "Ajay";

	void accountDetails() {
		System.out.println("==== Account Details ====");
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account Number: " + accountNo);
		System.out.println("Account Balance: " + balance);
	}

	int deposit() {
		System.out.println("Enter the Deposit Amount: ");
		int amount = s.nextInt();
		int totalAmount = balance + amount;
		balance = totalAmount;
		return balance;
	}

	int widthraw() {
		System.out.println("Enter the Widthraw Amount: ");
		int amount = s.nextInt();
		if (amount < balance) {
			balance = balance - amount;
		}
		return balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcc obj = new BankAcc();
		obj.accountDetails();
		System.out.println("After Deposit your Balance is: " + obj.deposit());
		System.out.println("After Widthraw your Balance is: " + obj.widthraw());
	}

}
