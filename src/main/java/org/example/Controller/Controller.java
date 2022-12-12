package org.example.Controller;

import org.example.Metod.*;
import org.example.View.UserView;

public class Controller {
    public Controller() {

    }

    UserView userView = new UserView();
    FiguresRepository figuresRepository = new FiguresRepository();

    public void addCircle(Double radius){
        userView.printCircle(radius);
        figuresRepository.add(new Circle(radius));

    }
    public void addRectangle (Double first, Double second){
        userView.printRectangle(first, second);
        figuresRepository.add(new Rectangle(first, second));

    }
    public void addSquare(Double side){
        userView.printSquare(side);
        figuresRepository.add(new Square(side));
    }
    public void addTriangle (Double first, Double second, Double third) {
        userView.printTriangle(first, second, third);
        figuresRepository.add(new Triangle(first, second, third));
    }

    public  void printListFigures (){
        for (Object figure: figuresRepository.getFigureList()) {
            if(figure instanceof Circle){
                userView.printCircle(((Circle) figure).getRadius());
            } else  if(figure instanceof Square){
                userView.printSquare(((Square) figure).getSide());
            } else if(figure instanceof Rectangle){
                userView.printRectangle(((Rectangle) figure).getFirst(),((Rectangle) figure).getSecond());
            }  else if(figure instanceof Triangle){
                userView.printTriangle(((Triangle) figure).getFirst(),((Triangle) figure).getSecond(), ((Triangle) figure).getThird());
            }
        }
    }

    public void allArea (){
        double area = figuresRepository.allArea();
        userView.allArea(area);
    }
    public  void  allPerimetr(){
        double perim = figuresRepository.allPerimetrs();
        userView.allPerimetr(perim);
    }

}
