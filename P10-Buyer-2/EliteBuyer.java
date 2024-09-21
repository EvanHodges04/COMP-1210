import java.text.DecimalFormat;

/**
 * Program creates elite buyer class for calculations.
 *
 * Project 10
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/22/23
 */
public class EliteBuyer extends Buyer {
   
   // instance variables
   
   protected double discountRate = .05;
   
   // constructor
   
/**
 * Declares variables.
 *
 * @param acctNumberIn Associates with acctNumber variable.
 * @param nameIn Associates with name variable.
 */
   public EliteBuyer(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Elite Buyer";
   }
         
   // methods
   
   /**
   * Gets discount rate.
   *
   * @return Returns the discount rate.
   */
   public double getDiscountRate() {
      return discountRate;
   }
   
   /**
   * Sets the discount rate.
   *
   * @param discountRateIn Takes input for the new discount rate.
   */
   public void setDiscountRate(double discountRateIn) {
      discountRate = discountRateIn;
   }
   
   /**
 * Calculates award points.
 *
 * @return Returns the award points.
 */
   public int calcAwardPoints() {
      int awardPoints = (((int) calcSubtotal()) * 10);
      return awardPoints;
   }
   
   /**
   * Calculates the total before tax.
   *
   * @return Returns the subtotal.
   */
   public double calcSubtotal() {
      double value = 0;
      for (double i : purchases) {
         value += i;
      }
      double subtotal = (value - (value * discountRate));
      return subtotal;
   }
   
   /**
   * Formats the display.
   *
   * @return Returns the formatted display.
   */
   public String toString() {
      DecimalFormat f = new DecimalFormat("$#,##0.00");
      String output = category;
      return output + "\nAcctNo/Name: " + getAcctNumber()
         + " " + getName() + "\nSubtotal: " + f.format(calcSubtotal())
         + "\nTax: " + f.format((calcTotal() - calcSubtotal()))
         + "\nTotal: " + f.format(calcTotal()) + "\nAward Points: "
         + this.calcAwardPoints() + "\n(includes " + getDiscountRate()
         + " discount rate applied to Subtotal)"; 
   }     
}

