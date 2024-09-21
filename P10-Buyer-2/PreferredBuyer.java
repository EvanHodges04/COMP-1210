/**
 * Program creates preferred buyer class for calculations.
 *
 * Project 10
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/22/23
 */
public class PreferredBuyer extends Buyer {
   
   // constructor
   
/**
 * Declares variables.
 *
 * @param acctNumberIn Associates with acctNumber variable.
 * @param nameIn Associates with name variable.
 */
   public PreferredBuyer(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Preferred Buyer";
   }
   
         
   // methods
   
   /**
 * Calculates award points.
 *
 * @return Returns the award points.
 */
   public int calcAwardPoints() {
      int awardPoints = (int) calcSubtotal();
      return awardPoints;
   }
}