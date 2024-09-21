import org.junit.Assert;
import org.junit.Test;

/**
 * Program for testing methods of Quatrefoil.
 *
 * Project 7B
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 3/14/23
 */
public class QuatrefoilTest {

/**
* Tests setLabel method.
*/
   @Test public void setLabelTest() {
      Quatrefoil ex1 = new Quatrefoil("string", 3.5);
      Assert.assertEquals(false, ex1.setLabel(null));
      Assert.assertEquals(true, ex1.setLabel("string"));
   }
   
   /**
* Tests setDiameter method.
*/
   @Test public void setDiameter() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", -1);
      Assert.assertEquals(false, ex1.setDiameter(-1));
      Assert.assertEquals(true, ex1.setDiameter(1));
   }
   
   /**
* Tests perimeter method.
*/
   @Test public void perimeterTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(10.996, ex1.perimeter(), .001);
   }
   
   /**
* Tests perimeterInFt method.
*/
   @Test public void perimeterInFtTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(0.916, ex1.perimeterInFt(), .001);
   }
   
   /**
* Tests area method.
*/
   @Test public void areaTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(7.873, ex1.area(), .001);
   }
   
   /**
* Tests areaInSqFt method.
*/
   @Test public void areaInSqFtTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(0.055, ex1.areaInSqFt(), .001);
   }
   
   /**
* Tests toString method.
*/
   @Test public void toStringTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertTrue(ex1.toString().contains("\"Small Example\""));
   }
   
   /**
* Tests getCount method.
*/
   @Test public void getCountTest() {
      Quatrefoil.resetCount();
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(1, ex1.getCount(), 0);
   }
   
   /**
* Tests equals method.
*/
   @Test public void equalsTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil("Medium Example", 38.44);
      Quatrefoil ex3 = new Quatrefoil("Small Example", 38.44);
      Assert.assertEquals(false, ex1.equals("string"));
      Assert.assertEquals(false, ex1.equals(ex2));
      Assert.assertEquals(false, ex1.equals(ex3));
      Assert.assertEquals(true, ex1.equals(ex1));
   }
   
   /**
* Tests hashCode method.
*/
   @Test public void hashCodeTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Assert.assertEquals(0, ex1.hashCode(), 0);
   }
   
   /**
* Tests compareTo method.
*/
   @Test public void compareToTest() {
      Quatrefoil ex1 = new Quatrefoil("Small Example", 3.5);
      Quatrefoil ex2 = new Quatrefoil("Medium Example", 38.44);
      Assert.assertEquals(0, ex1.compareTo(ex1), 0);
      Assert.assertEquals(-1, ex1.compareTo(ex2), 0);
      Assert.assertEquals(1, ex2.compareTo(ex1), 0);
   }
}