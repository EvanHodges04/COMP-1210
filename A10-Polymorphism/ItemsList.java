/**
 * Program creates list of Inventory Items.
 *
 * Activity 10
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/11/23
 */
public class ItemsList {

   // instance variables
   
   private InventoryItem[] inventory;
   private int count;
   
   // constructor
   
/**
 * Declares variables.
 */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
         
   // methods
   
   /**
   * Adds an item to the inventory.
   *
   * @param itemIn Takes object to add to inventory.
   */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   
   /**
   * Calculates the total cost of the inventory.      
   *
   * @param electronicsSurcharge Takes input for surcharge.
   * @return Returns the total cost.      
   */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   
   /**
   * Formats the display.
   *
   * @return Returns the formatted display.
   */
   public String toString() {
      String output = "All inventory:\n\n";
   
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
   
      return output;
   } 
}