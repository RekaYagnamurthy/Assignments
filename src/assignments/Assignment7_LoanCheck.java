package assignments;

public class Assignment7_LoanCheck {

    public static void main(String[] args) {
        String customerName = "John Doe";
        int creditScore = 720;
        double income = 55000.0;
        boolean isEmployed = true;
        double debtToIncomeRatio = 35.0;

        // If the credit score is above 750, the loan is automatically approved.
        if (creditScore > 750) {
        	
            System.out.println(customerName + " is eligible for the loan.");
            
        } 
        
        // If the credit score is between 650 and 750, additional checks are performed.
        
        else if (creditScore >= 650) {
            
        	// Check if income is at least $50,000
            if (income >= 50000) {
                
            	// Check if the customer is employed
                if (isEmployed) {
                    
                	// Check if debt-to-income ratio is less than 40%
                    if (debtToIncomeRatio < 40) {
                       
                    	System.out.println(customerName + " is eligible for the loan.");
                   
                    } else {
                        System.out.println(customerName + " is NOT eligible for the loan (DTI ratio too high)."); 
                    }
               
                } else {
                    System.out.println(customerName + " is NOT eligible for the loan (not employed).");
                }
            
            } else {
                System.out.println(customerName + " is NOT eligible for the loan (income too low).");
            }
        } 
        
        //If the credit score is below 650, the loan is denied.
        
        else {
            System.out.println(customerName + " is NOT eligible for the loan (credit score too low).");
        }
    }
}
