import java.text.DecimalFormat;

/**
 * Program declares variables and creates methods for HeartShapedBoxApp.
 *
 * Project 6
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 2/24/23
 */
public class HeartShapedBox {
   
   // instance variables
   
   private String label = "";
   private double radius = 0;
   private double height = 0;
   
   // constructor
   
/**
 * Declares variables.
 *
 * @param labelIn Associates with label variable.
 * @param radiusIn Associates with radius variable.
 * @param heightIn Associates with height variable.
 */
   public HeartShapedBox(String labelIn, double radiusIn, double heightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setHeight(heightIn);
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
 * Gets radius.
 *
 * @return Returns the radius field.
 */
   public double getRadius() {
      return radius;
   }
    
/**
 * Sets radius.
 *
 * @param radiusIn Associated with radius field and used for boolean.
 * @return Returns true/false dependent on radius, and sets it.
 */
   public boolean setRadius(double radiusIn) {
      boolean isSet = false;
      if (radiusIn > 0) {
         radius = radiusIn;
         isSet = true;
      }
      return isSet;
   }
   
/**
 * Gets height.
 *
 * @return Returns the height field.
 */
   public double getHeight() {
      return height;
   }
   
/**
 * Sets height.
 *
 * @param heightIn Associated with height field and used for boolean.
 * @return Returns true/false dependent on height, and sets it.
 */
   public boolean setHeight(double heightIn) {
      boolean isSet = false;
      if (heightIn > 0) {
         height = heightIn;
         isSet = true;
      }
      return isSet;
   }
   
/**
 * Calculates the area of the heart shape.
 *
 * @return Returns the area.
 */
   public double heartShapedArea() {
      double heartShapedArea = (((Math.PI) * (Math.pow(radius, 2))) 
         + ((4) * (Math.pow(radius, 2))));
      return heartShapedArea;
   }
   
/**
 * Calculates the lateral surface area of the heart shape.
 *
 * @return Returns the lateral surface area.
 */
   public double lateralSurfaceArea() {
      double lateralSurfaceArea = ((height) * (((4) * (radius)) + ((2) 
         * (Math.PI) * (radius))));
      return lateralSurfaceArea;
   }
   
/**
 * Calculates the total surface area of the heart shape.
 *
 * @return Returns the total surface area.
 */
   public double totalSurfaceArea() {
      double totalSurfaceArea = (((2) * (((Math.PI) * (Math.pow(radius, 2))) 
         + ((4) * (Math.pow(radius, 2))))) + ((height) * (((4) 
         * (radius)) + ((2) * (Math.PI) * (radius)))));
      return totalSurfaceArea;
   }
   
/**
 * Calculates the volume of the heart shape.
 *
 * @return Returns the volume.
 */
   public double volume() {
      double volume = ((height) * (((Math.PI) * (Math.pow(radius, 2))) 
         + ((4) * (Math.pow(radius, 2)))));
      return volume;
   }
   
/**
 * Formats the display.
 *
 * @return Displays the information of the heart shape.
 */
   public String toString() {
      DecimalFormat f = new DecimalFormat("#,##0.0##");
      String output = "HeartShapedBox " + "\"" + label + "\" " 
         + "with radius " + f.format(radius) + " units and height " 
         + f.format(height) + " units:" + "\n" + "\theart shaped area = " 
         + f.format(heartShapedArea()) + " square units" + "\n" 
         + "\tlateral surface area = "
         + f.format(lateralSurfaceArea()) + " square units" + "\n"
         + "\ttotal surface area = " + f.format(totalSurfaceArea()) 
         + " square units" + "\n" + "\tvolume = " 
         + f.format(volume()) + " cubic units";
      return output;
   }
} 