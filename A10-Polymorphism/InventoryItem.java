   /**
 * Program creates varibles and methods for app usage.
 *
 * Activity 9
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/4/23
 */
public class InventoryItem {
   
   // instance variables
   
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   // constructor
   
/**
 * Declares variables.
 *
 * @param nameIn Associates with name variable.
 * @param priceIn Associates with price variable.
 */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   // methods

/**
 * Gets name.
 *
 * @return Returns the name field.
 */
   public String getName() {
      return name;
   }
   
   /**
 * Calculates cost of price including tax.
 *
 * @return Returns the total price.
 */
   public double calculateCost() {
      double total = (price * (1 + taxRate));
      return total;
   }
   
   /**
 * Sets tax rate.
 *
 * @param taxRateIn Takes input to set tax rate.
 */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**
 * Formats display.
 *
 * @return Returns the formatted display.
 */
   public String toString() {
      String result = name + ": $" + calculateCost();
      return result;
   }
}