import java.text.DecimalFormat;

/**
 * Program creates an array of quatrefoils for testing.
 *
 * Project 8
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 3/31/23
 */
public class QuatrefoilList {
   
   // instance variables
   
   private String listName = "";
   private Quatrefoil[] qList;
   private int count = 0;
         
   // constructor
   
/**
 * Declares variables.
 *
 * @param listNameIn Associates with listName variable.
 * @param qListIn Associates with quatrefoilList variable.
 * @param countIn Associates with count variable.
 */
   public QuatrefoilList(String listNameIn, Quatrefoil[] qListIn, 
      int countIn) {
      listName = listNameIn;
      qList = qListIn;
      count = countIn;
   }
   
   // methods

/**
 * Gets name.
 *
 * @return Returns the listName field.
 */
   public String getName() {
      return listName;
   }

/**
 * Gets number of quatrefoils.
 *
 * @return Returns the count field.
 */
   public int numberOfQuatrefoils() {
      return count;
   }

/**
 * Calculates sum of all diameters.
 *
 * @return Returns the diameter total (0 if no quatrefoils).
 */
   public double totalDiameters() {
      double total = 0;
      
      if (count == 0) {
         return 0;
      }
      
      else {
         int i = 0;
         while (i < count) {
            total += qList[i].getDiameter();
            i++;
         }
         return total;
      }
   }
   
   /**
 * Calculates sum of all perimeters.
 *
 * @return Returns the perimeter total (0 if no quatrefoils).
 */
   public double totalPerimeters() {
      double total = 0;
   
      if (count == 0) {
         return 0;
      }
      
      else {
         int i = 0;
         while (i < count) {
            total += qList[i].perimeter();
            i++;
         }
         return total;
      }
   }
   
   /**
 * Calculates sum of all areas.
 *
 * @return Returns the area total (0 if no quatrefoils).
 */
   public double totalAreas() {
      double total = 0;
   
      if (count == 0) {
         return 0;
      }
      
      else {
         int i = 0;
         while (i < count) {
            total += qList[i].area();
            i++;
         }
         return total;
      }
   }
   
   /**
 * Calculates average of the diameters.
 *
 * @return Returns the diameter average (0 if no quatrefoils).
 */
   public double averageDiameter() {
      double total = 0;
      
      if (count == 0) {
         return 0;
      }
      
      else {
         int i = 0;
         while (i < count) {
            total += qList[i].getDiameter();
            i++;
         }
         double average = (total / count);
         return average;
      }
   }
   
   /**
 * Calculates average of the perimeters.
 *
 * @return Returns the perimeter average (0 if no quatrefoils).
 */
   public double averagePerimeter() {
      double total = 0;
      
      if (count == 0) {
         return 0;
      }
      
      else {
         int i = 0;
         while (i < count) {
            total += qList[i].perimeter();
            i++;
         }
         double average = (total / count);
         return average;
      }
   }
   
   /**
 * Calculates average of the areas.
 *
 * @return Returns the area average (0 if no quatrefoils).
 */
   public double averageArea() {
      double total = 0;
      
      if (count == 0) {
         return 0;
      }
      
      else {
         int i = 0;
         while (i < count) {
            total += qList[i].area();
            i++;
         }
         double average = (total / count);
         return average;
      }
   }
   
   /**
 * Formats the display.
 *
 * @return Returns the formatted display.
 */
   public String toString() {
      DecimalFormat f = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + getName() + " -----" 
         + "\nNumber of Quatrefoils: " + numberOfQuatrefoils() 
         + "\nTotal Diameters: " + f.format(totalDiameters()) + " inches" 
         + "\nTotal Perimeters: " + f.format(totalPerimeters()) + " inches" 
         + "\nTotal Areas: " + f.format(totalAreas()) + " square inches" 
         + "\nAverage Diameter: " + f.format(averageDiameter()) + " inches" 
         + "\nAverage Perimeter: " + f.format(averagePerimeter()) + " inches" 
         + "\nAverage Area: " + f.format(averageArea()) + " square inches";
      return output;
   }
   
   /**
 * Gets the list.  
 *
 * @return Returns the list.
 */
   public Quatrefoil[] getList() {
      return qList;
   }
   
   /**
 * Adds a quatrefoil to the list.
 *
 * @param labelIn Takes input for quatrefoil label.
 * @param diameterIn Takes input for quatrefoil diameter.
 */
   public void addQuatrefoil(String labelIn, double diameterIn) {
      Quatrefoil q = new Quatrefoil(labelIn, diameterIn);
      qList[numberOfQuatrefoils()] = q;
      count++;
   }
   
   /**
 * Finds a quatrefoil.
 *
 * @param labelIn Takes input for quatrefoil label to be found.
 * @return Returns the found quatrefoil.    
 */
   public Quatrefoil findQuatrefoil(String labelIn) {
      for (int i = 0; i < count; i++) {
         if (qList[i].getLabel().equalsIgnoreCase(labelIn)) {
            return qList[i];
         }
      }
      return null;
   }
   
   /**
 * Deletes a quatrefoil.
 *
 * @param labelIn Takes input for quatrefoil label to be deleted.
 * @return Returns the deleted quatrefoil. 
 */
   public Quatrefoil deleteQuatrefoil(String labelIn) {
      for (int i = 0; i < count; i++) {
         if (qList[i].getLabel().equalsIgnoreCase(labelIn)) {
            Quatrefoil q = qList[i];
            for (int j = i; j < (count - 1); j++) {
               qList[j] = qList[(j + 1)];
            }
            qList[(count - 1)] = null;
            count--;
            return q;
         }
      }
      return null;
   }
   
   /**
 * Edits a quatrefoil.
 *
 * @param labelIn Takes input for quatrefoil label to be found.
 * @param diameterIn Takes input for new quatrefoil diameter.
 * @return Returns true or false dependent if a quatrefoil was found.
 */
   public boolean editQuatrefoil(String labelIn, double diameterIn) {
      for (int i = 0; i < count; i++) {
         if (qList[i].getLabel().equalsIgnoreCase(labelIn)) {
            qList[i].setDiameter(diameterIn);
            return true;
         }
      }
      return false;
   }
   
   /**
 * Finds the quatrefoil with the largest diameter.
 *
 * @return Returns the quatrefoil with the largest diameter (0-no quatrefoils).
 */
   public Quatrefoil findQuatrefoilWithLargestDiameter() {
      if (count == 1) {
         return qList[0];
      }
      double largest = 0;
      Quatrefoil large = null;
      for (int i = 0; i < count; i++) {
         if (qList[i].getDiameter() > largest) {
            largest = qList[i].getDiameter();
            large = qList[i];
         }
      }
      return large;
   }
}