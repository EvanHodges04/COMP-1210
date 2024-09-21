import java.util.Scanner;
   
/**
 * Program created instances of HeartShapedBox and calls its methods.
 *
 * Project 4
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 2/10/23
 */
public class HeartShapedBoxApp {

/**
 * Takes user input for use in heart shape info.
 *
 * @param args Command line arguments - not used.
 */
   public static void main(String[] args) {
   
      String label;
      double radius;
      double height;
   
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter label, radius, and height for a "
         + "heart shaped box. ");
      System.out.print("\tlabel: ");
      label = scan.nextLine();
   
      System.out.print("\tradius: ");
      radius = Double.parseDouble(scan.nextLine());
      if (radius <= 0) {
         System.out.println("Error: radius must be greater than zero.");
         return;
      }
   
      System.out.print("\theight: ");
      height = Double.parseDouble(scan.nextLine());
      if (height <= 0) {
         System.out.println("Error: height must be greater than zero.");
         return;
      }
      HeartShapedBox hsb = new HeartShapedBox(label, radius, height);
      System.out.println("\n" + hsb);
   }
}