import java.text.DecimalFormat;

/**
 * Program designs quatrefoil for testing.
 *
 * Project 7A
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 3/17/23
 */
public class Quatrefoil {
   
   // instance variables
   
   private String label = "";
   private double diameter = 0;
   private static int count = 0;
   
   // constructor
   
/**
 * Declares variables and increments class variable.
 *
 * @param labelIn Associates with label variable.
 * @param diameterIn Associates with radius variable.
 */
   public Quatrefoil(String labelIn, double diameterIn) {
      setLabel(labelIn);
      setDiameter(diameterIn);
      count++;
   }
   
   // methods

/**
 * Gets label.
 *
 * @return Returns the label field.
 */
   public String getLabel() {
      return label;
   }
   
/**
 * Sets label.
 *
 * @param labelIn Associated with label field and used for boolean.
 * @return Returns true/false dependent on label, and trims/sets it.
 */
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   
/**
 * Gets diameter.
 *
 * @return Returns the diameter field.
 */
   public double getDiameter() {
      return diameter;
   }
    
/**
 * Sets diameter.
 *
 * @param diameterIn Associates with diameter field and used for boolean.
 * @return Returns true/false dependent on diameter, and sets it.
 */
   public boolean setDiameter(double diameterIn) {
      boolean isSet = false;
      if (diameterIn > 0) {
         diameter = diameterIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
 * Calculates the perimeter of the quatrefoil.
 *
 * @return Returns the perimeter.
 */
   public double perimeter() {
      double perimeter = ((Math.PI) * (diameter));
      return perimeter;
   }
   
   /**
 * Calculates the perimeter in feet of the quatrefoil.
 *
 * @return Returns the perimeter in feet.
 */
   public double perimeterInFt() {
      double perimeterInFt = (((Math.PI) * (diameter)) / (12));
      return perimeterInFt;
   }
   
   /**
 * Calculates the area of the quatrefoil.
 *
 * @return Returns the area.
 */
   public double area() {
      double radius = ((diameter) / (2));
      double area = ((Math.pow(radius, 2)) + ((2) * (((Math.PI) 
         * (Math.pow(radius, 2))) / (4))));
      return area;
   }
   
   /**
 * Calculates the area in square feet of the quatrefoil.
 *
 * @return Returns the area in square feet.
 */
   public double areaInSqFt() {
      double radius = ((diameter) / (2));
      double areaInSqFt = (((Math.pow(radius, 2)) + ((2) * (((Math.PI) 
         * (Math.pow(radius, 2))) / (4)))) / (144));
      return areaInSqFt;
   }
   
/**
 * Formats the display.
 *
 * @return Displays the information of the quatrefoil.
 */
   public String toString() {
      DecimalFormat f = new DecimalFormat("#,##0.0##");
      String output = "Quatrefoil " + "\"" + label + "\" " 
         + "with diameter " + f.format(getDiameter()) + " inches has:" 
         + "\n" + "\tperimeter = " + f.format(perimeter()) 
         + " inches (or " + f.format(perimeterInFt()) + " feet)"
         + "\n" + "\tarea = " + f.format(area())
         + " square inches (or " + f.format(areaInSqFt())
         + " square feet)";
      return output;
   }
   
   /**
 * Gets the count.
 *
 * @return Returns number of quatrefoils.
 */
   public static int getCount() {
      return count;
   }
   
   /**
 * Sets count to 0.
  */
   public static void resetCount() {
      count = 0;
   }
   
   /**
 * Determines if two quatrefoils have the same field values.
 *
 * @param obj Associated with quatrefoil object. 
 * @return Returns true or false dependent on quatrefoil information.
 */
   public boolean equals(Object obj) {
      if (!(obj instanceof Quatrefoil)) {
         return false;
      }
      else {
         Quatrefoil qf = (Quatrefoil) obj;
         return (label.equalsIgnoreCase(qf.getLabel())
            && Math.abs(diameter - qf.getDiameter()) < .000001);
      }
   } 
   
   /**
 * Method required by Checkstyle.
 *
 * @return Returns 0.
 */
   public int hashCode() {
      return 0;
   }
}
