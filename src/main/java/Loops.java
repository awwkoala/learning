public class Loops {

    //    Utwórz metodę pobierającą dodatnią liczbę całkowitą X, która wyświetli na ekranie liczby od zera do X
    public void displayIntsUntil(int x) {
        int[] intList = new int[x + 1];
        for (int i = 0; i <= x; i++) {
            System.out.println(intList[i] = i);
        }
    }

    //    Utwórz metodę, która pobierze liczbę i wypisze każdy znak w osobnej linii zaczynając
//    od ostatniej cyfry (np. dla liczby 123 będą to trzy linie z 3, 2 i 1)
    public void turnedAroundIntsSeparateLines(int a) {
        String[] separateInt = (a + "").split("");
        for (int i = separateInt.length - 1; i >= 0; i--) {
            System.out.println(separateInt[i]);
        }
    }

    //    Utwórz metodę, która jako argument pobierze obiekt klasy String i zwróci "odwrócony" argument.
//    Na przykład "pies" przekształci w "seip"
    public String turnedAroundString(String word) {
        String wordTurned = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            wordTurned = wordTurned + word.charAt(i);
        }
        return wordTurned;
    }

    //    Utwórz metodę, która pobierze liczbę oraz zwróci ją w formie binarnej (2 => "10", 4 => "100", 5 => "101", itd.).
    public String intToBinary(int a) {
        String binary = "";
        while (a > 0) {
            int remainder;
            remainder = a % 2;
            binary = binary + remainder;
            a = a / 2;
        }
        binary = turnedAroundString(binary);
        return binary;
    }

    //    Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem. Np. "kajak" jest
//    palindromem (to samo czytane "od przodu i od tyłu") jednak "kotek" już nie.
//    Może przydać Ci się metoda String#toCharArray
    public boolean palindrome(String word) {
        boolean isPalindrome = true;
        char[] wordChArr = word.toCharArray();
        for (int i = 0; i < wordChArr.length; i++) {
            if (wordChArr[i] != wordChArr[wordChArr.length - i - 1]) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }

    //    Napisz metodę, która pobierze tablicę liczb całkowitych i wyświetli ją w postaci "[liczba, liczba, liczba]"
    public String displayInts(int[] intTable) {
        String intsString = "[";
        for (int i = 0; i < intTable.length; i++) {
            intsString = intsString + intTable[i] + ", ";
            if (i == intTable.length - 1) {
                intsString = intsString.substring(0, intsString.length() - 2);
                intsString = intsString + "]";
            }
        }
        return intsString;
    }

    //    Napisz metodę, która pobierze tablicę liczb całkowitych i posortuje ją w kolejności od najmniejszej
//    do największej liczby. Jednym z podstawowych algorytmów sortowania jest sortowanie bąbelkowe.
    public int[] sortIntTable(int[] intTable) {
        for (int i = 0; i < intTable.length; i++) {
            for (int j = i + 1; j < intTable.length; j++) {
                if (intTable[i] > intTable[j]) {
                    int temporary = intTable[i];
                    intTable[i] = intTable[j];
                    intTable[j] = temporary;
                }
            }
        }
        return intTable;
    }
}
