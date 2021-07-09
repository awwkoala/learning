package basic;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayUtilsTest {

  private ArrayUtils arrUtils;

  @BeforeClass
  public void beforeClass() {
    arrUtils = new ArrayUtils();
  }

  @Test
  public void testFirstFiveLetters() {
    String[] expectedArr = {"a", "b", "c", "d", "e"};
    String[] actualArr = arrUtils.firstFiveLetters();
    Assert.assertEquals(actualArr, expectedArr);
  }

  @Test
  public void testTurnAroundThreeIntsPositiveNum() {
    int[] array = {1, 2, 3};
    int[] expectedArr = {3, 2, 1};
    int[] actualArr = arrUtils.turnAroundThreeInts(array);
    Assert.assertEquals(actualArr, expectedArr);
  }

  @Test
  public void testTurnAroundThreeIntsNegativeNum() {
    int[] array = {-1, -2, -3};
    int[] expectedArr = {-3, -2, -1};
    int[] actualArr = arrUtils.turnAroundThreeInts(array);
    Assert.assertEquals(actualArr, expectedArr);
  }

  @Test
  public void testTurnAroundThreeIntsPosNegNum() {
    int[] array = {1, -2, 3};
    int[] expectedArr = {3, -2, 1};
    int[] actualArr = arrUtils.turnAroundThreeInts(array);
    Assert.assertEquals(actualArr, expectedArr);
  }

  @Test(expectedExceptions = {RuntimeException.class})
  public void testTurnAroundThreeIntsLengthTooBig() {
    int[] array = {1, 2, 3, 4};
    arrUtils.turnAroundThreeInts(array);
  }

  @Test(expectedExceptions = {RuntimeException.class})
  public void testTurnAroundThreeIntsLengthTooSmall() {
    int[] array = {1, 2};
    arrUtils.turnAroundThreeInts(array);
  }

}
