import java.io.FileNotFoundException;     

/**
 * Program implements methods from BuyerProcessor.
 *
 * Project 11
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/28/23
 */
public class BuyerPart3App {
   
   /**
    * Uses BuyerProcessor to format display.
    *
    * @param args Takes fileName input to be scanned.
    */
   public static void main(String[] args) {
      String[] s = new String[0];
      try {
         if (args.length == s.length) {
            System.out.println("File name expected as command line argument.");
            System.out.println("Program ending.");
         }
         else {
            BuyerProcessor b1 = new BuyerProcessor();
            b1.readBuyerFile(args[0]);
            System.out.println(b1.generateReport());
            System.out.println(b1.generateReportByName());
            System.out.println(b1.generateReportByTotalPurchases());
            System.out.println(b1.generateInvalidRecordsReport());
         }
      }
      catch (FileNotFoundException ex) {
         System.out.println("Attempted to read file: " 
            + args[0] + " (No such file or directory)");
         System.out.println("Program ending.");
      }
   }
}
