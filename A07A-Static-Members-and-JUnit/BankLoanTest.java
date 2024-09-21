import org.junit.Test;
import org.junit.Assert;  
/**
 * Program for testing methods of BankLoan.
 *
 * Activity 7A
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 3/14/23
 */
public class BankLoanTest {

/**
* Tests chargeInterest method.
*/
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }
}