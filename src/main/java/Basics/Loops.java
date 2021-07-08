package Basics;

public class Loops {

  //    Utwórz metodę pobierającą dodatnią liczbę całkowitą X, która wyświetli na ekranie liczby od zera do X
  public void printIntsUntil(int x) {
    for (int i = 0; i <= x; i++) {
      System.out.println(i);
    }
  }

  //    Utwórz metodę, która pobierze liczbę i wypisze każdy znak w osobnej linii zaczynając
//    od ostatniej cyfry (np. dla liczby 123 będą to trzy linie z 3, 2 i 1)
  public void turnedAroundIntsSeparateLines(int a) {
    char[] separateInt = String.valueOf(a).toCharArray();
    for (int i = separateInt.length - 1; i >= 0; i--) {
      System.out.println(separateInt[i]);
    }
  }

  //    Utwórz metodę, która jako argument pobierze obiekt klasy String i zwróci "odwrócony" argument.
//    Na przykład "pies" przekształci w "seip"
  public StringBuffer turnedAroundString(String word) {
    StringBuffer wordTurned = new StringBuffer(word);
    wordTurned.reverse();
    return wordTurned;
  }

  //    Utwórz metodę, która pobierze liczbę oraz zwróci ją w formie binarnej (2 => "10", 4 => "100", 5 => "101", itd.).
  public String intToBinary(int a) {
    String binary = "";
    for (int i = a; i > 0; i = i / 2) {
      binary += i % 2;
    }
    return turnedAroundString(binary).toString();
  }

  //    Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem. Np. "kajak" jest
//    palindromem (to samo czytane "od przodu i od tyłu") jednak "kotek" już nie.
//    Może przydać Ci się metoda String#toCharArray
  public boolean palindrome(String word) {
    char[] wordChArr = word.toCharArray();
    for (int i = 0; i < wordChArr.length / 2; i++) {
      if (wordChArr[i] != wordChArr[wordChArr.length - i - 1]) {
        return false;
      }
    }
    return true;
  }

  //    Napisz metodę, która pobierze tablicę liczb całkowitych i wyświetli ją w postaci "[liczba, liczba, liczba]"
  public String printInts(int[] intTable) {
    String intsString = "[";
    for (int i = 0; i < intTable.length - 1; i++) {
      intsString = intsString + intTable[i] + ", ";
    }
    intsString += intTable[intTable.length - 1] + "]";
    return intsString;
  }

  //    Napisz metodę, która pobierze tablicę liczb całkowitych i posortuje ją w kolejności od najmniejszej
//    do największej liczby. Jednym z podstawowych algorytmów sortowania jest sortowanie bąbelkowe.
  public int[] sortArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] > array[j]) {
          int temporary = array[i];
          array[i] = array[j];
          array[j] = temporary;
        }
      }
    }
    return array;
  }

}
