import org.junit.Assert;
import org.junit.Test;

/**
 * Program tests EliteBuyer's methods.
 *
 * Project 9
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/10/23
 */
public class EliteBuyerTest {
   /**
* Tests getDiscountRate method.
*/
   @Test public void getDiscountRateTest() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      Assert.assertEquals(0.05, eb.getDiscountRate(), 0);
   }
   
   /**
* Tests setDiscountRate method.
*/
   @Test public void setDiscountRateTest() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      eb.setDiscountRate(0.10);
      Assert.assertEquals(0.10, eb.getDiscountRate(), 0);
   }
   
   /**
* Tests calcAwardPoints method.
*/
   @Test public void calcAwardPointsTest() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      eb.addPurchases(new double[] {34.5, 100.0, 63.50, 300.0});
      Assert.assertEquals(4730, eb.calcAwardPoints(), 0);
   }
   
   /**
* Tests calcSubtotal method.
*/
   @Test public void calcSubtotalTest() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      eb.addPurchases(new double[] {34.5, 100.0, 63.50, 300.0});
      Assert.assertEquals(473.10, eb.calcSubtotal(), 0);
   }
   
   /**
* Tests toString method.
*/
   @Test public void toStringTest() {
      EliteBuyer eb = new EliteBuyer("10002", "Jones, Pat");
      Assert.assertTrue(eb.toString().contains("Jones, Pat"));
   }
}