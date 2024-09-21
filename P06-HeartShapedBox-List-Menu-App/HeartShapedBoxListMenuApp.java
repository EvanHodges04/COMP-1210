import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Provides a menu for usage of the previous two classes.
 *
 * Project 6
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 2/24/23
 */
public class HeartShapedBoxListMenuApp {

/**
 * Reads info from file and prints formatted display.
 *
 * @param args - is not used.
 * @throws FileNotFoundException required by Scanner for File.
 */
   public static void main(String[] args) throws FileNotFoundException {
   
      String hsbListName = "no list name";
      ArrayList<HeartShapedBox> myList = new ArrayList<HeartShapedBox>();
      HeartShapedBoxList myHeartShapedBoxList = new 
         HeartShapedBoxList(hsbListName, myList);
      String fileName = "no file name";
   
      String label = "";
      double radius, height;
   
      String code = "";
   
      Scanner scan = new Scanner(System.in);
   
      System.out.println("HeartShapedBox List System Menu\n"
         + "R - Read File and Create HeartShapedBox List\n"
         + "P - Print HeartShapedBox List\n"
         + "S - Print Summary\n"
         + "A - Add HeartShapedBox\n"
         + "D - Delete HeartShapedBox\n"
         + "F - Find HeartShapedBox\n"
         + "E - Edit HeartShapedBox\n"
         + "Q - Quit");
   
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q] : ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
      
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R':
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
               myHeartShapedBoxList = myHeartShapedBoxList.readFile(fileName);
               System.out.println("\tFile read in and "
                  + "HeartShapedBox List created\n");
               break;
         
            case 'P':
               System.out.println(myHeartShapedBoxList);
               break;
         
            case 'S':
               System.out.println("\n" + myHeartShapedBoxList.summaryInfo() 
                  + "\n");
               break;
            
            case 'A':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               
               myHeartShapedBoxList.addHeartShapedBox(label, radius, height);
               
               System.out.println("\t*** HeartShapedBox added ***\n");
               break;
               
            case 'D':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (myHeartShapedBoxList.deleteHeartShapedBox(label) != null) {
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
            
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               HeartShapedBox hsb = 
                  myHeartShapedBoxList.findHeartShapedBox(label);
               
               if (hsb != null) {
                  System.out.println(hsb + "\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
            
            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               
               if (myHeartShapedBoxList.editHeartShapedBox(label, radius, height))
               {
                  System.out.println("\t\"" + label + "\" successfully"
                                     + " edited\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'Q':
               break;
            
            default:
               System.out.println("\t*** invalid code ***\n");
               break;
         }
      
      } while (!code.equalsIgnoreCase("Q"));
   }
}