import java.text.DecimalFormat;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

/**
 * Represents a list of heart-shaped boxes.
 *
 * Project 6
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 2/24/23
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
   
   /**
* Gets the list.
*
 * @return Returns the list.
 */
   public ArrayList<HeartShapedBox> getList() {
      return hsbList;
   }
   
   /**
* Reads from the file.
*
 * @param fileNameIn File name.
 * @throws FileNotFoundException required by Scanner for File.
 * @return Returns HeartShapedBox found from file.
 */
   public HeartShapedBoxList readFile(String fileNameIn) 
      throws FileNotFoundException {
   
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<HeartShapedBox> myList = new ArrayList<HeartShapedBox>();
      String hsbListName = "";
      listName = scanFile.nextLine();
   
      while (scanFile.hasNext()) {
      
         String label = scanFile.nextLine();
         double radius = (double) (scanFile.nextDouble());
         double height = (double) (scanFile.nextDouble());
         
         String randomHold = scanFile.nextLine();
      
         HeartShapedBox hsb = new HeartShapedBox(label, radius, height);
         myList.add(hsb);
      }
      
      HeartShapedBoxList hsbL = new HeartShapedBoxList(listName, myList);
      return hsbL;
   }
   
     /**
* Adds a HeartShapedBox.
*
* @param labelIn Label.
* @param radiusIn Radius.
* @param heightIn Height.
 */
   public void addHeartShapedBox(String labelIn, 
      double radiusIn, double heightIn) {
      HeartShapedBox hsb = new HeartShapedBox(labelIn, radiusIn, heightIn);
      hsbList.add(hsb);
   }
   
     /**
* Finds the HeartShapedBox given.
*
* @param labelIn Label.
 * @return Returns the HeartShapedBox or nothing.
 */
   public HeartShapedBox findHeartShapedBox(String labelIn) {
      for (HeartShapedBox hsb : hsbList) {
         if (hsb.getLabel().equalsIgnoreCase(labelIn)) {
            return hsb;
         }
      }
      return null;
   }
   
     /**
* Deletes a HeartShapedBox.
*
* @param labelIn Label.
 * @return Returns the deleted box or nothing.
 */
   public HeartShapedBox deleteHeartShapedBox(String labelIn) {
      int loc = 0;
   
      for (HeartShapedBox hsb : hsbList) {
         if (hsb.getLabel().equalsIgnoreCase(labelIn)) {
            loc = hsbList.indexOf(hsb);
            hsbList.remove(loc);
            return hsb;
         }
      }
      return null;
   }
   
     /**
* Edits a HeartShapedBox.
*
* @param labelIn Label.
* @param radiusIn Radius.
* @param heightIn Height.
 * @return Returns the edited HeartShapedBox.
 */
   public boolean editHeartShapedBox(String labelIn, double radiusIn, 
      double heightIn) {
      boolean result = false;
      int loc = 0;
   
      for (HeartShapedBox hsb : hsbList) {
         if (hsb.getLabel().equalsIgnoreCase(labelIn)) {
            hsb.setRadius(radiusIn);
            hsb.setHeight(heightIn);
         
            result = true;
            break;
         }
      }
      return result;
   }   
}