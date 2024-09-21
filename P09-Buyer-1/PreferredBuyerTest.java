import org.junit.Assert;
import org.junit.Test;

/**
 * Program tests PreferredBuyer's methods.
 *
 * Project 9
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/10/23
 */
public class PreferredBuyerTest {
   /**
* Tests calcAwardPoints method.
*/
   @Test public void calcAwardPointsTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.addPurchases(34.5, 100.0, 63.50, 350.0);
      Assert.assertEquals(548, pb.calcAwardPoints(), 0);
   }
}