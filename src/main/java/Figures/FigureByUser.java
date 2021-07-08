package Figures;

import java.util.Scanner;

public class FigureByUser {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the circle's radius: ");
    double r = Integer.parseInt(scan.nextLine());
    Circle circle = new Circle(r);
    System.out.println("Enter legs of the right triangle: ");
    double a = Integer.parseInt(scan.nextLine());
    double b = Integer.parseInt(scan.nextLine());
    Triangle triangle = new Triangle(a, b);
    System.out.println("Enter sides of the rectangle: ");
    double c = Integer.parseInt(scan.nextLine());
    double d = Integer.parseInt(scan.nextLine());
    Rectangle rectangle = new Rectangle(c, d);
    Figure[] figureTab = new Figure[3];
    figureTab[0] = circle;
    figureTab[1] = triangle;
    figureTab[2] = rectangle;
    for (int i = 0; i < figureTab.length; i++) {
      System.out.println("Perimeter of the figure is: " + figureTab[i].getPerimeter());
      System.out.println("Area of the figure is: " + figureTab[i].getArea());
    }
  }

}
