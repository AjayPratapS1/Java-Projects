package javap;
import java.util.Scanner;

public class AtmCashTracking {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       
        String[][] person = {
                {"Ajay", "5000"},
                {"Jai", "10000"}
        };

        for (int i = 0; i < person.length; i++) {
            String name = person[i][0];
            int balance = Integer.parseInt(person[i][1]);

            System.out.println("\nWelcome " + name + "!");
            System.out.println("Your current balance: ₹" + balance);

            String[] options = {"Withdraw", "Deposit", "Check Balance"};

            boolean continueTransaction = true;

            while (continueTransaction) {
                System.out.println("\nSelect the option:");
                for (int k = 0; k < options.length; k++) {
                    System.out.println((k + 1) + ". " + options[k]);
                }

                int choice = s.nextInt();
                switch (choice) {
                    case 1: // Withdraw
                        System.out.print("Enter amount to withdraw: ");
                        int withdraw = s.nextInt();
                        if (withdraw > balance) {
                            System.out.println("Insufficient Balance.");
                        } else {
                            balance -= withdraw;
                            System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
                        }
                        break;

                    case 2: // Deposit
                        System.out.print("Enter amount to deposit: ");
                        int deposit = s.nextInt();
                        balance += deposit;
                        System.out.println("Deposit successful. New balance: ₹" + balance);
                        break;

                    case 3: // Balance
                        System.out.println("Current balance: ₹" + balance);
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }

                System.out.print("Do you want another transaction for " + name + "? (yes/no): ");
                s.nextLine(); // clear newline
                String again = s.nextLine();
                if (!again.equalsIgnoreCase("yes")) {
                    continueTransaction = false;
                    // Update balance back to array
                    person[i][1] = String.valueOf(balance);
                }
            }
        }

        System.out.println("\nFinal Account Balances:");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i][0] + ": ₹" + person[i][1]);
        }

        s.close();
    }
}
