package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment8_BankTransactions {


	public static void main(String[] args) {
		

        List<Integer> transactions = new ArrayList<>();
        transactions.add(50000);
        transactions.add(-2000);
        transactions.add(3000);
        transactions.add(-15000);
        transactions.add(-200);
        transactions.add(-300);
        transactions.add(4000);
        transactions.add(-3000);

        int creditCount = 0;
        int debitCount = 0;
        int totalCredit = 0;
        int totalDebit = 0;  // stays NEGATIVE
        int balance = 0;
        int suspiciousCount = 0;

        for (int amount : transactions) {

            if (amount > 0) {
                creditCount++;
                totalCredit = totalCredit + amount;
            } else {
                debitCount++;
                totalDebit = totalDebit + amount; // keep negative
            }

            balance = balance + amount;

            if (amount > 10000 || amount < -10000) {
                System.out.println("Suspicious credit/debit transaction with amount: " + amount);
                suspiciousCount++;
            }
        }

        System.out.println("Total Credit Transactions: " + creditCount);
        System.out.println("Total Debit Transactions: " + debitCount);
        System.out.println("Total Amount Credited: " + totalCredit);
        System.out.println("Total Amount Debited: " + totalDebit); // negative
        System.out.println("Final Account Balance: " + balance);
        System.out.println("Total Suspicious Transactions: " + suspiciousCount);

	
}
}



