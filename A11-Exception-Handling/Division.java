/**
 * Program creates methods for DivisionDriver.
 *
 * Activity 10
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/18/23
 */
public class Division {

/**
* Performs integer division.
*
* @param num Takes numerator input.
* @param denom Takes denominator input.
* @return Returns the division, or 0 if denominator is zero.
*/
   public static int intDivide(int num, int denom) {
      try {
         return (num / denom);
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
   
   /**
* Performs floating point division.
*
* @param numIn Takes numerator input.
* @param denomIn Takes denominator input.
* @return Returns the division.
*/
   public static float decimalDivide(int numIn, int denomIn) {
      if (denomIn == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      else {
         float num = (float) numIn;
         float denom = (float) denomIn;
         return (num / denom);
      }
   }
}