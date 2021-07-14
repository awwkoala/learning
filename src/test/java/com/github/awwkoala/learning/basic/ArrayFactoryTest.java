package com.github.awwkoala.learning.basic;

import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayFactoryTest {

  private ArrayFactory arrFacPosNum;
  private ArrayFactory arrFacZero;
  private ArrayFactory arrFacNegNum;
  private final int a = 3;
  private final int b = 0;
  private final int c = -3;

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
    Assertions.assertThat(actualArr).describedAs("1D array is created correctly").isEqualTo(expectedArr);
  }

  @Test
  public void testOneDimensionZero() {
    int[] expectedArr = new int[b];
    int[] actualArr = arrFacZero.oneDimension();
    Assertions.assertThat(actualArr).describedAs("empty 1D array is created").isEqualTo(expectedArr);
  }

  @Test(expectedExceptions = {NegativeArraySizeException.class})
  public void testOneDimensionNegativeNum() {
    arrFacNegNum.oneDimension();
  }

  @Test
  public void testTwoDimensionPositiveNum() {
    int[][] expectedArr = new int[a][a];
    int[][] actualArr = arrFacPosNum.twoDimension();
    Assertions.assertThat(actualArr).describedAs("2D array is created correctly").isEqualTo(expectedArr);
  }

  @Test
  public void testTwoDimensionZero() {
    int[][] expectedArr = new int[b][b];
    int[][] actualArr = arrFacZero.twoDimension();
    Assertions.assertThat(actualArr).describedAs("empty 2D array is created").isEqualTo(expectedArr);
  }

  @Test(expectedExceptions = {NegativeArraySizeException.class})
  public void testTwoDimensionNegativeNum() {
    arrFacNegNum.twoDimension();
  }

  @Test
  public void testMatrixPositiveNum() {
    int[][] expectedArr = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
    int[][] actualArr = arrFacPosNum.matrix();
    Assertions.assertThat(actualArr).describedAs("identity matrix is created corretly").isEqualTo(expectedArr);
  }

  @Test
  public void testMatrixZero() {
    int[][] expectedArr = {};
    int[][] actualArr = arrFacZero.matrix();
    Assertions.assertThat(actualArr).describedAs("empty identity matrix is created").isEqualTo(expectedArr);
  }

  @Test(expectedExceptions = {NegativeArraySizeException.class})
  public void testMatrixNegativeNum() {
    int[][] actualArr = arrFacNegNum.matrix();
  }

}
