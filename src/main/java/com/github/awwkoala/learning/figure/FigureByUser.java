package com.github.awwkoala.learning.figure;

import java.util.Scanner;

public class FigureByUser {
  Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    FigureByUser figure = new FigureByUser();
    Circle c = figure.createCircle();
    Triangle t = figure.createTriangle();
    Rectangle r = figure.createRectangle();
    Figure[] figArr = figure.createFigureArray(c, t, r);
    figure.printAllFigures(figArr);
  }

  public Circle createCircle() {
    System.out.println("Enter the circle's radius: ");
    double r = Integer.parseInt(scan.nextLine());
    return new Circle(r);
  }

  public Triangle createTriangle() {
    System.out.println("Enter legs of the right triangle: ");
    double a = Integer.parseInt(scan.nextLine());
    double b = Integer.parseInt(scan.nextLine());
    return new Triangle(a, b);
  }

  public Rectangle createRectangle() {
    System.out.println("Enter sides of the rectangle: ");
    double c = Integer.parseInt(scan.nextLine());
    double d = Integer.parseInt(scan.nextLine());
    return new Rectangle(c, d);
  }

  public Figure[] createFigureArray(Circle circle, Triangle triangle, Rectangle rectangle) {
    Figure[] figureArray = new Figure[3];
    figureArray[0] = circle;
    figureArray[1] = triangle;
    figureArray[2] = rectangle;
    return figureArray;
  }

  public void printAllFigures(Figure[] figureArray) {
    for (int i = 0; i < figureArray.length; i++) {
      System.out.println("Perimeter of the figure is: " + figureArray[i].getPerimeter());
      System.out.println("Area of the figure is: " + figureArray[i].getArea());
    }
  }

}
