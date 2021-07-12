package com.github.awwkoala.learning.basic;

import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoopsTest {

  private Loops loops;
  private final int a = 5;
  private final int b = 0;
  private final int c = -5;
  private final int d = 123;

  @BeforeClass
  public void beforeClass() {
    loops = new Loops();
  }

  @Test
  public void testPrintIntsUntilPositiveNum() {
    String expectedString = "0 1 2 3 4 5 ";
    String actualString = loops.printIntsUntil(a);
    Assertions.assertThat(actualString).describedAs("integers from 0 to " + a + " are printed")
      .isEqualTo(expectedString);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testPrintIntsUntilZero() {
    loops.printIntsUntil(b);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testPrintIntsUntilNegativeNum() {
    loops.printIntsUntil(c);
  }

  @Test
  public void testTurnedAroundIntsSeparateLines() {
    String expectedResult = "3\n2\n1\n";
    String actualResult = loops.turnedAroundIntsSeparateLines(d);
    Assertions.assertThat(actualResult)
      .describedAs("every character of the integer %d is printed on a separate line", d)
      .isEqualTo(expectedResult);
  }

  @Test
  public void testTurnedAroundIntsSeparateLinesOnlyOne() {
    String expectedResult = "5\n";
    String actualResult = loops.turnedAroundIntsSeparateLines(a);
    Assertions.assertThat(actualResult)
      .describedAs("provided integer with one character is printed on a separate line")
      .isEqualTo(expectedResult);
  }

  @Test
  public void testTurnedAroundString() {
    String word = "abcdef";
    String expectedString = "fedcba";
    String actualString = loops.turnedAroundString(word);
    Assertions.assertThat(actualString).describedAs(word + " is reversed").isEqualTo(expectedString);
  }

  @Test
  public void testIntToBinaryPositiveNum() {
    String expectedBinary = Integer.toBinaryString(a);
    String actualBinary = loops.intToBinary(a);
    Assertions.assertThat(actualBinary).describedAs(a + " is converted to binary").isEqualTo(expectedBinary);
  }

  @Test
  public void testIntToBinaryZero() {
    String expectedBinary = Integer.toBinaryString(b);
    String actualBinary = loops.intToBinary(b);
    Assertions.assertThat(actualBinary).describedAs(b + " is converted to 0").isEqualTo(expectedBinary);
  }

  @Test(expectedExceptions = {RuntimeException.class})
  public void testIntToBinaryNegativeNum() {
    loops.intToBinary(c);
  }

  @Test
  public void testPalindromeTrueEven() {
    String palindrome = "abccba";
    Assertions.assertThat(loops.palindrome(palindrome)).describedAs(palindrome + " is a palindrome").isTrue();
  }

  @Test
  public void testPalindromeTrueOdd() {
    String palindrome = "abcba";
    Assertions.assertThat(loops.palindrome(palindrome)).describedAs(palindrome + " is a palindrome").isTrue();
  }

  @Test
  public void testPalindromeFalseEven() {
    String notPalindrome = "abcdef";
    Assertions.assertThat(loops.palindrome(notPalindrome)).describedAs(notPalindrome + " is not a palindrome")
      .isFalse();
  }

  @Test
  public void testPalindromeFalseOdd() {
    String notPalindrome = "abcde";
    Assertions.assertThat(loops.palindrome(notPalindrome)).describedAs(notPalindrome + " is not a palindrome")
      .isFalse();
  }

  @Test
  public void testPalindromeEmpty() {
    String palindrome = "";
    Assertions.assertThat(loops.palindrome(palindrome)).describedAs("empty String is a palindrome").isTrue();
  }

  @Test
  public void testPrintInts() {
    int[] array = {1, 2, 3, 4, 5};
    String expectedResult = "[1, 2, 3, 4, 5]";
    String actualResult = loops.printInts(array);
    Assertions.assertThat(actualResult).describedAs("integers array is printed as " + expectedResult)
      .isEqualTo(expectedResult);
  }

  @Test
  public void testPrintIntsOnlyOne() {
    int[] array = {1};
    String expectedResult = "[1]";
    String actualResult = loops.printInts(array);
    Assertions.assertThat(actualResult)
      .describedAs("integers array with only one component is printed as " + expectedResult)
      .isEqualTo(expectedResult);
  }

  @Test
  public void testSortArrayPositiveNum() {
    int[] testingArray = {5, 4, 3, 2, 1};
    int[] expectedArray = {1, 2, 3, 4, 5};
    int[] actualArray = loops.sortArray(testingArray);
    Assertions.assertThat(actualArray)
      .describedAs("integers array with only positive numbers is sorted from minimum to maximum value")
      .isEqualTo(expectedArray);
  }

  @Test
  public void testSortArrayNegativeNum() {
    int[] testingArray = {-1, -2, -3, -4, -5};
    int[] expectedArray = {-5, -4, -3, -2, -1};
    int[] actualArray = loops.sortArray(testingArray);
    Assertions.assertThat(actualArray)
      .describedAs("integers array with only negative numbers is sorted from minimum to maximum value")
      .isEqualTo(expectedArray);
  }

  @Test
  public void testSortArrayPosNegNum() {
    int[] testingArray = {2, 1, 0, -2, -1};
    int[] expectedArray = {-2, -1, 0, 1, 2};
    int[] actualArray = loops.sortArray(testingArray);
    Assertions.assertThat(actualArray)
      .describedAs("integers array with both negative and positive numbers is sorted from minimum to maximum value")
      .isEqualTo(expectedArray);
  }

}
