import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;   
   /**
 * Program creates methods for BuyerPart2App.
 *
 * Project 11
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 4/28/23
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
      Buyer[] result = Arrays.copyOf(bArr, bArr.length + 1);
      result[result.length - 1] = obj;
      bArr = result;
   }
   
   /**
   * Adds a string to the string array.
   *
   * @param s Takes string input.
   */
   public void addInvalidRecord(String s) {
      String[] result = Arrays.copyOf(sArr, sArr.length + 1);
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
   
      Scanner scanFile = new Scanner(new File(f));
      while (scanFile.hasNextLine()) {
         String line = scanFile.nextLine();
         Scanner scanLine = new Scanner(line);
         try {
            int category = Integer.parseInt(scanLine.next());
            String acctNum = scanLine.next();
            String lastName = scanLine.next();
            String firstName = scanLine.next();
            String name = (lastName + ", " + firstName);
            double[] purchases = new double[0];
            while (scanLine.hasNext()) {
               double[] newPurchases = 
                  Arrays.copyOf(purchases, purchases.length + 1);
               newPurchases[purchases.length] = 
                  Double.parseDouble(scanLine.next());
               purchases = newPurchases;
            }
            scanLine.close();
            
            switch (category) {
               case 1:
                  PreferredBuyer label1 = new PreferredBuyer(acctNum, name);
                  label1.setPurchases(purchases);
                  addBuyer(label1);
                  break;
               
               case 2:
                  EliteBuyer label2 = new EliteBuyer(acctNum, name);
                  label2.setPurchases(purchases);
                  addBuyer(label2);
                  break;
               
               case 3:
                  PremierEliteBuyer label3 = 
                     new PremierEliteBuyer(acctNum, name);
                  label3.setPurchases(purchases);
                  addBuyer(label3);
                  break;
            
               default:
                  throw new 
                     InvalidCategoryException(Integer.toString(category));
            }
         }
         
         catch (InvalidCategoryException e) {
            String exception = "*** " + e + " in:\n" + line;
            addInvalidRecord(exception);
         }
         catch (NumberFormatException e) {
            String exception = "*** " + e + " in:\n" + line;
            addInvalidRecord(exception);
         }
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
   
   /**
   * Generates a report of all invalid records.
   *
   * @return Returns the formatted string.
   */
   public String generateInvalidRecordsReport() {
      Arrays.sort(bArr, new TotalPurchasesCompare());
      String report = "----------------------------\n" 
         + "Invalid Records Report\n"
         + "----------------------------\n";
      for (String s : sArr) {
         report += s.toString() + "\n\n";
      }
      return report;
   }
}
   
