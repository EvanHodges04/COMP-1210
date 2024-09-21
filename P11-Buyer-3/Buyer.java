import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * Program provides methods and variables that other classes derive from.
 *
 * Project 11
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/28/23
 */
public abstract class Buyer implements Comparable<Buyer> {
   
   // instance variables
   
   protected String category;
   protected String acctNumber;
   protected String name;
   protected double[] purchases;
   
   /**
   * Constant value for sales tax rate.
   */
   public static final double SALES_TAX_RATE = 0.08;
   
   // constructor
   
/**
 * Declares variables.
 *
 * @param nameIn Associates with name variable.
 * @param acctNumberIn Associates with acctNumber variable.
 */
   public Buyer(String acctNumberIn, String nameIn) {
      acctNumber = acctNumberIn;
      name = nameIn;
      purchases = new double[0];
   }
   
   // methods

/**
 * Gets account number.
 *
 * @return Returns the acctNumber field.
 */
   public String getAcctNumber() {
      return acctNumber;
   }

/**
 * Sets the account number.
 *
 * @param acctNumberIn Takes input for new account number.
 */
   public void setAcctNumber(String acctNumberIn) {
      acctNumber = acctNumberIn;
   }

/**
 * Gets name.
 *
 * @return Returns the name field.
 */
   public String getName() {
      return name;
   }

/**
 * Sets the name.
 *
 * @param nameIn Takes input for new name.
 */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
 * Gets the purchases.
 *
 * @return Returns the purchases field.
 */
   public double[] getPurchases() {
      return purchases;
   }
   
   /**
 * Sets the name.
 *
 * @param purchasesIn Takes input for new purchases.
 */
   public void setPurchases(double[] purchasesIn) {
      purchases = purchasesIn;
   }
   
   /**
   * Adds purchases.
   *
   * @param addedPurchases Takes input for the additional purchases.
   */
   public void addPurchases(double... addedPurchases) {
      double[] result = new double[purchases.length + addedPurchases.length];
      System.arraycopy(purchases, 0, result, 0, purchases.length);
      System.arraycopy(addedPurchases, 0, result, purchases.length, 
         addedPurchases.length);
      purchases = result;
   }
   
   /**
   * Deletes purchases.
   *
   * @param deletedPurchases Takes input for the purchases to be deleted.
   */
   public void deletePurchases(double... deletedPurchases) {
      for (double amount : deletedPurchases) {
         for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == amount) {
               System.arraycopy(purchases, i + 1, purchases, i, 
                  purchases.length - i - 1);
               purchases = Arrays.copyOf(purchases, purchases.length - 1);
               break;
            }
         }
      }         
   }
   
   /**
   * Calculates the total before tax.
   *
   * @return Returns the subtotal.
   */
   public double calcSubtotal() {
      double subtotal = 0;
      for (double i : purchases) {
         subtotal += i;
      }
      return subtotal;
   }
   
   /**
   * Calculates the total with tax.
   *
   * @return Returns the total.
   */
   public double calcTotal() {
      double total = (calcSubtotal() + (calcSubtotal() * SALES_TAX_RATE));
      return total;
   }
   
   /**
   * Formats the display.
   *
   * @return Returns the formatted display.
   */
   public String toString() {
      DecimalFormat f = new DecimalFormat("$#,##0.00");
      String output = category + "\nAcctNo/Name: " + getAcctNumber()
         + " " + getName() + "\nSubtotal: " + f.format(calcSubtotal())
         + "\nTax: " + f.format((calcTotal() - calcSubtotal()))
         + "\nTotal: " + f.format(calcTotal()) + "\nAward Points: "
         + calcAwardPoints();
      return output;
   }
   
   /**
 * Initializes calcAwardPoints() method.
 *
 * @return Returns nothing until overriden.
 */
   public abstract int calcAwardPoints();
   
   /**
 * Compares One buyer type's name with another.  
 *
 * @param obj Takes input for a buyer type object.
 * @return Returns an integer representing the comparison.
 */
   public int compareTo(Buyer obj) {
      return this.name.compareTo(obj.getName());
   }
}
