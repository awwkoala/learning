package com.github.awwkoala.learning.figure;

public interface Figure {
  //    InterfejsyPermalink
//    Stwórz interfejs Figures.Figure. Interfejs powinien zawierać metody getPerimeter (zwracającą obwód) oraz getArea
//    (zwracającą powierzchnię). Następnie utwórz klasy Figures.Circle, Figures.Triangle i Figures.Rectangle,
//    niech każda z klas implementuje interfejs Figures.Figure. Napisz program, który pobierze od użytkownika:
//    długość promienia koła,
//    2 długości boków trójkąta prostokątnego (boki przy kącie prostym),
//    długość boków prostokąta.
//    Utworzy instancje tych obiektów i umieści je w tablicy Figures.Figure[].
//    Następnie iterując po obiektach wyświetl pole oraz obwód aktualnego obiektu.
  double getPerimeter();

  double getArea();

}
