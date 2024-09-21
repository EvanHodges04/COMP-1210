
/**
 * Program to test array instantiation and loop usage.
 *
 * Activity 8
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 3/28/23
 */
public class Scores {
   
   // instance variables
   
   private int[] numbers;
         
   // constructor
   
   /**
   * Constructor.
   *
   * @param numbersIn Associates with numbers variable.
   */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   
   // methods

/**
* Finds the even integers.
*
* @return Returns the integers.
*/
   public int[] findEvens() {
      int numberEvens = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      int[] evens = new int[numberEvens];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   
   /**
   * Finds the odd integers.
   *
   * @return Returns the integers.
   */
   public int[] findOdds() {
      int numberOdds = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            numberOdds++;
         }
      }
      int[] odds = new int[numberOdds];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   
   /**
   * Calculates the average of the integers.
   *
   * @return Returns the average.
   */
   public double calculateAverage() {
      int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      double doubleSum = sum;
      return doubleSum / numbers.length;
   }
   
   /**
   * Formats the display.
   *
   * @return Returns the formatted display.
   */
   public String toString() {
      String result = "";
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
   }
   
   /**
   * Formats the display in reverse.
   *
   * @return Returns the reversed formatted display.
   */
   public String toStringInReverse() {
      String result = "";
      for (int i = numbers.length - 1; i > -1; i--) {
         result += numbers[i] + "\t";
      }
      return result;
   }
}