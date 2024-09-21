/**
 * Program is used to create online text item for app usage.
 *
 * Activity 9
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/4/23
 */
public abstract class OnlineTextItem extends InventoryItem {
   
   // constructor
   
/**
 * Declares variables.
 *
 * @param nameIn Associates with name variable.
 * @param priceIn Associates with price variable.
 */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
         
   // methods
   
   /**
 * Calculates cost.
 *
 * @return Returns the price.
 */
   public double calculateCost() {
      return price;
   }
}