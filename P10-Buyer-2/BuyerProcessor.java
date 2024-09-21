import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;   
   /**
 * Program creates methods for BuyerPart2App.
 *
 * Project 10
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/22/23
 */
public class BuyerProcessor {
   
   // instance variables
   
   private Buyer[] bArr;
   private String[] sArr;
   
   // constructor
   
/**
 * Declares variables.
 *
 */
   public BuyerProcessor() {
      bArr = new Buyer[0];
      sArr = new String[0];
   }    
       
   // methods
   
   /**
   * Gets the buyer array.
   *
   * @return Returns the buyer array.
   */
   public Buyer[] getBuyerArray() {
      return bArr;
   }
   
   /**
   * Gets the string array.
   *
   * @return Returns the string array.
   */
   public String[] getInvalidRecordsArray() {
      return sArr;
   }
   
   /**
   * Adds a buyer object to the buyer array.
   *
   * @param obj Takes buyer object input.
   */
   public void addBuyer(Buyer obj) {
      Buyer[] result = new Buyer[bArr.length + 1];
      result[result.length - 1] = obj;
      bArr = result;
   }
   
   /**
   * Adds a string to the string array.
   *
   * @param s Takes string input.
   */
   public void addInvalidRecord(String s) {
      String[] result = new String[sArr.length + 1];
      result[result.length - 1] = s;
      sArr = result;
   }
   
   /**
   * Adds buyer objects to the array field from data file.
   *
   * @param f Takes string for file name.
   * @throws FileNotFoundException Throws error if file isn't located.
   */
   public void readBuyerFile(String f) throws FileNotFoundException {
   
      Scanner scanFile = new Scanner(System.in);
      String fileName = scanFile.nextLine();
      File file = new File(fileName);
      
      while (scanFile.hasNextLine()) {
      
         String line = scanFile.nextLine();
         Scanner lineScanner = new Scanner(line);
         int category = lineScanner.nextInt();
         String acctNumber = lineScanner.next();
         String name = lineScanner.next();
         double[] purchases =
            new double[lineScanner.hasNextInt() ? lineScanner.nextInt() : 0];
         for (int i = 0; i < purchases.length; i++) {
            purchases[i] = lineScanner.nextDouble();
         }
         if (category == 1) {
            addBuyer(new PreferredBuyer(acctNumber, name));
         }
         else if (category == 2) {
            addBuyer(new EliteBuyer(acctNumber, name));
         }
         else if (category == 3) {
            addBuyer(new PremierEliteBuyer(acctNumber, name));
         }
         lineScanner.close();
      }
      scanFile.close();
   }
   
   /**
   * Generates a report of all buyer objects.
   *
   * @return Returns the formatted string.
   */
   public String generateReport() {
      String report = "----------------------------\n" + "Buyer Report\n"
         + "----------------------------\n";
      for (Buyer b : bArr) {
         report += b.toString() + "\n\n";
      }
      return report;
   }
   
   /**
   * Generates a report of all buyer objects sorted by name.
   *
   * @return Returns the formatted string.
   */
   public String generateReportByName() {
      Arrays.sort(bArr);
      String report = "----------------------------\n" 
         + "Buyer Report by Name\n"
         + "----------------------------\n";
      for (Buyer b : bArr) {
         report += b.toString() + "\n\n";
      }
      return report;
   }
   
   /**
   * Generates a report of all buyer objects sorted by total purchases.
   *
   * @return Returns the formatted string.
   */
   public String generateReportByTotalPurchases() {
      Arrays.sort(bArr, new TotalPurchasesCompare());
      String report = "----------------------------\n" 
         + "Buyer Report by Total Purchases\n"
         + "----------------------------\n";
      for (Buyer b : bArr) {
         report += b.toString() + "\n\n";
      }
      return report;
   }
}
   
