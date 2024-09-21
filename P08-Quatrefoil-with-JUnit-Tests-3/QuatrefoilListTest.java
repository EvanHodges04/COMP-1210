import org.junit.Assert;
import org.junit.Test;

/**
 * Program tests QuatrefoilList's methods.
 *
 * Project 8
 * @author Evan Hodges - COMP-1210 - Section 001
 * @version 3/31/23
 */
public class QuatrefoilListTest {
   /**
* Tests getName method.
*/
   @Test public void getNameTest() {
      QuatrefoilList ex1 = new QuatrefoilList("ex1", null, 0);
      Assert.assertEquals("ex1", ex1.getName());
   }

/**
* Tests numberOfQuatrefoils method.
*/
   @Test public void numberOfQuatrefoilsTest() {
      QuatrefoilList ex1 = new QuatrefoilList("ex1", null, 0);
      Assert.assertEquals(0, ex1.numberOfQuatrefoils(), 0);
   }
   
   /**
* Tests totalDiameters method.
*/
   @Test public void totalDiametersTest() {
      QuatrefoilList ex1 = new QuatrefoilList("ex1", new Quatrefoil[1], 0);
      ex1.addQuatrefoil("Small Example", 3.5);
      Assert.assertEquals(3.5, ex1.totalDiameters(), 0);
      ex1.deleteQuatrefoil("Small Example");
      Assert.assertEquals(0, ex1.totalDiameters(), 0);
   }
   
   /**
* Tests totalPerimeters method.
*/
   @Test public void totalPerimetersTest() {
      QuatrefoilList ex1 = new QuatrefoilList("ex1", new Quatrefoil[1], 0);
      ex1.addQuatrefoil("Small Example", 3.5);
      Assert.assertEquals(10.995, ex1.totalPerimeters(), 0.001);
      ex1.deleteQuatrefoil("Small Example");
      Assert.assertEquals(0, ex1.totalPerimeters(), 0);
   }
   
   /**
* Tests totalAreas method.
*/
   @Test public void totalAreasTest() {
      QuatrefoilList ex1 = new QuatrefoilList("ex1", new Quatrefoil[1], 0);
      ex1.addQuatrefoil("Small Example", 3.5);
      Assert.assertEquals(7.873, ex1.totalAreas(), 0.001);
      ex1.deleteQuatrefoil("Small Example");
      Assert.assertEquals(0, ex1.totalAreas(), 0);
   }
   
   /**
* Tests averageDiameter method.
*/
   @Test public void averageDiameterTest() {
      QuatrefoilList ex1 = new QuatrefoilList("ex1", new Quatrefoil[1], 0);
      ex1.addQuatrefoil("Small Example", 3.5);
      Assert.assertEquals(3.5, ex1.averageDiameter(), 0);
      ex1.deleteQuatrefoil("Small Example");
      Assert.assertEquals(0, ex1.averageDiameter(), 0);
   }
   
   /**
* Tests averagePerimeter method.
*/
   @Test public void averagePerimeterTest() {
      QuatrefoilList ex1 = new QuatrefoilList("ex1", new Quatrefoil[1], 0);
      ex1.addQuatrefoil("Small Example", 3.5);
      Assert.assertEquals(10.995, ex1.averagePerimeter(), 0.001);
      ex1.deleteQuatrefoil("Small Example");
      Assert.assertEquals(0, ex1.averagePerimeter(), 0);
   }
   
   /**
* Tests averageArea method.
*/
   @Test public void averageAreaTest() {
      QuatrefoilList ex1 = new QuatrefoilList("ex1", new Quatrefoil[1], 0);
      ex1.addQuatrefoil("Small Example", 3.5);
      Assert.assertEquals(7.873, ex1.averageArea(), 0.001);
      ex1.deleteQuatrefoil("Small Example");
      Assert.assertEquals(0, ex1.averageArea(), 0);
   }
   
   /**
* Tests toString method.
*/
   @Test public void toStringTest() {
      QuatrefoilList ex1 = new QuatrefoilList("ex1", new Quatrefoil[1], 0);
      ex1.addQuatrefoil("Small Example", 3.5);
      Assert.assertTrue(ex1.toString().contains("----- Summary for ex1 -----"));
   }
   
   /**
* Tests getList method.
*/
   @Test public void getListTest() {
      QuatrefoilList ex1 = new QuatrefoilList("ex1", new Quatrefoil[1], 0);
      ex1.addQuatrefoil("Small Example", 3.5);
      Quatrefoil[] test = new Quatrefoil[1];
      test[0] = new Quatrefoil("Small Example", 3.5);
      Assert.assertArrayEquals(test, ex1.getList());
   }
   
   /**
* Tests findQuatrefoil method.
*/
   @Test public void findQuatrefoilTest() {
      QuatrefoilList ex1 = new QuatrefoilList("ex1", new Quatrefoil[1], 0);
      ex1.addQuatrefoil("Small Example", 3.5);
      Assert.assertEquals(ex1.getList()[0], 
         ex1.findQuatrefoil("Small Example"));
      Assert.assertEquals(null, ex1.findQuatrefoil("wrong"));
   }
   
   /**
* Tests deleteQuatrefoil method.
*/
   @Test public void deleteQuatrefoilTest() {
      QuatrefoilList ex1 = new QuatrefoilList("ex1", new Quatrefoil[2], 0);
      ex1.addQuatrefoil("Small Example", 3.5);
      ex1.addQuatrefoil(" Medium Example ", 38.44);
      Assert.assertEquals(ex1.getList()[0], 
         ex1.deleteQuatrefoil("Small Example"));
      Assert.assertEquals(null, ex1.deleteQuatrefoil("wrong"));
   }
   
   /**
* Tests editQuatrefoil method.
*/
   @Test public void editQuatrefoilTest() {
      QuatrefoilList ex1 = new QuatrefoilList("ex1", new Quatrefoil[2], 0);
      ex1.addQuatrefoil("Small Example", 3.5);
      ex1.addQuatrefoil(" Medium Example ", 38.44);
      Assert.assertEquals(true, ex1.editQuatrefoil("Small Example", 2));
      ex1.editQuatrefoil("Small Example", 2);
      Quatrefoil ex = new Quatrefoil("Small Example", 2);
      Assert.assertEquals(ex, ex1.getList()[0]);
      Assert.assertEquals(false, ex1.editQuatrefoil("wrong", 3));
   }
   
   /**
* Tests findQuatrefoilWithLargestDiameter method.
*/
   @Test public void findQuatrefoilWithLargestDiameterTest() {
      QuatrefoilList ex1 = new QuatrefoilList("ex1", new Quatrefoil[2], 0);
      ex1.addQuatrefoil("Small Example", 3.5);
      Assert.assertEquals(ex1.getList()[0], 
         ex1.findQuatrefoilWithLargestDiameter());
      ex1.addQuatrefoil(" Medium Example ", 38.44);
      Assert.assertEquals(ex1.getList()[1], 
         ex1.findQuatrefoilWithLargestDiameter());
      QuatrefoilList ex2 = new QuatrefoilList("ex2", new Quatrefoil[2], 0);
      Assert.assertEquals(null, ex2.findQuatrefoilWithLargestDiameter());
      QuatrefoilList ex3 = new QuatrefoilList("ex2", new Quatrefoil[2], 0);
      ex3.addQuatrefoil("Small Example", 3.5);
      ex3.addQuatrefoil("Medium Example", 3.5);
      Assert.assertEquals(ex3.getList()[0], 
         ex3.findQuatrefoilWithLargestDiameter());
   }
}