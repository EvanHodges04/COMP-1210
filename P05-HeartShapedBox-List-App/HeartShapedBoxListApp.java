import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Uses HeartShapedBox and HeartShapedBoxList classes.
 *
 * Project 5
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 2/17/23
 */
public class HeartShapedBoxListApp {
 
 /**
 * Reads info from file and prints formatted display.
 *
 * @param args - is not used.
 * @throws FileNotFoundException required by Scanner for File.
 */
   public static void main(String[] args) throws FileNotFoundException {
   
      ArrayList<HeartShapedBox> myList = new ArrayList<HeartShapedBox>();
   
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
   
      Scanner scanFile = new Scanner(new File(fileName));
   
      String hsbListName = scanFile.nextLine();
   
      while (scanFile.hasNext()) {
      
         String label = scanFile.nextLine();
         double radius = (double) (scanFile.nextDouble());
         double height = (double) (scanFile.nextDouble());
         
         String randomHold = scanFile.nextLine();
      
         HeartShapedBox hsb = new HeartShapedBox(label, radius, height);
         myList.add(hsb);
      }
      scanFile.close();
   
      HeartShapedBoxList myBoxList = 
         new HeartShapedBoxList(hsbListName, myList);
   
      System.out.println(myBoxList);
   
      System.out.println(myBoxList.summaryInfo());
   }
}