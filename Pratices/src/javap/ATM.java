package javap;

public class ATM {

	public static void main(String[] args) {
		int balance = 1000, withdraw = 500;

		if (withdraw <= balance) {
			balance -= withdraw;
			System.out.println("Withdrawn: " + withdraw);
			System.out.println("Remaining Balance: " + balance);
		} else {
			System.out.println("Insufficient Balance");
		}

	}

}
