package Basics;

public class ArrayFactory {
  //    Napisz klasę Basics.ArrayFactory, która w konstruktorze pobierze liczbę całkowitą X. Klasa powinna mieć 2 metody:
//    int[] oneDimension – zwróci instancję tablicy jednowymiarowej o długości X,
//    int[][] twoDimension – zwróci instację tablicy dwuwymiarowej gdzie liczba wierszy i liczba kolumn równa się X
//    Do klasy Basics.ArrayFactory dodaj metodę zwracającą macierz jednostkową (jedynki "na przekątnej")
  private final int x;

  public ArrayFactory(int x) {
    this.x = x;
  }

  public int[] oneDimension() {
    return new int[x];
  }

  public int[][] twoDimension() {
    return new int[x][x];
  }

  public int[][] matrix() {
    int[][] matrix = twoDimension();
    for (int i = 0; i < x; i++) {
      if (i == i) {
        matrix[i][i] = 1;
      }
    }
    return matrix;
  }

}
