import java.text.DecimalFormat;

/**
 * Program creates premier elite buyer class for calculations.
 *
 * Project 9
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/10/23
 */
public class PremierEliteBuyer extends EliteBuyer {
   
   // instance variables
   
   private int bonusAwardPoints = 1000;
   
   // constructor
   
/**
 * Declares variables.
 *
 * @param acctNumberIn Associates with acctNumber variable.
 * @param nameIn Associates with name variable.
 */
   public PremierEliteBuyer(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Premier Elite Buyer";
      discountRate = 0.15;
   }
         
   // methods
   
   /**
   * Gets bonus award points.
   *
   * @return Returns the bonus award points.
   */
   public int getBonusAwardPoints() {
      return bonusAwardPoints;
   }
   
   /**
   * Sets bonus award points.
   *
   * @param bonusAwardPointsIn Takes input for new value.
   */
   public void setBonusAwardPoints(int bonusAwardPointsIn) {
      bonusAwardPoints = bonusAwardPointsIn;
   }
   
   /**
 * Calculates award points.
 *
 * @return Returns the award points.
 */
   public int calcAwardPoints() {
      int awardPoints = (((int) calcSubtotal()) * 20);
      if ((int) calcSubtotal() > 500) {
         int additional = (awardPoints + getBonusAwardPoints());
         return additional;
      }
      return awardPoints;
   }
   
   /**
   * Formats the display.
   *
   * @return Returns the formatted display.
   */
   public String toString() {
      DecimalFormat f = new DecimalFormat("$#,##0.00");
      if ((int) calcSubtotal() > 500) {
         String output = category + "\nAcctNo/Name: " + getAcctNumber()
            + " " + getName() + "\nSubtotal: " + f.format(calcSubtotal())
            + "\nTax: " + f.format((calcTotal() - calcSubtotal()))
            + "\nTotal: " + f.format(calcTotal()) + "\nAward Points: "
            + this.calcAwardPoints() + "\n(includes " + getDiscountRate()
            + " discount rate applied to Subtotal)"
            + "\n(includes 1000 bonus points added to Award Points)";
         return output;
      }
      else {
         String other = category + "\nAcctNo/Name: " + getAcctNumber()
            + " " + getName() + "\nSubtotal: " + f.format(calcSubtotal())
            + "\nTax: " + f.format((calcTotal() - calcSubtotal()))
            + "\nTotal: " + f.format(calcTotal()) + "\nAward Points: "
            + this.calcAwardPoints() + "\n(includes " + getDiscountRate()
            + " discount rate applied to Subtotal)";
         return other;
      }
   }     
}