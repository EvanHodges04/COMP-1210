import java.io.FileNotFoundException;     

/**
 * Program implements methods from BuyerProcessor.
 *
 * Project 10
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/22/23
 */
public class BuyerPart2App {
   
   /**
    * Uses BuyerProcessor to format display.
    *
    * @param args Takes fileName input to be scanned.
    * @throws FileNotFoundException Throws error if file isn't located.
    */
   public static void main(String[] args) throws FileNotFoundException {
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.\n"
            + "Program ending.");
         return;
      }
      
      String fileName = args[0];
      
      BuyerProcessor process = new BuyerProcessor();
      process.readBuyerFile(fileName);
      process.generateReport();
      process.generateReportByName();
      process.generateReportByTotalPurchases();
      
   }
}
