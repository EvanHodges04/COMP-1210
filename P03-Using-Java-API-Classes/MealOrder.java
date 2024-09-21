import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Provides a summary of a customer's meal.
 *
 * Project 3
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 2/03/2023
 */
public class MealOrder {
   static final double DISCOUNT = 0.15;
   static final double DISCOUNT_THRESHOLD = 100.0;
   
/**
 * Allows for customer input of meal order; provides information.
 *
 * @param args Command line arguments - not used.
 */
   public static void main(String[] args) {
    // Variables and Objects
      String orderInfo;
      String orderNum;
      String orderName;
      int adultNum = 0;
      double adultPrice = 0;
      int childNum = 0;
      double childPrice = 0;
      double total = 0;
      int luckyNum = 0;
      Scanner userInput = new Scanner(System.in);
      DecimalFormat currency = new DecimalFormat("$#,##0.00");
      DecimalFormat lucky = new DecimalFormat("00000");
    // User input of order string
      System.out.print("Enter your order code: ");
      orderInfo = userInput.nextLine().trim();
    // Minimum order length
      if (11 > orderInfo.length()) {
         System.out.print("\nInvalid Order Code.\nOrder code must "
            + "have at least 12 characters.");
      }
      else {
       // Parse order name and number from input
         orderNum = orderInfo.substring(0, 12).trim();
         orderName = orderInfo.substring(12, orderInfo.length()).trim();
       // Order number
         adultNum = Integer.parseInt(orderNum.substring(0, 2));
         adultPrice = Double.parseDouble(orderNum.substring(2, 4) + "." 
            + orderNum.substring(4, 6));
         childNum = Integer.parseInt(orderNum.substring(6, 8));
         childPrice = Double.parseDouble(orderNum.substring(8, 10) + "." 
            + orderNum.substring(10, 12));
       // Print information
         System.out.println("\nName: " + orderName);
         System.out.println("Adult meals: " + adultNum + " at " 
            + currency.format(adultPrice));
         System.out.println("Child meals: " + childNum + " at " 
            + currency.format(childPrice));
       // Total calculation
         total = adultNum * adultPrice + childNum * childPrice;
       // Discount application
         if (total < DISCOUNT_THRESHOLD) {
            System.out.println("Total: " + currency.format(total));
         }
         else {
            System.out.println("Subtotal: " + currency.format(total));
            System.out.println("15% Discount: " 
               + currency.format(total * DISCOUNT * -1));
            System.out.println("Total: " 
               + currency.format(total - total * DISCOUNT));
         }
       // Lucky number
         luckyNum = (int) (Math.random() * 99998 + 1);
         System.out.print("Lucky Number: " + lucky.format(luckyNum));
      }
   }
}