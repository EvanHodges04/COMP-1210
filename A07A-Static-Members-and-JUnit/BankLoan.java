/**
 * Program with methods for various uses to demonstrate testing.
 *
 * Activity 7A
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 3/14/23
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   private static int loansCreated = 0;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;

/**
* Declares variables and increments loansCreated.
*
* @param customerNameIn Associates with customerName.
* @param interestRateIn Associates with interestRate.
*/
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

/**
* Returns true or false dependent on wasLoanMade and edits balance.
* 
* @param amount Amount to be borrowed from bank.
* @return Returns true or false depending on if the loan is made.
*/
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

/**
* Returns the new balance if changed.
* 
* @param amountPaid Amount to be paid to the bank.
* @return Returns the new balance or zero   
*/
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
* Gets the balance.
*
* @return Returns the balance.
*/
   public double getBalance() {
      return balance;
   }
   
   /**
* Sets the interest rate if possible.
* 
* @param interestRateIn The value for the interest rate.
* @return Returns true or false depending on validity of new interest rate.   
*/
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
* Gets the interest rate.
* 
* @return Returns the interest rate.   
*/
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
* Method for charging interest.
*/
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
       /**
* Formats display.
*
* @return Returns formatted dislplay.
*/
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   
       /**
* Returns validity of amount.
*
* @param amount Amount to be checked.
* @return Returns true or false depending on amount value.
*/
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   
   /**
* Returns true or false depending on whether bank account is in debt.
*
* @param loan Takes BankLoan object to check balance with.
* @return Returns true or false depending on account balance.
*/
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
   /**
* Returns amount of loans created.
*
* @return Returns loansCreated value.
*/
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**
* Sets loansCreated value to 0.
*/
   public static void resetLoansCreated() {
      loansCreated = 0;
   }

}
