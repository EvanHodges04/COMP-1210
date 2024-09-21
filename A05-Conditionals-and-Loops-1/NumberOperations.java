   /**
 * Program declares variables and creates methods for NumberOpsDriver.
 *
 * Activity 5
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 2/14/23
 */
public class NumberOperations {

//instance variables

   private int number;

// contructor

   /**
    * Declares variable numberIn.
    *
    * @param numberIn Associates number with numberIn.
    */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }

// methods

   /**
    * Gets the number.
    *
    * @return Returns the number.
    */
   public int getValue() {
      return number;
   }

   /**
    * Finds values containing the positive odd integers less than the number.
    *
    * @return Returns those values.
    */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }

   /**
    * Finds values containing the positive powers of two less than the
    * value of the number.
    *
    * @return Returns those values.
    */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   
   /**
    * Compares the number to another given number.
    *
    * @return Returns one of three integers dependent on the 
    * comparison of the two numbers.
    * @param compareNumber Provides the number for comparison.
    */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }

   /**
    * Concatenates the number and an empty string.
    *
    * @return Returns the string.
    */
   public String toString() {
      return number + "";
   }
}