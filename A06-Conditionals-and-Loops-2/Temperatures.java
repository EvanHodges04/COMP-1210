import java.util.ArrayList;

/**
 * Declares variable and methods for TemperatureInfo.
 *
 * Activity 6
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 2/21/23
 */

public class Temperatures {

   private ArrayList<Integer> temperatures;

   /**
    * Declares Takes an ArrayList of integer values.
    *
    * @param temperaturesIn Associates temperatures variable.
    */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }

   /**
    * Finds the lowest temperature.
    *
    * @return Returns that value or 0.
    */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }

   /**
    * Finds the highest temperature.
    *
    * @return Returns that value or 0.
    */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }

   /**
    * Compares int value to getLowTemp's return.
    *
    * @param lowIn Takes integer value for comparison.
    * @return Returns lowIn or getLowTemp's return based on boolean.
    */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }

   /**
    * Compares int value to getHighTemp's return.
    *
    * @param highIn Takes integer value for comparison.
    * @return Returns highIn or getHighTemp's return based on boolean.
    */   
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }

   /**
    * Creates display.
    *
    * @return Returns format for display.
    */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }

}