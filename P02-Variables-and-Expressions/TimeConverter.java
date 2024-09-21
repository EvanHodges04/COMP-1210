import java.util.Scanner;

/**
 * Prints different time measurements given seconds.
 *
 * Project 2
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 1/25/23
 */
public class TimeConverter {

   /**
    * Prompts user input then converts to other time measurements.
    *
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {
     
      Scanner userInput = new Scanner(System.in);
      int seconds = 0;
      
      System.out.print("Enter the raw time measurement in seconds: ");
      seconds = userInput.nextInt();
      
      if (seconds < 0) {
      
         System.out.println("Measurement must be non-negative!");
      }
      else {
      
         System.out.println("");
         System.out.println("Measurement by combined days, hours, "
               + "minutes, seconds:");
               
         int days = (seconds / 86400);
         System.out.println("\tdays: " + days);
         
         int hours = ((seconds % 86400) / 3600);
         System.out.println("\thours: " + hours);
         
         int minutes = (((seconds % 86400) % 3600) / 60);
         System.out.println("\tminutes: " + minutes);
         
         int secondsLeft = (((seconds % 86400) % 3600) % 60);
         System.out.println("\tseconds: " + secondsLeft);
         
         System.out.println("");
         System.out.print(seconds + " seconds = " + days + " days, "
            + hours + " hours, " + minutes + " minutes, "
            + secondsLeft + " seconds");     
      }
   }
}