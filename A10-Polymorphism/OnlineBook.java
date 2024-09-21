/**
 * Program is used to create online book for app usage.
 *
 * Activity 9
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/4/23
 */
public class OnlineBook extends OnlineTextItem {
   protected String author;
   
   // constructor
   
/**
 * Declares variables.
 *
 * @param nameIn Associates with name variable.
 * @param priceIn Associates with price variable.
 */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
         
   // methods
   
   /**
 * Sets author.
 *
 * @param authorIn Takes input to set author.
 */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
   
   /**
 * Formats the display.
 *
 * @return Returns the formatted display.
 */
   public String toString() {
      String result = name + " - " + author + ": $" + price;
      return result;
   }
}