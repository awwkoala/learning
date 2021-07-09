package basic;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoopsTest {

  private Loops loops;

  @BeforeClass
  public void beforeClass() {
    loops = new Loops();
  }

  @Test
  public void testPrintIntsUntilPositiveNum() {
    int a = 5;
    String expectedString = "0 1 2 3 4 5 ";
    String actualString = loops.printIntsUntil(a);
    Assert.assertEquals(actualString, expectedString);
  }

  @Test
  public void testPrintIntsUntilZero() {
    int a = 0;
    String expectedString = "Method only works for positive numbers.";
    String actualString = loops.printIntsUntil(a);
    Assert.assertEquals(actualString, expectedString);
  }

  @Test
  public void testPrintIntsUntilNegativeNum() {
    int a = -5;
    String expectedString = "Method only works for positive numbers.";
    String actualString = loops.printIntsUntil(a);
    Assert.assertEquals(actualString, expectedString);
  }

  @Test
  public void testTurnedAroundIntsSeparateLines() {
    int a = 1234;
    String expectedResult = "4\n3\n2\n1\n";
    String actualResult = loops.turnedAroundIntsSeparateLines(a);
    Assert.assertEquals(actualResult, expectedResult);
  }

  @Test
  public void testTurnedAroundIntsSeparateLinesOnlyOne() {
    int a = 3;
    String expectedResult = "3\n";
    String actualResult = loops.turnedAroundIntsSeparateLines(a);
    Assert.assertEquals(actualResult, expectedResult);
  }

  @Test
  public void testTurnedAroundString() {
    String word = "abcdef";
    StringBuffer expectedString = new StringBuffer("fedcba");
    StringBuffer actualString = loops.turnedAroundString(word);
    Assert.assertEquals(actualString.toString(), expectedString.toString());
  }

  @Test
  public void testIntToBinaryPositiveNum() {
    int a = 12;
    String expectedBinary = Integer.toBinaryString(a);
    String actualBinary = loops.intToBinary(a);
    Assert.assertEquals(actualBinary, expectedBinary);
  }

  @Test
  public void testIntToBinaryZero() {
    int a = 0;
    String expectedBinary = Integer.toBinaryString(a);
    String actualBinary = loops.intToBinary(a);
    Assert.assertEquals(actualBinary, expectedBinary);
  }

  @Test(expectedExceptions = {RuntimeException.class})
  public void testIntToBinaryNegativeNum() {
    int a = -12;
    String actualBinary = loops.intToBinary(a);
  }

  @Test
  public void testPalindromeTrueEven() {
    String palindrome = "abccba";
    Assert.assertTrue(loops.palindrome(palindrome));
  }

  @Test
  public void testPalindromeTrueOdd() {
    String palindrome = "abcba";
    Assert.assertTrue(loops.palindrome(palindrome));
  }

  @Test
  public void testPalindromeFalseEven() {
    String notPalindrome = "abcdef";
    Assert.assertFalse(loops.palindrome(notPalindrome));
  }

  @Test
  public void testPalindromeFalseOdd() {
    String notPalindrome = "abcde";
    Assert.assertFalse(loops.palindrome(notPalindrome));
  }

  @Test
  public void testPalindromeEmpty() {
    String palindrome = "";
    Assert.assertTrue(loops.palindrome(palindrome));
  }

  @Test
  public void testPrintInts() {
    int[] array = {1, 2, 3, 4, 5};
    String expectedResult = "[1, 2, 3, 4, 5]";
    String actualResult = loops.printInts(array);
    Assert.assertEquals(actualResult, expectedResult);
  }

  @Test
  public void testPrintIntsOnlyOne() {
    int[] array = {1};
    String expectedResult = "[1]";
    String actualResult = loops.printInts(array);
    Assert.assertEquals(actualResult, expectedResult);
  }

  @Test
  public void testSortArrayPositiveNum() {
    int[] testingArray = {5, 4, 3, 2, 1};
    int[] expectedArray = {1, 2, 3, 4, 5};
    int[] actualArray = loops.sortArray(testingArray);
    Assert.assertEquals(actualArray, expectedArray);
  }

  @Test
  public void testSortArrayNegativeNum() {
    int[] testingArray = {-1, -2, -3, -4, -5};
    int[] expectedArray = {-5, -4, -3, -2, -1};
    int[] actualArray = loops.sortArray(testingArray);
    Assert.assertEquals(actualArray, expectedArray);
  }

  @Test
  public void testSortArrayPosNegNum() {
    int[] testingArray = {2, 1, 0, -2, -1};
    int[] expectedArray = {-2, -1, 0, 1, 2};
    int[] actualArray = loops.sortArray(testingArray);
    Assert.assertEquals(actualArray, expectedArray);
  }

}
