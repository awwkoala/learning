package basic;

import org.assertj.core.api.Assertions;
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
    Assertions.assertThat(actualArr).describedAs("first five letters of alphabet are printed")
      .isEqualTo(expectedArr);
  }

  @Test
  public void testTurnAroundThreeIntsPositiveNum() {
    int[] array = {1, 2, 3};
    int[] expectedArr = {3, 2, 1};
    int[] actualArr = arrUtils.turnAroundThreeInts(array);
    Assertions.assertThat(actualArr).describedAs("integers array of three only positive integers is reversed")
      .isEqualTo(expectedArr);
  }

  @Test
  public void testTurnAroundThreeIntsNegativeNum() {
    int[] array = {-1, -2, -3};
    int[] expectedArr = {-3, -2, -1};
    int[] actualArr = arrUtils.turnAroundThreeInts(array);
    Assertions.assertThat(actualArr).describedAs("integers array of three only negative integers is reversed")
      .isEqualTo(expectedArr);
  }

  @Test
  public void testTurnAroundThreeIntsPosNegNum() {
    int[] array = {1, -2, 3};
    int[] expectedArr = {3, -2, 1};
    int[] actualArr = arrUtils.turnAroundThreeInts(array);
    Assertions.assertThat(actualArr).describedAs("integers array of three both positive and negative " +
      "integers is reversed").isEqualTo(expectedArr);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testTurnAroundThreeIntsLengthTooBig() {
    int[] array = {1, 2, 3, 4};
    arrUtils.turnAroundThreeInts(array);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testTurnAroundThreeIntsLengthTooSmall() {
    int[] array = {1, 2};
    arrUtils.turnAroundThreeInts(array);
  }

}
