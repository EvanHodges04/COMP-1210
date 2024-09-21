/**
 * Program designs Customer for testing.
 *
 * Activity 7B
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 3/21/23
 */
public class Customer {
   private String name;
   private String location;
   private double balance;
 
   /**
 * Declares instance variables.    
 *
 * @param nameIn Associates with label variable.
 */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
 
       /**
 * Sets location.  
 *
 * @param locationIn Associates with location variable.
 */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
 
           /**
 * Sets location.  
 *
 * @param city Takes the first string for formatting location.
 * @param state Takes the second string for formatting location.
 */  
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
 
           /**
 * Changes balance.  
 *
 * @param amount Takes a double to modify balance.    
 */
   public void changeBalance(double amount) {
      balance = (balance + amount);
   }
 
           /**
 * Gets location.  
 *
 * @return Returns location.
 */
   public String getLocation() {
      return location;
   }
 
             /**
 * Gets balance.  
 *
 * @return Returns balance.
 */
   public double getBalance() {
      return balance;
   }
   
  /**
 * Formats display.  
 *
 * @return Returns formatted display.
 */
   public String toString() {
      String output = name + "\n" + getLocation()
         + "\n$" + getBalance();
      return output;
   }
   
               /**
 * Compares two customers. 
 *
 * @param obj Gets a customer object for comparison.
 * @return Returns an int value dependent on the comparison.
 */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
}
