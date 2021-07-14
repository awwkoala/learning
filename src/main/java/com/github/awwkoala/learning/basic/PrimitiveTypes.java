package com.github.awwkoala.learning.basic;

import java.util.Arrays;
import java.util.Scanner;

public class PrimitiveTypes {
  Scanner scan = new Scanner(System.in);
  Loops loops = new Loops();

  //    Napisz program, który pobierze od użytkownika liczbę całkowitą, a następnie wyświetli jej binarną
//    reprezentację na ekranie
  public void decimalToBinary() {
    System.out.println("Enter the Integer: ");
    try {
      String bin = loops.intToBinary(Integer.parseInt(scan.nextLine()));
      System.out.println("Binary: " + bin);
    } catch (java.lang.NumberFormatException e) {
      System.out.println("Invalid format");
    }
  }

  //    Napisz program, który pobierze od użytkownika liczbę całkowitą N reprezentującą długość tablicy,
//    a następnie poprosi o N kolejnych liczb uzupełniając nimi wcześniej stworzoną tablicę.
//    Wyświetl na konsoli tablicę posortowaną w kolejności od najmniejszej do największej liczby,
  public void createArray() {
    int[] array = new int[0];
    try {
      System.out.println("Enter the lenght of your array: ");
      int n = Integer.parseInt(scan.nextLine());
      array = Arrays.copyOf(array, n);
      System.out.println("Enter the numbers one by one: ");
      for (int i = 0; i < n; i++) {
        array[i] = Integer.parseInt(scan.nextLine());
      }
      loops.sortArray(array);
      System.out.println(Arrays.toString(array));
    } catch (java.lang.NumberFormatException e) {
      System.out.println("Invalid format");
    }
  }

  //    Napisz program, który pobierze od użytkownika łańcuch znaków i wyświetli na konsoli jego długość, informację
//    czy jest to palindrom czy nie oraz jego odwróconą wartość.
  public void stringInspector() {
    System.out.println("Enter the string you wish to inspect: ");
    String stringToInspect = scan.nextLine();
    System.out.println("Your string's parameters are: ");
    System.out.println("Length: " + stringToInspect.length());
    System.out.println("Is it a palindrome? " + loops.palindrome(stringToInspect));
    System.out.println("Reversed: " + loops.turnedAroundString(stringToInspect));
  }

}
