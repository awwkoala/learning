public class ArrayFactory {
    //    Napisz klasę ArrayFactory, która w konstruktorze pobierze liczbę całkowitą X. Klasa powinna mieć 2 metody:
//    int[] oneDimension – zwróci instancję tablicy jednowymiarowej o długości X,
//    int[][] twoDimension – zwróci instację tablicy dwuwymiarowej gdzie liczba wierszy i liczba kolumn równa się X
//    Do klasy ArrayFactory dodaj metodę zwracającą macierz jednostkową (jedynki "na przekątnej")
    private int x;

    public ArrayFactory(int x) {
        this.x = x;
    }

    public int[] oneDimension() {
        int[] oneDim = new int[x];
        return oneDim;
    }

    public int[][] twoDimension() {
        int[][] twoDim = new int[x][x];
        return twoDim;
    }

    public int[][] matrix() {
        int[][] matrix = twoDimension();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}
