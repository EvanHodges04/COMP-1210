import org.junit.Assert;
import org.junit.Test;

/**
 * Program tests Buyer's methods.
 *
 * Project 9
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/10/23
 */
public class BuyerTest {
   /**
* Tests getAcctNumber method.
*/
   @Test public void getAcctNumberTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      Assert.assertEquals("10001", pb.getAcctNumber());
   }
   
   /**
* Tests setAcctNumber method.
*/
   @Test public void setAcctNumberTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.setAcctNumber("12345");
      Assert.assertEquals("12345", pb.getAcctNumber());
   }
   
   /**
* Tests getName method.
*/
   @Test public void getNameTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      Assert.assertEquals("Smith, Sam", pb.getName());
   }
   
   /**
* Tests setName method.
*/
   @Test public void setNameTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.setName("Hodges, Evan");
      Assert.assertEquals("Hodges, Evan", pb.getName());
   } 
   
   /**
* Tests getPurchases method.
*/
   @Test public void getPurchasesTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.addPurchases(34.5, 100.0, 63.50, 350.0);
      Assert.assertEquals(pb.getPurchases(), pb.getPurchases());
   } 
   
   /**
* Tests setPurchases method.
*/
   @Test public void setPurchasesTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.setPurchases(new double[] {34.5, 100.0, 63.50, 350.0});
      Assert.assertEquals(pb.getPurchases(), pb.getPurchases());
   }
   
   /**
* Tests addPurchases method.
*/
   @Test public void addPurchasesTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.addPurchases(34.5, 100.0, 63.50, 350.0);
      Assert.assertEquals(pb.getPurchases(), pb.getPurchases());
   }
   
   /**
* Tests deletePurchases method.
*/
   @Test public void deletePurchasesTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.addPurchases(34.5, 100.0, 63.50, 70.0, 350.0, 50.0);
      pb.deletePurchases(70.0, 50.0);
      Assert.assertEquals(591.84, pb.calcTotal(), 0);
      pb.deletePurchases(34.5, 100.0, 63.50, 350.0, 40.0);
   }
   
   /**
* Tests calcSubtotal method.
*/
   @Test public void calcSubtotalTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.setPurchases(new double[] {34.5, 100.0, 63.50, 350.0});
      Assert.assertEquals(548, pb.calcSubtotal(), 0);
   }
   
   /**
* Tests calcTotal method.
*/
   @Test public void calcTotal() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      Assert.assertTrue(pb.toString().contains("10001 Smith, Sam"));
   }
   
   /**
* Tests toString method.
*/
   @Test public void toStringTest() {
      PreferredBuyer pb = new PreferredBuyer("10001", "Smith, Sam");
      pb.setPurchases(new double[] {34.5, 100.0, 63.50, 350.0});
      Assert.assertEquals(591.84, pb.calcTotal(), 0);
   }
   
   
}

