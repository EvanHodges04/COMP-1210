   /**
 * Program creates ItemList for testing.
 *
 * Activity 10
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/11/23
 */

public class InventoryListApp {
   
   /**
    * Creates Itemslist, adds items, and prints toString.
    *
    * @param args Command line arguments - not used.
    */
    

   public static void main(String[] args) {
   
      ItemsList myItems = new ItemsList();
      InventoryItem.setTaxRate(0.05);
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.println(myItems.toString());
      System.out.println("Total: " + myItems.calculateTotal(2.0));
      
   }
}
