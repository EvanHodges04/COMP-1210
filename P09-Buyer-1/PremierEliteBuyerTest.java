import org.junit.Assert;
import org.junit.Test;

/**
 * Program tests PremierEliteBuyer's methods.
 *
 * Project 9
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/10/23
 */
public class PremierEliteBuyerTest {
   /**
* Tests getBonusAwardPoints method.
*/
   @Test public void getDiscountRateTest() {
      PremierEliteBuyer peb1 = new PremierEliteBuyer("10003", "King, Kelly");
      Assert.assertEquals(1000, peb1.getBonusAwardPoints(), 0);
   }
   
   /**
* Tests setBonusAwardPoints method.
*/
   @Test public void setDiscountRateTest() {
      PremierEliteBuyer peb1 = new PremierEliteBuyer("10003", "King, Kelly");
      peb1.setBonusAwardPoints(5);
      Assert.assertEquals(5, peb1.getBonusAwardPoints(), 0);
   }
   
   /**
* Tests calcAwardPoints method.
*/
   @Test public void calcAwardPoints() {
      PremierEliteBuyer peb1 = new PremierEliteBuyer("10003", "King, Kelly");
      peb1.addPurchases(new double[] {34.5, 100.0, 63.50, 300.0});
      Assert.assertEquals(8460, peb1.calcAwardPoints(), 0);
      PremierEliteBuyer peb2 = new PremierEliteBuyer("10004", 
         "Jenkins, Jordan");
      peb2.addPurchases(new double[] {34.5, 100.0, 63.50, 300.0, 100.0});
      Assert.assertEquals(11160, peb2.calcAwardPoints(), 0);
   }
   
   /**
* Tests toString method.
*/
   @Test public void toStringTest() {
      PremierEliteBuyer peb1 = new PremierEliteBuyer("10003", "King, Kelly");
      Assert.assertTrue(peb1.toString().contains("King, Kelly"));
      PremierEliteBuyer peb2 = new PremierEliteBuyer("10004", 
         "Jenkins, Jordan");
      peb2.addPurchases(new double[] {34.5, 100.0, 63.50, 300.0, 100.0});
      Assert.assertTrue(peb2.toString().contains("Jenkins, Jordan"));
   }
}