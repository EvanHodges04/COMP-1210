import java.util.Scanner;

/**
 * Solves a formula given inputs x, y, and z.
 *
 * Project 2
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 1/25/23
 */
public class ExpressionSolver {

   /**
    * Prompts user inputs then finds solution to given formula.
    *
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {
     
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double y = 0;
      double z = 0;
      
      System.out.println("result = (7.1x + 3.6) (5.0y + 4.9) " 
            + "(2.5z - 5.2) / xyz");
      
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
      
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
            
      if (x * y * z == 0) {
      
         System.out.println("result is undefined");
      
      }
      else {
         double result = 0;
         result = ((7.1 * x + 3.6) * (5.0 * y + 4.9) * (2.5 * z - 5.2)) 
               / (x * y * z);
         System.out.println("result = " + result);
      
      }
   
   }
}