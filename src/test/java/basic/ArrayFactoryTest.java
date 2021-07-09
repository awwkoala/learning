package basic;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayFactoryTest {

  private ArrayFactory arrFacPosNum;
  private ArrayFactory arrFacZero;
  private ArrayFactory arrFacNegNum;
  private int a = 3;
  private int b = 0;
  private int c = -3;

  @BeforeClass
  public void beforeClass() {
    arrFacPosNum = new ArrayFactory(a);
    arrFacZero = new ArrayFactory(b);
    arrFacNegNum = new ArrayFactory(c);
  }

  @Test
  public void testOneDimensionPositiveNum() {
    int[] expectedArr = new int[a];
    int[] actualArr = arrFacPosNum.oneDimension();
    Assert.assertEquals(actualArr, expectedArr);
  }

  @Test
  public void testOneDimensionZero() {
    int[] expectedArr = new int[b];
    int[] actualArr = arrFacZero.oneDimension();
    Assert.assertEquals(actualArr, expectedArr);
  }

  @Test(expectedExceptions = {RuntimeException.class})
  public void testOneDimensionNegativeNum() {
    arrFacNegNum.oneDimension();
  }

  @Test
  public void testTwoDimensionPositiveNum() {
    int[][] expectedArr = new int[a][a];
    int[][] actualArr = arrFacPosNum.twoDimension();
    Assert.assertEquals(actualArr, expectedArr);
  }

  @Test
  public void testTwoDimensionZero() {
    int[][] expectedArr = new int[b][b];
    int[][] actualArr = arrFacZero.twoDimension();
    Assert.assertEquals(actualArr, expectedArr);
  }

  @Test(expectedExceptions = {RuntimeException.class})
  public void testTwoDimensionNegativeNum() {
    arrFacNegNum.twoDimension();
  }

  @Test
  public void testMatrixPositiveNum() {
    int[][] expectedArr = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
    int[][] actualArr = arrFacPosNum.matrix();
    Assert.assertEquals(actualArr, expectedArr);
  }

  @Test
  public void testMatrixZero() {
    int[][] expectedArr = {};
    int[][] actualArr = arrFacZero.matrix();
    Assert.assertEquals(actualArr, expectedArr);
  }

  @Test(expectedExceptions = {RuntimeException.class})
  public void testMatrixNegativeNum() {
    int[][] actualArr = arrFacNegNum.matrix();
  }

}
