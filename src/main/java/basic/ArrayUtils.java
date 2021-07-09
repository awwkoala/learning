package basic;

public class ArrayUtils {
  //    Napisz metodę, która zwróci tablicę String[] zawierającą pierwsze 5 liter alfabetu
  public String[] firstFiveLetters() {
    String[] fiveLetters = new String[5];
    for (int i = 0; i < 5; i++) {
      fiveLetters[i] = String.valueOf((char) ('a' + i));
    }
    return fiveLetters;
  }

  //    Napisz metodę pobierającą trójelementową tablicę liczb, która zwróci tablicę zawierającą te same elementy w odwróconej kolejności
  public int[] turnAroundThreeInts(int[] arrayOfThree) {
    if (arrayOfThree.length != 3) {
      throw new IllegalArgumentException("This method only works for arrays of three elements.");
    }
    int[] arrayTurned = new int[3];
    for (int i = 0; i <= arrayOfThree.length - 1; i++) {
      arrayTurned[i] = arrayOfThree[arrayOfThree.length - 1 - i];
    }
    return arrayTurned;
  }

}
