import java.util.Scanner;
import java.text.DecimalFormat;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

/**
 * Performs arithmetic given numerical input.
 *
 * Project 3
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 2/03/2023
 */
public class ExpressionEvaluator {

/**
 * Takes input for x and evaluates an expression.
 * 
 * @param args Command line arguments - not used.
 */
   public static void main(String[] args) {
    // Variables and Objects
      double x = 0;
      double result = 0;
      int deciLeft = 0;
      int deciRight = 0;
      int deciIndex = 0;
      int resultLen = 0;
      String resultStr;
      Scanner userInput = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#,##0.0###");
    // User input for x
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
    // Result calculation given x
      result = sqrt(abs(1.2 * pow(x, 3) - 10 * x + 1) 
              + pow(5 * pow(x, 4) - 7 * pow(x, 3), 2)) 
              / (pow(x, 2) + 10);
    // Print result
      System.out.println("Result: " + result);
    // Determine decimal places
      resultStr = Double.toString(result);
      resultLen = resultStr.length();
      deciIndex = resultStr.indexOf(".");
      deciLeft = deciIndex;
      deciRight = resultLen - ++deciIndex;
    // Print decimal places
      System.out.println("# of characters to left of decimal point: " 
         + deciLeft);
      System.out.println("# of characters to right of decimal point: " 
         + deciRight);
    // Format and print result
      System.out.print("Formatted Result: " + df.format(result));
   }
}