/**
 * Program is used to create online article for app usage.
 *
 * Activity 9
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/4/23
 */
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;
   
   // constructor
   
/**
 * Declares variables.
 *
 * @param nameIn Associates with name variable.
 * @param priceIn Associates with price variable.
 */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
         
   // methods
   
   /**
 * Sets the word count.
 *
 * @param wordCountIn Takes input to set word count.
 */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}