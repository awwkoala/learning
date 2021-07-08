public class Tables {
    //    Napisz metodę, która zwróci tablicę String[] zawierającą pierwsze 5 liter alfabetu
    public String[] firstFiveLetters() {
        String[] fiveLetters = new String[5];
        char[] fiveChars = new char[6];
        int i = 0;
        while (i <= 4) {
            fiveChars[i] = (char) ('a' + i);
            fiveLetters[i] = String.valueOf(fiveChars[i]);
            i++;
        }
        return fiveLetters;
    }

    //    Napisz metodę pobierającą trójelementową tablicę liczb, która zwróci tablicę zawierającą te same elementy w odwróconej kolejności
    public int[] turnAroundThreeInts(int a, int b, int c) {
        int[] threeInts = {a, b, c};
        int[] threeIntsTurned = new int[3];
        int i = 0, j = 2;
        while (i <= 2 && j >= 0) {
            threeIntsTurned[i] = threeInts[j];
            i++;
            j--;
        }
        return threeIntsTurned;
    }
}
