package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment8_BankTransactions {

	public static void main(String[] args) {

		// Create a list to store bank transaction amounts
		// Positive values = Credit, Negative values = Debit

		List<Integer> transactions = new ArrayList<>();

		// Add transaction amounts to the list
		transactions.add(50000);
		transactions.add(-2000);
		transactions.add(3000);
		transactions.add(-15000);
		transactions.add(-200);
		transactions.add(-300);
		transactions.add(4000);
		transactions.add(-3000);

		// Variables to count number of credit and debit transactions
		int creditCount = 0;
		int debitCount = 0;

		// Variables to store total credited and debited amounts
		int totalCredit = 0;
		int totalDebit = 0; // stays NEGATIVE

		// Variable to calculate final account balance
		int balance = 0;

		// Variable to count suspicious transactions
		int suspiciousCount = 0;

		// Loop through each transaction amount
		for (int amount : transactions) {

			// Check if transaction is a credit
			if (amount > 0) {
				creditCount++;
				totalCredit = totalCredit + amount;

				// else, it is a debit transaction
			} else {
				debitCount++;
				totalDebit = totalDebit + amount;
			}

			// Update account balance after each transaction
			balance = balance + amount;

			
			// Check for suspicious transactions (greater than 10,000 or less than -10,000)
			if (amount > 10000 || amount < -10000) {
				System.out.println("Suspicious credit/debit transaction with amount: " + amount);
				suspiciousCount++;
			}
		}

		
		 // Print final results
		System.out.println("Total Credit Transactions: " + creditCount);
		System.out.println("Total Debit Transactions: " + debitCount);
		System.out.println("Total Amount Credited: " + totalCredit);
		System.out.println("Total Amount Debited: " + totalDebit); 
		System.out.println("Final Account Balance: " + balance);
		System.out.println("Total Suspicious Transactions: " + suspiciousCount);

	}
}
