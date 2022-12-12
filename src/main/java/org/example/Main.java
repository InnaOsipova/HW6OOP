package org.example;

import org.example.Controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.addCircle(3.0);
        controller.addRectangle(4.0,5.0);
        controller.addSquare(4.0);
        controller.addTriangle(3.0, 4.0, 5.0);
        controller.allArea();
        controller.allPerimetr();
        controller.printListFigures();
    }
}