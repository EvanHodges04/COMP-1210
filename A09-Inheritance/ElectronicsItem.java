/**
 * Program is used to create electronic item for app usage.
 *
 * Activity 9
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/4/23
 */
public class ElectronicsItem extends InventoryItem {

   // instance variables
   
   protected double weight;
   /**
   * Sets constant value for the shipping cost to 1.5.
   */
   public static final double SHIPPING_COST = 1.5;
   
   // constructor
   
/**
 * Declares variables.
 *
 * @param nameIn Associates with name variable.
 * @param priceIn Associates with price variable.
 * @param weightIn Associates with weight variable.
 */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
         
   // methods
   
   /**
 * Calculates the cost including tax and shipping.
 *
 * @return Returns total cost.
 */
   public double calculateCost() {
      double updated = (super.calculateCost() + (SHIPPING_COST * weight));
      return updated;
   }
}