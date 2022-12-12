package org.example.View;
import org.example.Metod.*;

import java.util.List;

//import java.util.Scanner;

public class UserView {
    Circle circle;
    Rectangle rectangle;
    Square square;
    Triangle triangle;
    FiguresRepository figuresRepository;

    public void printCircle(Double radius){
        circle = new Circle(radius);
        System.out.printf("Круг - радиус: %.2f, площадь : %.2f, окружность :  %.2f%n", radius, circle.getArea(), circle.lengtHable());
    }
    public void printRectangle (Double first, Double second){
        rectangle = new Rectangle(first,second);
        System.out.printf("Прямоугольник - сторона 1: %.2f, Сторона 2: %.2f, площадь: %.2f, периметр: %.2f%n", first, second, rectangle.getArea(), rectangle.perimetr());

    }
    public void printSquare(Double side){
        square = new Square(side);
        System.out.printf("Квадрат - сторона  %.2f: , площадь: %.2f, периметр: %.2f%n", side, square.getArea(), square.perimetr());
    }
    public void printTriangle (Double first, Double second, Double third){
        triangle = new Triangle(first, second, third);
        System.out.printf("Треугольник - сторона 1 %.2f:, сторона 2: %.2f, сторона 3: %.2f, площадь: %.2f, периметр: %.2f%n",first, second, third, triangle.getArea(), triangle.perimetr() );
    }
    public void allArea (Double area){

        System.out.printf("Площадь всех фигур : %.2f%n", area);
    }
    public  void  allPerimetr(double perim){
        System.out.printf("Периметр всех фигур  : %.2f%n", perim);
    }
}
