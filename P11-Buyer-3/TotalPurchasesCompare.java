import java.util.Comparator;

/**
 * Program creates comparison for BuyerPart2App.
 *
 * Project 11
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/28/23
 */
public class TotalPurchasesCompare implements Comparator<Buyer> {

/**
* Creates comparison by total purchases.
*
* @param b1 Creates first buyer object.
* @param b2 Creates second buyer object.
* @return Returns integer based on comparison.
*/
   public int compare(Buyer b1, Buyer b2) {
      if (b1.calcTotal() > b2.calcTotal()) {
         return -1;
      }
      if (b1.calcTotal() < b2.calcTotal()) {
         return 1;
      }
      else {
         return 0;
      }
   }
}