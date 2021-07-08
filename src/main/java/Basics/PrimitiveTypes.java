package Basics;

import java.util.Scanner;

public class PrimitiveTypes {
  Scanner scan = new Scanner(System.in);
  Loops loops = new Loops();

  //    Napisz program, który pobierze od użytkownika liczbę całkowitą, a następnie wyświetli jej binarną
//    reprezentację na ekranie
  public void decimalToBinary() {
    System.out.println("Enter the Integer: ");
    String bin = loops.intToBinary(Integer.parseInt(scan.nextLine()));
    System.out.println("Binary: " + bin);
  }

  //    Napisz program, który pobierze od użytkownika liczbę całkowitą N reprezentującą długość tablicy,
//    a następnie poprosi o N kolejnych liczb uzupełniając nimi wcześniej stworzoną tablicę.
//    Wyświetl na konsoli tablicę posortowaną w kolejności od najmniejszej do największej liczby,
  public int[] createArray() {
    System.out.println("Enter the lenght of your array: ");
    int n = Integer.parseInt(scan.nextLine());
    int[] array = new int[n];
    System.out.println("Enter the numbers one by one: ");
    for (int i = 0; i < n; i++) {
      array[i] = Integer.parseInt(scan.nextLine());
    }
    loops.sortArray(array);
    return array;
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
