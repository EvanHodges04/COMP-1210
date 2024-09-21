/**
 * Program declares variables and creates methods for UserInfoDriver.
 *
 * Activity 4
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 2/7/23
 */
public class UserInfo {
   
   // instance variables
   
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   // constructor
   
   /**
    * Declares variables.      
    *
    * @param firstNameIn Associates with firstName variable for display.
    * @param lastNameIn Associates with lastName variable for display.
    */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
      
   }
   
   // methods
   
   /**
    * Creates display.      
    *
    * @return Returns Offline or Online given status type.
    */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
   
   /**
    * Sets location.      
    *
    * @param locationIn Associates with location variable for display.
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }

   /**
    * Sets age.      
    *
    * @param ageIn Associates with age variable for display.
    * @return Verifies if the age has been set.
    */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
    * Get age.     
    *
    * @return Returns age.
    */
   public int getAge() {
      return age;
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
    * Sets status to OFFLINE.      
    *
    */
   public void logOff() {
      status = OFFLINE;
   }
   
   /**
    * Sets status to ONLINE.      
    *
    */
   public void logOn() {
      status = ONLINE;
   }
   
}