   /**
 * Creates exception for readBuyerFile.
 *
 * Project 11
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/28/23
 */
public class InvalidCategoryException extends Exception {
     /**
      * Defines category exception.
      *
      * @param category Takes input for category.
      */
   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category + "\"");
   }
}