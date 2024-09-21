import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Represents a list of heart-shaped boxes.
 *
 * Project 5
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 2/17/23
 */
public class HeartShapedBoxList {
 
   private String listName;
   private ArrayList<HeartShapedBox> hsbList;
 
 /**
 * Creates a BoxList object.
 *
 * @param listNameIn Associates listNameIn with listName.
 * @param hsbListIn Associates hsbListIn with hsbList.
 */
   public HeartShapedBoxList(String listNameIn, 
      ArrayList<HeartShapedBox> hsbListIn) {
      listName = listNameIn;
      hsbList = hsbListIn;
   }
 
 /**
 * The list name.
 *
 * @return Returns the list name.
 */
   public String getName() {
      return listName;
   }
 
 /**
 * The number of boxes.
 *
 * @return Returns the number of boxes.
 */
   public int numberOfHeartShapedBoxes() {
      return hsbList.size();
   }
 
 /**
 * The grand total of the surface areas.
 *
 * @return Returns the grand total of the surface areas.
 */
   public double grandTotalSurfaceArea() {
      double total = 0;
   
      int index = 0;
      while (index < hsbList.size()) {
         total += hsbList.get(index).totalSurfaceArea();
         index++;
      }
   
      return total;
   }
 
 /**
 * The total volume.
 *
 * @return Returns the total volume.
 */
   public double totalVolume() {
      double total = 0;
   
      int index = 0;
      while (index < hsbList.size()) {
         total += hsbList.get(index).volume();
         index++;
      }
   
      return total;
   }
 
 /**
 * The average total surface area.
 *
 * @return Returns the average total surface area.
 */
   public double averageTotalSurfaceArea() {
      if (hsbList.size() == 0) {
         double total = 0;
         return total;
      }
      else {
         double surfaceArea = 0;
      
         int index = 0;
         while (index < hsbList.size()) {
            surfaceArea += hsbList.get(index).totalSurfaceArea();
            index++;
         }
         double total = (surfaceArea / hsbList.size());
         return total;
      }
   }
   
 /**
 * The average total volume.
 *
 * @return Returns the average total volume.
 */
   public double averageVolume() {
      if (hsbList.size() == 0) {
         double total = 0;
         return total;
      }
      else {
         double volume = 0;
      
         int index = 0;
         while (index < hsbList.size()) {
            volume += hsbList.get(index).volume();
            index++;
         }
         double total = (volume / hsbList.size());
         return total;
      }
   }

/**
* Formats the display.
*
 * @return Returns the formatted display.
 */
   public String toString() {
      String result = "\n" + "----- " + listName + " -----" + "\n";
      int index = 0;
      while (index < hsbList.size()) {
         result += "\n" + hsbList.get(index) + "\n";
         index++;
      }
      return result;
   }
   
/**
* Formats the summary display.
*
 * @return Returns the formatted summary display.
 */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----";
      result += "\nNumber of HeartShapedBoxes: " + numberOfHeartShapedBoxes();
      result += "\nTotal Surface Area: " + grandTotalSurfaceArea() 
         + " square units";
      result += "\nTotal Volume: " + totalVolume() + " cubic units";
      result += "\nAverage Surface Area: " + averageTotalSurfaceArea() 
         + " square units";
      result += "\nAverage Volume: " + averageVolume() + " cubic units";
   
      return result;
   }
}